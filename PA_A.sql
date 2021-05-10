USE BEEL_BALAM;
DROP PROCEDURE ELIMINAR_USUARIO;

CREATE PROCEDURE ELIMINAR_USUARIO(
	--usuario
	@ub_nombre VARCHAR(25),
	--tarjeta
	@tb_numero VARCHAR (17)
)
AS
BEGIN
	DECLARE @auxIdCliente INT;
	SELECT @auxIdCliente = ID_CLIENTE FROM RESERVA WHERE NOMBRE_U=@ub_nombre;

	DELETE FROM RESERVA WHERE NOMBRE_U=@ub_nombre;
	SELECT 'SE HA ELIMINADO CORRECTAMENTE LA RESERVA';

	DELETE FROM CLIENTE WHERE ID_CLIENTE=@auxIdCliente;
	SELECT 'SE HA ELIMINADO CORRECTAMENTE AL CLIENTE';

	DELETE FROM USUARIO WHERE NOMBRE_U=@ub_nombre;
	SELECT 'SE HA ELIMINADO CORRECTAMENTE EL USUARIO';

	DECLARE @numVecesTarj INT;
	SELECT @numVecesTarj = COUNT(NUM_TARJETA) FROM TARJETA WHERE NUM_TARJETA=@tb_numero;
	IF @numVecesTarj>=2
		BEGIN
			SELECT 'LA TARJETA LA POSEEN DOS USUARIOS';
		END
	ELSE 
		BEGIN
			DELETE FROM TARJETA WHERE NUM_TARJETA=@tb_numero;
			SELECT 'SE HA ELIMINADO CORRECTAMENTE LA TARJETA';
		END

END

--PRUEBAS 
SELECT * FROM USUARIO;
SELECT * FROM TARJETA;
SELECT * FROM CLIENTE;
SELECT * FROM RESERVA;
EXECUTE ELIMINAR_USUARIO 'adalcv','6734567890123456';
EXECUTE ELIMINAR_USUARIO 'anahisc','1134567890123456';


CREATE PROCEDURE CANCELAR_RESERVA(
	@cod_reserva INT	
)
AS
BEGIN
	DECLARE @auxIdCliente INT;
	SELECT @auxIdCliente = ID_CLIENTE FROM RESERVA WHERE COD_R=@cod_reserva;
	DELETE FROM RESERVA WHERE COD_R=@cod_reserva;
	SELECT 'SE HA BORRADO CORRECTAMENTE LA RESERVA';
	DELETE FROM CLIENTE WHERE ID_CLIENTE=@auxIdCliente; 
	SELECT 'SE HA BORRADO CORRECTAMENTE AL CLIENTE';	
END 

SELECT * FROM RESERVA;
SELECT * FROM CLIENTE;

EXECUTE CANCELAR_RESERVA '85876';
