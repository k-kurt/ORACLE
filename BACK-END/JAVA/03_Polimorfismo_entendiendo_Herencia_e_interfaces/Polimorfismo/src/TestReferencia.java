
public class TestReferencia {

	
	
	public static void main(String[] args) {
		
		//todo gerente es funcionario, hereda de funcionario
		Funcionario funcioario=new gerente();
		funcioario.setNombre("Diego");
		
		gerente gerente=new gerente();
		gerente.setNombre("Jimena");
		
		funcioario.setSalario(2000);
		gerente.setSalario(10000);
		
		
	}
	
	
	
}
