package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	
	public static void main(String[] args) {
		
		ArrayList lista=new ArrayList();
		
		Cuenta cc=new CuentaCorriente(10, 20);
		Cuenta c2=new CuentaCorriente(20, 30);
		
		
		lista.add(cc);
		lista.add(c2);
		
		Cuenta obtenerCuenta=(Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
	}
	
}
