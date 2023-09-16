select * from tbcliente;
select * from tbcliente where edad>27;
select * from tbcliente where edad<=27;
select * from tbcliente where edad!=29;
-- creo que son iguales
select * from tbcliente where edad<>29;
-- mysql ordena alfabeticamente entonces al ver si hay un nombre mayor, lo hace desde de la letra que pasemos
select * from tbcliente where nombre>'luis silva';

select * from tbproducto;
-- como es flotante y redonde puede que no entre el numero en la comparacion
select * from tbproducto where precio_lista=28.51;
-- si sale ahora
select * from tbproducto where precio_lista>28.51;
-- condicion adicional para poder detectarlo
select * from tbproducto where PRECIO_LISTA between 28.49 and 28.52;
