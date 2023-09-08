package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaCuentas;

public class TestGuardaCuenta {

	public static void main(String[] args) {
		GuardaCuentas guardarCuenta=new GuardaCuentas();
		
		Cuenta cc=new CuentaCorriente(1, 2);
		Cuenta ca=new CuentaAhorros(10, 20);
		
		//adicionar
		guardarCuenta.adicionar(cc);
		guardarCuenta.adicionar(ca);
		
		
		//Obtener
		guardarCuenta.obtener(0);
		guardarCuenta.obtener(1);
		
		
		
		
	}
}
