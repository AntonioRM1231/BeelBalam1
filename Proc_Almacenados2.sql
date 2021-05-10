USE BEEL_BALAM;

--PARA UPDATE EN CASCADA
ALTER TABLE RESERVA WITH CHECK ADD  CONSTRAINT [FK_RESERVA-USUARIO] FOREIGN KEY(NOMBRE_U)
REFERENCES USUARIO (NOMBRE_U)
ON UPDATE CASCADE
GO

DROP PROCEDURE EDITAR_USUARIO
CREATE PROCEDURE EDITAR_USUARIO(
--falta validar el newNombre, newContraseña,newCorreo,newCel,newNumeroTarjeta

@u_nombre VARCHAR (25),
--nuevos datos del usuario
@u_newNombre VARCHAR (25),
@u_newContraseña VARCHAR (20),
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
			IF (@u_newContraseña IS NOT NULL)
				BEGIN
					UPDATE USUARIO SET CONTRASENIA_U = @u_newContraseña WHERE NOMBRE_U = @u_nombre;	
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
