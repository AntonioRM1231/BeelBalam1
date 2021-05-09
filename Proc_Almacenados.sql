USE BEEL_BALAM;

CREATE PROCEDURE CREAR_USUARIO(
--datos usuario
@u_nombre VARCHAR(25),
@u_contraseña VARCHAR (20),
@u_correo VARCHAR (35),
@u_numCelular VARCHAR (14),
@u_ptos INT,
--datos tarjeta
@t_cvc INT,
@t_primerNombre VARCHAR(15),
@t_segundoNombre VARCHAR(15),
@t_primerApellido VARCHAR(15),
@t_segundoApellido VARCHAR(15),
@t_fechaVigencia INT,
@t_numero VARCHAR (17)
)
AS
BEGIN
	IF EXISTS (SELECT NOMBRE_U FROM USUARIO WHERE NOMBRE_U = @u_nombre)
		BEGIN 
				SELECT 'ESA USUARIO YA ESTÁ REGISTRADO';
		END 
	ELSE
	BEGIN 
		IF EXISTS (SELECT NUM_TARJETA FROM TARJETA WHERE NUM_TARJETA = @t_numero)
			BEGIN 
				SELECT 'ESA TARJETA YA ESTÁ REGISTRADA';
			END 
		ELSE
			BEGIN 
				INSERT INTO TARJETA
				VALUES (@t_cvc,@t_primerNombre,@t_segundoNombre,@t_primerApellido,@t_segundoApellido,@t_fechaVigencia,@t_numero);
			END
		INSERT INTO USUARIO
		VALUES (@u_nombre,@u_contraseña,@u_correo,@u_numCelular,@u_ptos,@t_numero); 
	END 
END

--pruebas ejecucion 
EXECUTE CREAR_USUARIO 'juanito','12decd23','juan@dsnd','99823743',0,123,'juan',NULL,'perez',NULL,1290,'0983648';
EXECUTE CREAR_USUARIO 'luisito','12decd23','juan@dsnd','99823743',0,123,'juan',NULL,'perez',NULL,1290,'1234567890123456';
EXECUTE CREAR_USUARIO 'luisito','12decd23','juan@dsnd','99823743',0,123,'juan',NULL,'perez',NULL,1290,'1234567890123456';
