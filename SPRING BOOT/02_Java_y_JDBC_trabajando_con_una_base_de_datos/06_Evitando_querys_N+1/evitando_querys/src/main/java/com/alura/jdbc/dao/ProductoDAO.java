package com.alura.jdbc.dao;

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
import com.alura.jdbc.modelo.Producto;

public class ProductoDAO {
	//como final para que no se rompa 
	final private Connection con;
	
	public ProductoDAO(Connection con) {
		this.con=con;
	}
	
	
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
	    try {
	        final PreparedStatement statement = con.prepareStatement(
	                "UPDATE PRODUCTO SET "
	                + " NOMBRE = ?, "
	                + " DESCRIPCION = ?,"
	                + " CANTIDAD = ?"
	                + " WHERE ID = ?");

	        try (statement) {
	            statement.setString(1, nombre);
	            statement.setString(2, descripcion);
	            statement.setInt(3, cantidad);
	            statement.setInt(4, id);
	            statement.execute();

	            int updateCount = statement.getUpdateCount();

	            return updateCount;
	        }
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public int eliminar(Integer id) {
	    try {
	        final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");

	        try (statement) {
	            statement.setInt(1, id);
	            statement.execute();

	            int updateCount = statement.getUpdateCount();

	            return updateCount;
	        }
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
	
	
	public void guardar(Producto producto) {
		
	
		try (con) {
		final PreparedStatement statement = con.prepareStatement(
					"Insert into productos(nombre, descripcion, cantidad, categoria_id) " + " values(?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {
				ejecutaRegistro(producto, statement);
			}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			
		}

	}
	
	
	private void ejecutaRegistro(Producto producto, PreparedStatement statement) throws SQLException {

		statement.setString(1, producto.getNombre());
		statement.setString(2, producto.getDescripcion());
		statement.setInt(3, producto.getCantidad());
		statement.setInt(4, producto.getCategoriaId());
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



	public List<Producto> listar() {

		List<Producto> resultado = new ArrayList<>();
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try (con) {

			final PreparedStatement statement = con
					.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM productos");

			try (statement) {

				statement.execute();
				
				final ResultSet resulset = statement.getResultSet();

				try(resulset){
				while (resulset.next()) {
					
					Producto fila = new Producto(resulset.getInt("id"),
							resulset.getString("nombre"),
							resulset.getString("descripcion"),
							resulset.getInt("cantidad"));
			
					resultado.add(fila);
				}
				}
			}
				
			}catch(SQLException e) {
				throw new RuntimeException(e);
			}
		return resultado;
	
}


	public List<Producto> listar(Integer categoriaId) {
		// TODO Auto-generated method stub
		List<Producto> resultado = new ArrayList<>();
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try (con) {

			final PreparedStatement statement = con
					.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM productos where categoria_id = ?");

			try (statement) {
				statement.setInt(1, categoriaId);

				statement.execute();
				
				final ResultSet resulset = statement.getResultSet();

				try(resulset){
				while (resulset.next()) {
					
					Producto fila = new Producto(resulset.getInt("id"),
							resulset.getString("nombre"),
							resulset.getString("descripcion"),
							resulset.getInt("cantidad"));
			
					resultado.add(fila);
				}
				}
			}
				
			}catch(SQLException e) {
				throw new RuntimeException(e);
			}
		return resultado; 
		
	}
		
}
		
	
	

