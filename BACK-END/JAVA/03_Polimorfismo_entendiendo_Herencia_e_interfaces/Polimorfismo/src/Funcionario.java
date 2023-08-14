
public abstract class Funcionario {

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

	public abstract double getBonificacion();

	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
