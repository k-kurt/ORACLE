
public class gerente extends Funcionario{

//	super(documento,nombre,salario);
//		
	
	
private String clave;

public void setcalve(String clave) {
	this.clave=clave;
}

public boolean iniciarSesion(String clave) {
	//si la clave pasada es distinta devuelve un false, si es igual devuelve true
	return clave=="AluraCursosOnLine";
			
			
}
	

//sobreescritura de metodo
	public double getBonificacion(){
		return super.getSalario()+super.getBonificacion();
	}
	
}
 