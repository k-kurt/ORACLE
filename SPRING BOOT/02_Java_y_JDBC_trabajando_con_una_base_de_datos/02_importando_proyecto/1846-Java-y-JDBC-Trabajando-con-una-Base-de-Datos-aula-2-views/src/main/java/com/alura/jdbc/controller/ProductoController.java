package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.pruebas.PruebaConexion;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<Map<String, String>> listar() throws SQLException  {
			
			//instanciamos la clase Crea conexion y el metodo de ella recuperaConexion()
			Connection con=new ConnectionFactory().recuperaConexion();
	        
	        
	        Statement statement= con.createStatement();
	        //
	        //este devuelve un boolean true cuando devuelve un listado, en las otras sentencias que 
	        //no devuelven un listado, devuelve un false
	        boolean result=statement.execute("SELECT id, nombre, descripcion, cantidad FROM productos");
	        
	        //el array donde guardamos los elementos para agregarlos a la lista del view
	        List<Map<String, String>> resultado = new ArrayList<>();
	        
	        //obtenemos el resultado de la consulta query
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
	}

    public void guardar(Object producto) {
		// TODO
	}

}
