package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
    	//instanciamos la clase Crea conexion y el metodo de ella recuperaConexion()
		Connection con=new ConnectionFactory().recuperaConexion();
        

        System.out.println("Cerrando la conexion");

        con.close();
    }

}
