package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;

public class ProductoController {

	
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
	    ConnectionFactory factory = new ConnectionFactory();
	    Connection con = factory.recuperaConexion();
	    PreparedStatement statement = con.prepareStatement("UPDATE productos SET "
	            + " nombre = ?"
	            + ", descripcion = ?"
	            + ", cantidad = ?"
	            + " WHERE id = ?");
	    
	    statement.setString(1, nombre);
	    statement.setString(1, descripcion);
	    statement.setInt(3, cantidad);
	    statement.setInt(4, id);
	    
	    statement.execute();

	    int updateCount = statement.getUpdateCount();

	    con.close();   

	    return updateCount;
	}
	
	
	
	
//	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
//		// TODO
//		Connection con=new ConnectionFactory().recuperaConexion();
//		
//		Statement statemen=con.createStatement();
//		
//		//statemen.execute("update productos set nombre=" + "'nombre'" + " ," + " descripcion= "+"'descripcion'"+ " where id="+id);
//		statemen.execute("UPDATE PRODUCTOS SET "
//			    + " nombre = '" + nombre + "'"
//			    + ", descripcion = '" + descripcion + "'"
//			    + ", cantidad = " + cantidad
//			    + "WHERE id = " + id);
//		//statemen.execute("update productos set nombre= '" + nombre + "'"+ ", descripcion= '"+descripcion+ "'"+ ", cantidad= "+cantidad+" where id="+id);
//		
//		
//		
//		
//		int updateCount = statemen.getUpdateCount();
//		
//		con.close();
//		
//		return updateCount;
//		
//		 }
	
//	public void eliminar(Integer id) throws SQLException {
//		// TODO
//		
//		//creamos la conexion 
//		Connection con=new ConnectionFactory().recuperaConexion();
//		Statement statement= con.createStatement();
	
	//statement.execute("delete from productos where id="+id);
	
	//para saber si realmente se elimino vamos a usar un metodo que devuelve un int
	//devuelve cuantas filas fueron modificadas en el statement 
	//en este caso va a ser 1
//	int updateCount = statement.getUpdateCount

//	}
	
	
	public int eliminar(Integer id) throws SQLException {
		// TODO
		
				Connection con=new ConnectionFactory().recuperaConexion();
				PreparedStatement statement= con.prepareStatement("delete from productos where id=?");
				statement.setInt(1,id);
				statement.execute();
			
				
				int updateCount=statement.getUpdateCount();
				
				con.close();
				
				return updateCount;
				
				
				//return statement.getUpdateCount();
		
				
		
		
		
//		//creamos la conexion 
//		Connection con=new ConnectionFactory().recuperaConexion();
//		Statement statement= con.createStatement();
//		
//		statement.execute("delete from productos where id="+id);
//		
//		//para saber si realmente se elimino vamos a usar un metodo que devuelve un int
//		//devuelve cuantas filas fueron modificadas en el statement 
//		//en este caso va a ser 1
//		//como queremos mostrarlo en el formulario lo devolvemos para usarlo
//		return statement.getUpdateCount();
		
		
		
	}
	

	
	
	
	
	public List<Map<String, String>> listar() throws SQLException  {
		
		

		//instanciamos la clase Crea conexion y el metodo de ella recuperaConexion()
		Connection con=new ConnectionFactory().recuperaConexion();
        
        
		PreparedStatement statement= con.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM productos");
        
        //este devuelve un boolean true cuando devuelve un listado, en las otras sentencias que 
        //no devuelven un listado, devuelve un false
        boolean result=statement.execute("SELECT id, nombre, descripcion, cantidad FROM productos");
        
        //el array donde guardamos los elementos para agregarlos a la lista del view
        List<Map<String, String>> resultado = new ArrayList<>();
        
        //obtenemos el resultado de la consulta query, que es un listado
        ResultSet resulset= statement.getResultSet();
        //leemos ese resultado, con este next() leemos el resultado tras otro
        while (resulset.next()) {
        	 //creamos un map donde guardamos cada elementos para pasarlo despues a la lista
        	Map<String, String> fila= new HashMap<>();
        	//guardamos en el map fila los registros
        	fila.put("id", String.valueOf(resulset.getInt("id")));
        	fila.put("nombre", resulset.getString("nombre"));
        	fila.put("descripcion", resulset.getString("descripcion"));
        	fila.put("cantidad", String.valueOf(resulset.getInt("cantidad")));
        	
        	resultado.add(fila);
        	
		}
        

        
        con.close();
        
	
	return resultado;
		
		
		
		
		
//			
//			//instanciamos la clase Crea conexion y el metodo de ella recuperaConexion()
//			Connection con=new ConnectionFactory().recuperaConexion();
//	        
//	        
//	        Statement statement= con.createStatement();
//	        //
//	        //este devuelve un boolean true cuando devuelve un listado, en las otras sentencias que 
//	        //no devuelven un listado, devuelve un false
//	        boolean result=statement.execute("SELECT id, nombre, descripcion, cantidad FROM productos");
//	        
//	        //el array donde guardamos los elementos para agregarlos a la lista del view
//	        List<Map<String, String>> resultado = new ArrayList<>();
//	        
//	        //obtenemos el resultado de la consulta query, que es un listado
//	        ResultSet resulset= statement.getResultSet();
//	        //leemos ese resultado, con este next() leemos el resultado tras otro
//	        while (resulset.next()) {
//	        	 //creamos un map donde guardamos cada elementos para pasarlo despues a la lista
//	        	Map<String, String> fila= new HashMap<>();
//	        	//guardamos en el map fila los registros
//	        	fila.put("id", String.valueOf(resulset.getInt("id")));
//	        	fila.put("nombre", resulset.getString("nombre"));
//	        	fila.put("descripcion", resulset.getString("descripcion"));
//	        	fila.put("cantidad", String.valueOf(resulset.getInt("cantidad")));
//	        	
//	        	resultado.add(fila);
//	        	
//			}
//	        
//
//	        
//	        con.close();
//	        
//		
//		return resultado;
	}
	
	
	
	
	
	
	//aqui esperamos el objecto array producto
    public void guardar(Map<String, String> producto) throws SQLException {
	
    	Connection con=new ConnectionFactory().recuperaConexion();
    	
    	
    	//como el insert no devuelve una lista como el select no nos sirve si devuelve el true o el false
    	//entonces devolvemos la constante del Resulset que es return_generated_keys, que devuelve los id autogerados
    	//ESTO ERA VUNERABLE
    	//Statement statement=con.createStatement();
//    	statement.execute ("Insert into productos(nombre, descripcion, cantidad) "
//    	+ " values('" +producto.get("nombre")+ "', '"
//    	+producto.get("descripcion")+"',"+producto.get("cantidad")+")", Statement.RETURN_GENERATED_KEYS);

    	
    	PreparedStatement statement=con.prepareStatement("Insert into productos(nombre, descripcion, cantidad) "
    	    	+ " values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
    	
    	statement.setString(1, producto.get("nombre"));
    	statement.setString(2, producto.get("descripcion"));
    	statement.setInt(3, Integer.valueOf(producto.get("cantidad")));
    	
    	
    	
    	statement.execute();

    	
    	
    	ResultSet resultset=statement.getGeneratedKeys();
    	
    	while(resultset.next()) {
    		System.out.println(String.format("Fue insertado el producto de ID %d", resultset.getInt(1)));
    	}
    	
    	
	}

}
