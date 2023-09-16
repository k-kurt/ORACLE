select * from tbcliente;
select dni, nombre,direccion1,direccion2,barrio,ciudad,estado,cp,fecha_nacimiento,edad,sexo,limite_credito, volumen_compra,primera_compra 
from tbcliente where dni='5648641702';
select dni, nombre from tbcliente;
-- podemos ponerlos en cualquier orden y lo muestra como lo ponemos 	 
select nombre, dni from tbcliente;
-- podemos renombar momentaneamente el nombre de la columna  
select nombre as nombreCliente, dni as Identificacion from tbcliente;
-- podemos liminar el resultado 
select nombre, dni from tbcliente limit 6; 