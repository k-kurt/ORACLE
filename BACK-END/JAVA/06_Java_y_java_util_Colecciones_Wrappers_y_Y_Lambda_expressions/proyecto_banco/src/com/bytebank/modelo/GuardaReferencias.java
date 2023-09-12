package com.bytebank.modelo;

public class GuardaReferencias {
	
	
	//Crear un objeto para guardar muchas cuentas
	//permitirnos agregar cuentas con un metodo
	//guardarCeuntas.adiciona(cuenta);
	//obtener.remover,etc.
	
	Object[] referencia=new Object[10];

	int indice=0;
	
	public void adicionar(Object cc) {
		// TODO Auto-generated method stub
		
		referencia[indice]=cc;
		indice++;
		
	}

	public Object obtener(int indice) {
		// TODO Auto-generated method stub
		
		return referencia[indice];
		
	}

}
