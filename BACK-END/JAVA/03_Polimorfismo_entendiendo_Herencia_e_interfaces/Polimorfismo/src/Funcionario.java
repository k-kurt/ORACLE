
public class Funcionario {

	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
//	
//	public Funcionario(String nombre, String documento,double salario, int tipo ) {
//		super();
//	}
	
	
	public Funcionario() {
		super();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//sobreescritura de metodo

	public double getBonificacion() {
		//si tipo 1==1 es gerente
		//si tipo==0 es funcionario
		return this.salario*0.1;
		
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
