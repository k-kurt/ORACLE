package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta=new CuentaAhorros(123,213);
		
		
		cuenta.deposita(200);
		try {
			cuenta.saca(210);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
