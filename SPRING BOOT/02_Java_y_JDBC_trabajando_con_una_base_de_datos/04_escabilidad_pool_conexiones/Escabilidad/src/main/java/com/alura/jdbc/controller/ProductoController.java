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
		final Connection con = factory.recuperaConexion();
		try (con) {

			final PreparedStatement statement = con.prepareStatement(

					"UPDATE productos SET " + " nombre = ?" + ", descripcion = ?" + ", cantidad = ?" + " WHERE id = ?");
			try (statement) {

				statement.setString(1, nombre);
				statement.setString(1, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);

				statement.execute();

				int updateCount = statement.getUpdateCount();

				return updateCount;
			}
		}
	}

	public int eliminar(Integer id) throws SQLException {
		// TODO

		final Connection con = new ConnectionFactory().recuperaConexion();
		try (con) {

			final PreparedStatement statement = con.prepareStatement("delete from productos where id=?");
			try (statement) {

				statement.setInt(1, id);
				statement.execute();

				int updateCount = statement.getUpdateCount();

				return updateCount;

			}
		}

	}

	public List<Map<String, String>> listar() throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try (con) {

			final PreparedStatement statement = con
					.prepareStatement("SELECT id, nombre, descripcion, cantidad FROM productos");

			try (statement) {

				statement.execute();
				ResultSet resulset = statement.getResultSet();

				List<Map<String, String>> resultado = new ArrayList<>();

				while (resulset.next()) {
					// creamos un map donde guardamos cada elementos para pasarlo despues a la lista
					Map<String, String> fila = new HashMap<>();
					// guardamos en el map fila los registros
					fila.put("id", String.valueOf(resulset.getInt("id")));
					fila.put("nombre", resulset.getString("nombre"));
					fila.put("descripcion", resulset.getString("descripcion"));
					fila.put("cantidad", String.valueOf(resulset.getInt("cantidad")));
					resultado.add(fila);

				}
				return resultado;
			}

		}

	}

	// aqui esperamos el objecto array producto
	public void guardar(Map<String, String> producto) throws SQLException {
		String nombre = producto.get("nombre");
		String descripcion = producto.get("descripcion");
		Integer cantidad = Integer.valueOf(producto.get("cantidad"));
		Integer maximoCantidad = 50;

		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();
		// definimos que la conexion no va a tener mas el control de la transacccion
		// sino nosotros
		try (con) {
			con.setAutoCommit(false);

			final PreparedStatement statement = con.prepareStatement(
					"Insert into productos(nombre, descripcion, cantidad) " + " values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			try (statement) {

				// hacemos un rollback en el try catch

				do {

					int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);

					ejecutaRegistro(nombre, descripcion, cantidadParaGuardar, statement);

					cantidad -= maximoCantidad;

				} while (cantidad > 0);

				// aqui agregamos el commit
				con.commit();
				System.out.println("COMMIT");
			} catch (Exception e) {
				// aqui esta el rollback
				con.rollback();
				System.out.println("ROLLBACK");

			}

			// statement.close(); ya no es necesario
		}

		// con.close() ya no es necesario
	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement)
			throws SQLException {

//		if(cantidad<50) {
//			throw new RuntimeException("Ocurrio un error");
//		}

		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);

		statement.execute();

		// VERSION 9
		final ResultSet resultset = statement.getGeneratedKeys();
		try (resultset) {

			while (resultset.next()) {
				System.out.println(String.format("Fue insertado el producto de ID %d", resultset.getInt(1)));
			}

		}

		// version 7
		// la interfaz autocloseable esta internamente en el resultSet
//    	try (ResultSet resultset=statement.getGeneratedKeys();){
//	  	
//    	while(resultset.next()) {
//    		System.out.println(String.format("Fue insertado el producto de ID %d", resultset.getInt(1)));	
//    	}
//    	
//		}

	}

}
