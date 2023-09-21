package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//como es un metodo que devuelve un Connection en vez de instanciar una variable, devolvemos
	//directamente esa instancia			tenemos que hacer el throws
	public Connection recuperaConexion() throws SQLException {
		//creamos una instancia del driver para conectar a mysql o cualquier bbdd
		 return DriverManager.getConnection(
	                "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
	                "root",
	                "kevin");
	}

}
