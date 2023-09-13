package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestOrdenarLista {

	public static void main(String[] args) {

//		Cuenta cc1 = new CuentaCorriente(22, 33);
//		cc1.deposita(333.0);
//
//		Cuenta cc2 = new CuentaAhorros(22, 44);
//		cc2.deposita(444.0);
//
//		Cuenta cc3 = new CuentaCorriente(22, 11);
//		cc3.deposita(111.0);
//
//		Cuenta cc4 = new CuentaAhorros(22, 22);
//		cc4.deposita(222.0);
//
//		List<Cuenta> lista = new ArrayList<>();
//		lista.add(cc1);
//		lista.add(cc2);
//		lista.add(cc3);
//		lista.add(cc4);

		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Diego");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Cuenta cc2 = new CuentaAhorros(32, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Renato");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(42, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Liam");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Cuenta cc4 = new CuentaAhorros(26, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Noel");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		//ORDENAR DESDE LA VERSION 8
		// Ordenar las cuentas
		// cualquier clase hija de Cuenta
		// Comparator <? extend Cuenta> c
		// pide la implementacion de la clase, lo de arriba
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);

		System.out.println("despues de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}

		
		System.out.println("Antes de ordenar por nombre");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
//		Comparator<Cuenta> compartor=new OrdenadorPorNombreTitular();
//		lista.sort(compartor);

		
		
		
		//ORDENAR D LA ANTIGUA FORMA
		
		Collections.sort(lista, new OrdenadorPorNombreTitular());
		//establecer ordenamiento por orden natural
		
		
		
		System.out.println("despues de ordenar por nombre");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		Collections.sort(lista);
		
		
		System.out.println("despues de ordenar por orden natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		
		
	}

}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		// TODO Auto-generated method stub

		//Forma basica
//		if (o1.getNumero() == o2.getNumero()) {
//			return 0;// el 0
//		} else if (o1.getNumero() > o2.getNumero()) {
//			return 1;// un positivo
//		} else {
//
//			return -1;// un negativo
//		}
		
		//forma intermedia
		//return o1.getNumero()-o2.getNumero();
		
		//forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
		
		
	}
}


class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		
		//funciona internamente como el otro, devuelve -1,0,1 
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
					
	}
	
}