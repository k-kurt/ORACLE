
public class ControlBonificacion{
	
	
	
	private double suma;
	 
	
	public double registrarSalario(Funcionario funcionario) {
		
		
		this.suma=funcionario.getBonificacion()+this.suma;
		System.out.println("calculo actual: "+this.suma);
		return this.suma;
	}
	
	public double resgistrarSalario(gerente gerente) {
		this.suma=gerente.getBonificacion()+this.suma;
		System.out.println(this.suma);
		return this.suma;
		
	}
	
	
	
}
