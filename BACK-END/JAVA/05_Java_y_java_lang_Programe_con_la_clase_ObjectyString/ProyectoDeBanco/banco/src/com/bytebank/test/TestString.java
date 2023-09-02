package com.bytebank.test;

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
	System.out.println("Despues de metodo: " + nombre);
	System.out.println("Caracter encontrado: "+Char);
	System.out.println("Indice encontrado: "+indice);
	
	}
	
}
