


public class TestFuncionario {

	public static void main(String[] args) {

		
		Funcionario diego=new Funcionario();
		diego.setNombre("Diego");
		diego.setDocumento("321312312");
		diego.setSalario(200);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		
	}
	
	
}
