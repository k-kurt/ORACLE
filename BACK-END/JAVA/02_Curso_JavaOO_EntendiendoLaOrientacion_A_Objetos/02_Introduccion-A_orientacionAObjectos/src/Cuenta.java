
public class Cuenta {
			
		double saldo;
		int agencia;
		int numero;
		Cliente titular;
		
		
	
	 public void depositar(double valor){
		 
		 this.saldo+=valor;
		 System.out.println(saldo);
	}
	 
	public boolean getRetirar(double valor) {
		
		if (saldo>valor) {
			System.out.println("su retiro fue exitoso: "+ valor);
			this.saldo-=valor;
			System.out.println("su saldo restante es de: "+this.saldo);
			return true;
			
			
		}else {
			System.out.println("saldo insuficiente: "+ saldo);
			return false;
		}
		
		
		
		
		
	}
	
	
	public boolean Tranferir(double valor, Cuenta cuenta) {
		
		if (this.saldo>=valor) {
			this.saldo-=valor;
			cuenta.depositar(valor);
			System.out.println("saldo: "+cuenta.saldo);
			return true;
		}return false;
		
		
	
		
	}
	
	
	
}
