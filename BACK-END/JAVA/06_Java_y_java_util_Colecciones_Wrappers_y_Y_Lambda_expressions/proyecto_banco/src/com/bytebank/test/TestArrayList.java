package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista=new ArrayList<Cuenta>();
		
		Cuenta cc=new CuentaCorriente(10, 20);
		Cuenta c2=new CuentaCorriente(20, 30);
		
		
		lista.add(cc);
		lista.add(c2);
		
		Cuenta obtenerCuenta=(Cuenta) lista.get(0);
		
		for(int i=0;i<lista.size();i++) {
			
		System.out.println(lista.get(i));
		}
		
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
			//imprime por cada cuenta : en la lista
		}
		
		
		boolean contiene=lista.contains(c2);
		if(contiene) {
			System.out.println("Si");
		}
		
		
		
		
	}
	
}
