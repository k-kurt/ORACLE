
public class testControlBonificacion {
	
	public static void main(String[] args) {
		
		gerente gerente=new gerente();
		gerente.setSalario(600);
		
		
		
		
		Funcionario	funcionario=new Funcionario();
		funcionario.setSalario(200);
		
		
		ControlBonificacion bonificacion=new ControlBonificacion();
		bonificacion.registrarSalario(funcionario);
		bonificacion.registrarSalario(gerente);
		
	}
	
	
}
