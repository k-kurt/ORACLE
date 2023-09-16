select * from tbcliente;
-- consultar fechas
select * from tbcliente where FECHA_NACIMIENTO='1995-01-13';
select * from tbcliente where FECHA_NACIMIENTO<'1995-01-13';
select * from tbcliente where FECHA_NACIMIENTO>='1995-01-13';
-- filtro unicamente con el anio
select * from tbcliente where year(fecha_nacimiento)=1995;
-- por dia, enviar regalo
select * from tbcliente where day(FECHA_NACIMIENTO) =20;
