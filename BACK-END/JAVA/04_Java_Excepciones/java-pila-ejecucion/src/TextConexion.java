
public class TextConexion {

	public static void main(String[] args) throws Exception {
		
		
		
		//La nueva forma del try catch 
		
		try(Conexion con=new Conexion()) {
			con.leerDatos();
		}catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("Ejecutando catch");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		/*
		Conexion conexion=null;
		
		try {
			 conexion=new Conexion();
			conexion.leerDatos();
			
			
		} catch (IllegalStateException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			System.out.println("Ejecutando finally");
			conexion.cerrar();
			if(conexion!=null) {
				conexion.cerrar();
			}
		}
			*/
	}

	
}
