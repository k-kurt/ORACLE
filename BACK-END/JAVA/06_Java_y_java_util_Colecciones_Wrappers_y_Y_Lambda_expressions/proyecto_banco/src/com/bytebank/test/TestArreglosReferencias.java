package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArreglosReferencias {

	
	public static void main(String[] args) {
		
		
		CuentaCorriente	corriente=new CuentaCorriente(23, 44);
		
		
		
		CuentaCorriente[] cuentas=new CuentaCorriente[5];
		
		cuentas[1]=corriente;
		
		System.out.println(corriente);
		
		System.out.println(cuentas[1]);
		
		cuentas[0]=new CuentaCorriente(32, 12);
		
		System.out.println(cuentas[0]);
		
		for(int i=0;i<cuentas.length;i++) {
			System.out.println(cuentas[i]);
		}
	}
	
	
	
}
