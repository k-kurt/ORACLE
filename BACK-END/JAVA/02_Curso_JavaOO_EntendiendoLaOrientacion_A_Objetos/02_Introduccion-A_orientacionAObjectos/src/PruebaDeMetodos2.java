
public class PruebaDeMetodos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente claudio=new Cliente("claudio", 3975598, 383828);
		
		Cuenta cuentaDeClaudio=new Cuenta();
		
		cuentaDeClaudio.titular=claudio;
		cuentaDeClaudio.agencia=1;
		
		
		//estamos en la clase Cuenta, con titular relacionamos con Cliente y tenemos su telefono
		System.out.println(cuentaDeClaudio.titular.getTelefono());
		System.out.println(cuentaDeClaudio.titular);
		System.out.println(claudio);
		
	}

}
