package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

public class TestArrayList {

	
	public static void main(String[] args) {
		
		
		//List<Cliente> listCliente=new LinkedList<>();
		
		List<Cuenta> lista=new LinkedList<>();
		//ArrayList<Cuenta> lista=new ArrayList<>();
		
		Cuenta cc=new CuentaCorriente(10, 20);
		Cuenta c2=new CuentaCorriente(20, 30);
		Cuenta c3=new CuentaCorriente(20, 30);
		
		lista.add(cc);
		lista.add(c2);
		lista.add(c3);
		
		Cuenta obtenerCuenta=(Cuenta) lista.get(0);
		
		for(int i=0;i<lista.size();i++) {
			
		System.out.println(lista.get(i));
		}
		
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
			//imprime por cada cuenta : en la lista
		}
		
		//por referencia 
		boolean contiene=lista.contains(c2);
		if(contiene) {
			System.out.println("Si, es igual por equals");
		}
		
	
		//por valores
//		if(c2.esIgual(c3)) {
//			System.out.println("Si, son iguales");
//		}
//		
		
		
		
	}
	
}
