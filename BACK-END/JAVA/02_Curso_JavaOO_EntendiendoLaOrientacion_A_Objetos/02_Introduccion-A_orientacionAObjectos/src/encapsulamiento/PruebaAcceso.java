package encapsulamiento;

import data.Cliente;
import data.Cuenta;

public class PruebaAcceso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Cuenta cuenta=new Cuenta(555);

	cuenta.depositar(500);
	cuenta.getRetirar(300);
	System.out.println(cuenta.getSaldo());
	System.out.println("agencia: "+cuenta.getAgencia());
	
	Cliente cliente=new Cliente();
	cliente.setDocumento(21312312);
	cliente.setTelefono(123213123);
	cliente.setTitutar("ale");
	
	cuenta.setTitular(cliente);
	
	System.out.println(cliente.getTitutar());
	System.out.println(cuenta.getTitular().getTitutar());
		
		
	}

}
