package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoDAO {
	//como final para que no se rompa 
	final private Connection con;
	
	public ProductoDAO(Connection con) {
		this.con=con;
	}
	
	
	
	public void guardar(Producto producto) throws SQLException {
		
	
		try (con) {
			con.setAutoCommit(false);

			final PreparedStatement statement = con.prepareStatement(
					"Insert into productos(nombre, descripcion, cantidad) " + " values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				ejecutaRegistro(producto, statement);
				con.commit();
			} catch (Exception e) {
				con.rollback();
			}
		}

	}
	
	
	private void ejecutaRegistro(Producto producto, PreparedStatement statement) throws SQLException {

		statement.setString(1, producto.getNombre());
		statement.setString(2, producto.getDescripcion());
		statement.setInt(3, producto.getCantidad());

		statement.execute();

		// VERSION 9
		final ResultSet resultset = statement.getGeneratedKeys();
		try (resultset) {

			while (resultset.next()) {
				producto.setId(resultset.getInt(1));
				System.out.println(String.format("Fue insertado el producto %s",producto.toString()));
			}

		}

	}
	
}
