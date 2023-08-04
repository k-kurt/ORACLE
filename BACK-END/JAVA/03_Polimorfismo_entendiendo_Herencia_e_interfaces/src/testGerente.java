
public class testGerente {

	public static void main(String[] args) {
			//Funcionario g1=new Funcionario();
		gerente g1=new gerente();
		
			g1.setSalario(600);
			//g1.setcalve(null);
			g1.setTipo(1);
			
			
			System.out.println(g1.getBonificacion());
			System.out.println(g1.iniciarSesion("AluraCursosOnLine"));
	}
	
	
}
