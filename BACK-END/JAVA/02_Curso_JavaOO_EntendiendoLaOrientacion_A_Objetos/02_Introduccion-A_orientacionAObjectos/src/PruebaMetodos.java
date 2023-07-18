
public class PruebaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Cuenta micuenta=new Cuenta();
		
		micuenta.depositar(300);
		
		micuenta.getRetirar(300);
		
		
		Cuenta cuenta2=new Cuenta();
		
		cuenta2.depositar(500);
		
		micuenta.Tranferir(300, cuenta2);
		
	}

}
