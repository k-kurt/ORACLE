package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	
	private DataSource datasource;
	
	
	//vamos a crear una variable que instancie al c3p0
	public ConnectionFactory() {
		var pooledDataSource=new  ComboPooledDataSource();
		//pasamos los parametros de la conexion
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("kevin");
		pooledDataSource.setMaxPoolSize(10);
		
		this.datasource=pooledDataSource;
	}
	
	public Connection recuperaConexion() throws SQLException {
	
		 return this.datasource.getConnection();
	}

}







