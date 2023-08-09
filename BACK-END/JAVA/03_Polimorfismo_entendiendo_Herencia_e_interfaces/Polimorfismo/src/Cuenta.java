

public class Cuenta {
			
	

		double saldo;
		int agencia;
		int numero;
		Cliente titular;
		
		
		


		public Cuenta(int agencia) {
			super();
		
			if(agencia<=0) {
				System.out.println("No se permite 0");

				this.agencia = 1;
			
			}else {
				this.agencia=agencia;
			}
			total++;
			
			System.out.println("Se van creando: "+ total+ " de cuentas.");
		}

		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

		public int getAgencia() {
			return agencia;
		}

	

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	
		
		
	
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
	
	public static int getTotal() {
		return Cuenta.total;
	}

	private static int total;
	
}
