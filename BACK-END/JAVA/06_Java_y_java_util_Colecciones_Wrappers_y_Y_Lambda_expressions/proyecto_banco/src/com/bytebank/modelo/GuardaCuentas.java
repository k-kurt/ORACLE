package com.bytebank.modelo;

public class GuardaCuentas {
	
	
	//Crear un objeto para guardar muchas cuentas
	//permitirnos agregar cuentas con un metodo
	//guardarCeuntas.adiciona(cuenta);
	//obtener.remover,etc.
	
	Cuenta[] cuenta=new Cuenta[10];

	int indice=0;
	
	public void adicionar(Cuenta cc) {
		// TODO Auto-generated method stub
		
		cuenta[indice]=cc;
		indice++;
		
	}

	public void obtener(int indice) {
		// TODO Auto-generated method stub
		
		System.out.println(cuenta[indice]);
		
	}

}
