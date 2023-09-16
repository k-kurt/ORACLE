use jugos;
alter table tbclientes add primary key (dni);
-- modificando tabla, agregando una columna 
alter table tbclientes add column(fecha_nacimiento date);
insert into tbclientes(dni,
nombre ,
direccion1,
direccion2 ,
barrio ,
ciudad ,
estado ,
cp ,
edad,
sexo ,
limite_credito ,
volumen_compra ,
primera_compra,
fecha_nacimiento) values(
'12345678','pedro el escamoso','calle del sol, 25','','los laureles','CDMX','mexico','65794',55,'M',1000000,2000,0,'1971-05-25'
);
select * from tbclientes;