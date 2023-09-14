package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestLambda {
	public static void main(String[] args) {

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
		
		
		
		//EXPRESION LAMBDA
		//me quedo con los parametros y la logica
//		lista.sort((Cuenta o1, Cuenta o2) ->{
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.getNumero(), o2.getNumero());
//				
//			}
//		
//		);
		
		//quitamos las llaves
//		lista.sort((Cuenta o1, Cuenta o2) ->
//			// TODO Auto-generated method stub
//			return Integer.compare(o1.getNumero(), o2.getNumero());	
//	);
		
		
		
//quitamos el return
		//si usamos las llaves necesitamos el return por el contexto, el compare ya retorna un entero
//		lista.sort((Cuenta o1, Cuenta o2) ->
//		Integer.compare(o1.getNumero(), o2.getNumero());	
//	);
		
		
		
		//el punto y coma sale sobrando
		lista.sort((Cuenta o1, Cuenta o2) ->Integer.compare(o1.getNumero(), o2.getNumero())	
	);
		
		
		
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
		
		//Collections.sort(lista, new OrdenadorPorNombreTitular());
		
		
		//como acepta el segundo parametro lo instanciamos ahi
//		Collections.sort(lista, new Comparator<Cuenta>() {
//
//			@Override
//			public int compare(Cuenta o1, Cuenta o2) {
//				// TODO Auto-generated method stub
//				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
//				
//			}
//			
//		});
		//establecer ordenamiento por orden natural
		

		//lambda de lo de arriba		
//		Collections.sort(lista, (c1, c2)->{
//			return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
//		});
		//c1 y c2 ya sabe que son de tipo lista
		
		Collections.sort(lista, (c1, c2)->c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre())
		);
		
		
		
		
		System.out.println("despues de ordenar por nombre");
//		for (Cuenta cuenta : lista) {
//			System.out.println(cuenta);
//		}
//		
		//LAMBDA DE FOREACH
		//el foreach tambien acepta lambda
//		lista.forEach((Cuenta cuenta) ->{
//			System.out.println(cuenta);
//		});
		
		
		//YA sabe que es una Cuenta, no hace falta declarar
		lista.forEach( cuenta ->System.out.println(cuenta));
		
		
		
		
		Collections.sort(lista);
		
		
		System.out.println("despues de ordenar por orden natural");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		
		
	}
}
