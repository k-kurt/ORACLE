package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {
		
		Double numeroDoble=33.0;//autoboxing
		Boolean verdadero=true;//autoboxing
		
		//lo convierte en double al int que le pasamos
		Double numeroDouble2=Double.valueOf(30);
		System.out.println(numeroDouble2);
		
		
		
		String numeroString="43";
		//es lo mismo
		String cadena=new String("hola");
		//Cambiar a double
		Double numeroAdouble=Double.valueOf(numeroString);
		//cambiar a Int
		Integer numeroAInt=Integer.valueOf(numeroString);
		
		System.out.println(numeroDoble);
		System.out.println(numeroAInt);
		
		//cambiar a string
		int numero=45;
		String string=String.valueOf(numero);
		System.out.println(string);
		
		//La clase padre es Number
		Number num=Integer.valueOf(5);	
		//la clase number puede volver a tranformarse 
		double numdouble=num.doubleValue();
		
		
					//constante
		Boolean falso=Boolean.FALSE; 
		//es lo mismo
		Boolean falso2=false;
		
		
		
	}
	
	
}
