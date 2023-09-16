INSERT INTO tbproductos
(producto, nombre,envase,volumen,sabor,precio)
VALUES
('773912', 'clean','botella pet','1 litro','naranja',0.01);
select * from tbproductos;
alter table tbproductos add primary key(producto);