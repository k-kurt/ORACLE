package com.bytebank.test;

public class TestSistemaInterno {

	
	public static void main(String[] args) {
		SistemaInterno sistemaInterno=new SistemaInterno();
		
		Gerente g1=new Gerente();
		Administrador administrador=new Administrador();
		
		sistemaInterno.autentica(g1);
		sistemaInterno.autentica(administrador);
		
	}
	
	
}
