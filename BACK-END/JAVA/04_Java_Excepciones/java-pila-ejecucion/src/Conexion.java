
public class Conexion implements AutoCloseable {

	
	public  Conexion() {
		System.out.println("Abriendo conexion");
	}
	
	public void leerDatos() {
		System.out.println("Leyendo datos");
		throw new IllegalStateException();
	}
	
	public void cerrar() {
		System.out.println("cerrando conexion");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
	cerrar();	
	}
	
	
	
}
