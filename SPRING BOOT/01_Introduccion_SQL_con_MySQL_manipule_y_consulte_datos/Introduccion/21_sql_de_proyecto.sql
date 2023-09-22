use control_de_stock;
insert into categoria(nombre) values('muebles'),('tecnologia'),('cocina'),('zapatillas');
select * from categoria;

alter table productos add column categoria_id int;
select * from productos;
alter table productos add foreign key (categoria_id) references categoria(id);
update productos set categoria_id=1 where id=1;
update productos set categoria_id=2 where id=2 or id=6 or id=7 or id=8 or id=19;
update productos set categoria_id=3 where id=3 or id=5;