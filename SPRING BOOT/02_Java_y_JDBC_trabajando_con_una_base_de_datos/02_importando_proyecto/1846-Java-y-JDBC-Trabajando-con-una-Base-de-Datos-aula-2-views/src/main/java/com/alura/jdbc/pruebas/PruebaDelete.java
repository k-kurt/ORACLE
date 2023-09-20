package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {
			
	
	public static void main(String[] args) throws SQLException {
		Connection con=new ConnectionFactory().recuperaConexion();
		Statement statement= con.createStatement();
		
		statement.execute("delete from productos where id=99");
		
		//para saber si realmente se elimino vamos a usar un metodo que devuelve un int
		//devuelve cuantas filas fueron modificadas en el statement 
		//en este caso va a ser 1
		//como queremos mostrarlo en el formulario lo devolvemos para usarlo
		System.out.println(statement.getUpdateCount());
		//devolvio 0, esto significa que no fue afectada ningun registro, no existe el 99
	}
	
	
	
}
