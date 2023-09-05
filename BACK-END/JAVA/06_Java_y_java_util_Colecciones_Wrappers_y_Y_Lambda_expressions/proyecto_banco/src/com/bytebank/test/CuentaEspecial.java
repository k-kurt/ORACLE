package com.bytebank.test;

import com.bytebank.modelo.Cuenta;

public class CuentaEspecial  extends Cuenta{

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		//Uper llama a la variable de la cuenta padre
		super.saldo=0.0;
		
		
	}

	
		
	
}
