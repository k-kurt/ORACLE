select * from tbproducto;
select * from tbproducto where PRECIO_LISTA between 28.49 and 28.52;
select * from tbproducto where envase='lata' or envase='botella pet';
select * from tbproducto where PRECIO_LISTA>=15 and PRECIO_LISTA<=25;
select * from tbproducto where (PRECIO_LISTA>=15 and PRECIO_LISTA<=25) or ( envase='lata' or envase='botella pet');
select * from tbproducto where (PRECIO_LISTA>=15 and tamano='1 litro') or ( envase='lata' or envase='botella pet');