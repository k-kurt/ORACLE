package data;


public class Cliente {

	
	private String titutar;
	private int documento;
	private int telefono;
	
	
	
	
	
	public Cliente(String titutar, int documento, int telefono) {
	
		this.titutar = titutar;
		this.documento = documento;
		this.telefono = telefono;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public String getTitutar() {
		return titutar;
	}
	public void setTitutar(String titutar) {
		this.titutar = titutar;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
