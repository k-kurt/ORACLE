package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

public class TestArreglosReferencias {

	
	public static void main(String[] args) {
		
		
		CuentaCorriente	corriente=new CuentaCorriente(23, 44);
		
		CuentaAhorros ca=new CuentaAhorros(2, 22);
		
		
		Object[] cuentas=new Object[5];
		
		cuentas[1]=corriente;
		cuentas[2]=ca;

		
		cuentas[0]=new CuentaCorriente(32, 12);
		
		Cliente cliente=new Cliente();
		cuentas[3]=cliente;
		
		//obtener un cliente del array
		Cliente obtenido= (Cliente)cuentas[3];
		System.out.println(obtenido);
		
		

		//obtener una cuenta del array
		
		//CuentaCorriente cuenta=cuentas[1]; //no compila por que cuentas[1] hace referencia
//		al array de tipo cuentas, que esta mas arriba y es mas absorbente, no es de tipo cuentaCorriente
//			
//		LA SOLUCION ES HACER CASTING
		
		CuentaCorriente cuenta= (CuentaCorriente)cuentas[1]; 
		//estoy diciendole a java que este objecto cuenta es una cuenta corriente entonces ahora si
		//compila
		System.out.println(cuenta);
		
		
		
		
		for(int i=0;i<cuentas.length;i++) {
			System.out.println(cuentas[i]);
		}
	}
	
	
	
}
