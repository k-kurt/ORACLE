package com.bytebank.test;

import java.util.LinkedList;
import java.util.List;

public class TestRepasoArray {

	
	public static void main(String[] args) {
		
		int[] numeros=new int[10];
		
		int numero=40;
		Integer numeroObjecto=new Integer(40);
		
		List<Integer> lista=new LinkedList<Integer>();
		
		//primitivo!=object
		lista.add(numero); //AutoBoxing
		lista.add(new Integer(40));
		lista.add(numeroObjecto);
		
		
	}
	
	
}
