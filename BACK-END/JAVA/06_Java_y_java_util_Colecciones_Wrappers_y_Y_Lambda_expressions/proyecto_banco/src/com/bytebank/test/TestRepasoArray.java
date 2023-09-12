package com.bytebank.test;

import java.util.LinkedList;
import java.util.List;

public class TestRepasoArray {

	
	public static void main(String[] args) {
		
		int[] numeros=new int[10];
		//  WRAPPER 
		int numero=40;
		// CLASE WRAPPER envuelve el tipo primitivo
		//Integer numeroObjecto=new Integer(40); DEPRECADO
								//metodo static no necesita el 'new'
		Integer numeroObjecto= Integer.valueOf(40); 
		
		
		
		List<Integer> lista=new LinkedList<Integer>();
		
		//primitivo!=object
		lista.add(numero); //AutoBoxing
		lista.add(Integer.valueOf(40));
		lista.add(numeroObjecto);
		
		
		
		//unboxing 
		//int valorPrimitivo=numeroObjecto;
		//internamente toma el valor solamente
		int valorPrimitivo=numeroObjecto.intValue();
		
		//retornar el valor en byte
		numeroObjecto.byteValue();

		//retornar el valor en double
		numeroObjecto.doubleValue();

		//retornar el valor en float
		numeroObjecto.floatValue();
		
		
		
			
			//Convierte en los primitivos pedidos del objeto Integer
				//retornar el valor en byte
				byte byteInteger=numeroObjecto.byteValue();

				//retornar el valor en double
				double doubleInteger=numeroObjecto.doubleValue();

				//retornar el valor en float
				float floatInteger=numeroObjecto.floatValue();
		
				
				
				//saber el tamanio maximo de la varible
				//del entero
				System.out.println(Integer.MAX_VALUE);
				System.out.println(Integer.MIN_VALUE);
				
				//del bits
				System.out.println(Integer.SIZE);
				//del byte
				System.out.println(Integer.BYTES);//4;
				
	}
	
	
}
