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

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

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


	public void guardar(Producto producto) throws SQLException {

				ProductoDAO productoDAO=new ProductoDAO(new ConnectionFactory().recuperaConexion());
				
				productoDAO.guardar(producto);
		
		
	}
}
