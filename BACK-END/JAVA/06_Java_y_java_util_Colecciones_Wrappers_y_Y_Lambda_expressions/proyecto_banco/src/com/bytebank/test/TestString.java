package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;

public class TestString {

	public static void main(String[] args) {
		
	String nombre="alura";
	
	//String nombre2=new String("Alura");//no es usada en el mundo real
	
	System.out.println("Antes de metodo: " + nombre);
	nombre=nombre.replace("a", "A");
	nombre=nombre.concat(" cursos online");
	nombre=nombre.toUpperCase();//permite hacer todas las letras en mayusculas
	nombre=nombre.toLowerCase();//permite hacer todas las letras en minisculas
	char Char=nombre.charAt(3);
	int indice=nombre.indexOf("e");
	
	Object cuenta=new CuentaAhorros(2, 22);
	
	printLine( nombre);
	printLine(Char);
	printLine(indice);
	printLine(new CuentaAhorros(200,300));
	
	}
	
	
	public static void  printLine(Object valor) {
		System.out.println(valor.toString());
		}
	
		/*
		 * public static void printLine(int valor) { System.out.println(valor); }
		 * 
		 * 
		 * public static void printLine(String valor) { System.out.println(valor); }
		 * 
		 * 
		 * public static void printLine(char valor) { System.out.println(valor); }
		 * 
		 * public static void printLine(CuentaAhorros valor) {
		 * System.out.println(valor); }
		 */
	
}
