package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.pruebas.PruebaConexion;

public class ProductoController {

	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<?> listar() throws SQLException  {
			//creamos una instancia del driver para conectar a mysql o cualquier bbdd
		 Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
	                "root",
	                "kevin");

	        System.out.println("Cerrando la conexión");

	        
	        
	        Statement statement= con.createStatement();
	        //
	        //este devuelve un boolean true cuando devuelve un listado, en las otras sentencias que 
	        //no devuelven un listado, devuelve un false
	        boolean result=statement.execute("SELECT id, nombre, descripcion, cantidad FROM productos");
		
	        System.out.println(result);
	        
	        con.close();
		return new ArrayList<>();
	}

    public void guardar(Object producto) {
		// TODO
	}

}
