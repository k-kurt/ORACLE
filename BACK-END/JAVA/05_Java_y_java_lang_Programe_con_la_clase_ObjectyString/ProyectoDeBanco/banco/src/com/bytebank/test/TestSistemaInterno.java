package com.bytebank.test;

import com.bytebank.modelo.Administrador;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.SistemaInterno;

public class TestSistemaInterno {

	
	public static void main(String[] args) {
		SistemaInterno sistemaInterno=new SistemaInterno();
		
		Gerente g1=new Gerente();
		Administrador administrador=new Administrador();
		
		sistemaInterno.autentica(g1);
		sistemaInterno.autentica(administrador);
		
	}
	
	
}
