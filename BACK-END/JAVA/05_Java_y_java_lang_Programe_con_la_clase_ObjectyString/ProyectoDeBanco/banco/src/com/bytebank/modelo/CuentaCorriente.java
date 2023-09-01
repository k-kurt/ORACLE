package com.bytebank.modelo;


public class CuentaCorriente extends Cuenta {

	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) {
		double comision = 0.2;
		try {
			super.saca(valor + comision);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
