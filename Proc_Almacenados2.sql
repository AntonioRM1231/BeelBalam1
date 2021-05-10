USE BEEL_BALAM;

--PARA UPDATE EN CASCADA
ALTER TABLE RESERVA WITH CHECK ADD  CONSTRAINT [FK_RESERVA-USUARIO] FOREIGN KEY(NOMBRE_U)
REFERENCES USUARIO (NOMBRE_U)
ON UPDATE CASCADE
GO

CREATE PROCEDURE EDITAR_USUARIO(
--falta validar el newNombre, newContrase�a,newCorreo,newCel,newNumeroTarjeta

@u_nombre VARCHAR (25),
--nuevos datos del usuario
@u_newNombre VARCHAR (25),
@u_newContrase�a VARCHAR (20),
@u_newCorreo VARCHAR (35),
@u_newCel VARCHAR (14),
--datos de la nueva tarjeta
@u_newNumeroTarjeta VARCHAR (17),
@t_cvc INT,
@t_primerNombre VARCHAR (15),
@t_segundoNombre VARCHAR (15),
@t_primerApellido VARCHAR (15),
@t_segundoApellido VARCHAR (15),
@t_fechaVigencia INT
)
AS 
BEGIN 
	IF EXISTS (SELECT NOMBRE_U FROM USUARIO WHERE NOMBRE_U = @u_nombre)
		BEGIN
			IF (@u_newContrase�a IS NOT NULL)
				BEGIN
					UPDATE USUARIO SET CONTRASENIA_U = @u_newContrase�a WHERE NOMBRE_U = @u_nombre;	
				END
			IF (@u_newCorreo IS NOT NULL)
				BEGIN
					UPDATE USUARIO SET CORREO_U = @u_newCorreo WHERE NOMBRE_U = @u_nombre;	
				END
			IF (@u_newCel IS NOT NULL)
				BEGIN
					UPDATE USUARIO SET NUM_CEL_U = @u_newCel WHERE NOMBRE_U = @u_nombre;	
				END
			IF (@u_newNumeroTarjeta IS NOT NULL)
				BEGIN
					IF EXISTS (SELECT NUM_TARJETA FROM TARJETA WHERE NUM_TARJETA = @u_newNumeroTarjeta)--ya existe la tarjeta
						BEGIN
							UPDATE USUARIO SET NUM_TARJETA_U = @u_newNumeroTarjeta WHERE NOMBRE_U = @u_nombre;
						END
					ELSE 
						BEGIN--no existe la tarjeta
							--se registra la tarjeta
							INSERT INTO TARJETA
							VALUES (@t_cvc,@t_primerNombre,@t_segundoNombre,@t_primerApellido,@t_segundoApellido,@t_fechaVigencia,@u_newNumeroTarjeta);
							--actualiza
							UPDATE USUARIO SET NUM_TARJETA_U = @u_newNumeroTarjeta WHERE NOMBRE_U = @u_nombre; 
						END
				END
			IF (@u_newNombre IS NOT NULL)
				BEGIN
					IF EXISTS (SELECT NOMBRE_U FROM USUARIO WHERE NOMBRE_U = @u_newNombre)
						BEGIN SELECT 'ERROR, ESE USUARIO YA EXISTE'; END
					ELSE 
						BEGIN 
							UPDATE USUARIO SET NOMBRE_U = @u_newNombre WHERE NOMBRE_U = @u_nombre;
						END
				END
		END
	ELSE
		BEGIN
			SELECT 'ERROR, ESE USUARIO NO EXISTE'; --esto no va a pasar ya que se va a eliminar desde el perfil
		END
END

--PRUEBA
EXECUTE EDITAR_USUARIO 'pollito',NULL,'CNSDKNC',NULL,'9987889234','1134567890123456',NULL,NULL,NULL,NULL,NULL,NULL

DROP PROCEDURE COMPRA_BOLETOS
CREATE PROCEDURE COMPRA_BOLETOS(
@c_primerNombre VARCHAR (15),--
@c_segundoNombre VARCHAR (15),--
@c_primerApellido VARCHAR (15),--
@c_segundoApellido VARCHAR (15),--
@c_edad INT,--
@c_nacionalidad VARCHAR (25),--
@matTren VARCHAR (25),--
@fechaReserva DATETIME,--
@u_nombre VARCHAR (25),--
@tr_nombre VARCHAR (25)--
)
AS
BEGIN
	IF((SELECT CAPACIDAD FROM TREN WHERE MAT_TREN = @matTren) > 0 )
		BEGIN
			DECLARE @nClientes INT;
			SET @nClientes = (SELECT COUNT(*) FROM CLIENTE)+1;
			--crea un cliente
			INSERT INTO CLIENTE
			VALUES(@nClientes,@c_primerNombre,@c_segundoNombre,@c_primerApellido,@c_segundoApellido,@c_edad,@c_nacionalidad);

			--genera una reserva
			DECLARE @nReservas INT;
			SET @nReservas = (SELECT COUNT(*) FROM RESERVA)+1;
			INSERT INTO RESERVA
			VALUES (@nReservas,@fechaReserva,@u_nombre,@tr_nombre,@nClientes,0.0);

			--actualiza la capacidad del tren
			UPDATE TREN SET CAPACIDAD = CAPACIDAD - 1 WHERE MAT_TREN = @matTren;

			--calcula el costo 
			DECLARE @costo INT;
			DECLARE @puntos INT;
			DECLARE @puntosAbonados INT;
			SET @costo = (SELECT COSTO_TR FROM TRAMO WHERE NOMBRE_TR = @tr_nombre);
			SET @puntos = (SELECT PTOS_ACUM_U FROM USUARIO WHERE NOMBRE_U = @u_nombre);

			IF (@puntos >= 100)
			BEGIN
				SET @puntosAbonados = 10*(@costo % 700); --puntos que se le van a abonar
				SET @costo = @costo - 300; --descuento
				SET @puntos = (@puntos-100) + @puntosAbonados; --disminuyen los puntos
		
				UPDATE USUARIO SET PTOS_ACUM_U = @puntos WHERE NOMBRE_U = @u_nombre;
			END
		END
	ELSE 
		BEGIN 
			SELECT 'NO HAY ASIENTOS DISPONIBLES'
		END
END

EXECUTE COMPRA_BOLETOS 'ISAIAS','YOSAHANDI','ANGEL',NULL,12,'MEXICANA','456FHS','12/10/21','pollito','TC2'

SELECT * FROM CLIENTE
