package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.modelo.Producto;


// DAO = Data Access Object 
public class ProductoDAO { 
	private Connection con;
	
	public ProductoDAO(Connection con) {
		this.con = con;
	}
	
	public void guardar(Producto producto) {
		try{			
			PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
					+ "(NOMBRE, DESCRIPCION, CANTIDAD, CATEGORIA_ID) "
					+ "VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			
			try (statement) {
				statement.setString(1, producto.getNombre());
				statement.setString(2, producto.getDescripcion());
				statement.setInt(3, producto.getCantidad());
				statement.setInt(4, producto.getCategoriaId());
				
				statement.execute();
				
				final ResultSet resultSet = statement.getGeneratedKeys();
				
				try(resultSet) {
					while (resultSet.next()) {
						producto.setId(resultSet.getInt(1));
						System.out.println(String.format("Fue insertado el producto %s", producto));
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);			
		}
	}
	
	
	public List<Producto> listar() {
		List<Producto> resultado = new ArrayList<>();
		try{
			final PreparedStatement statement = con
					.prepareStatement("SELECT * FROM PRODUCTO");
			
			try(statement) {
				statement.execute();
				
				final ResultSet resultSet = statement.getResultSet();
				
				try(resultSet){
					while (resultSet.next()) {
						Producto fila = new Producto(resultSet.getInt("ID"), 
								resultSet.getString("NOMBRE"),
								resultSet.getString("DESCRIPCION"),
								resultSet.getInt("CANTIDAD"));
						
						resultado.add(fila);
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return resultado; 
	}
	
	
	public int eliminar(Integer id) {
		try{
			final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");
			
			try(statement) {
				statement.setInt(1, id);
				statement.execute();
				
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
		try{
			final PreparedStatement statement = con.prepareStatement("UPDATE PRODUCTO SET"
		            + " NOMBRE = ?,"
		            + " DESCRIPCION = ?,"
		            + " CANTIDAD = ?"
		            + " WHERE ID = ? ");
			
			try(statement) {
				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);
				statement.execute();
				
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Producto> listar(Integer categoriaId) {
		List<Producto> resultado = new ArrayList<>();
		try{
			final PreparedStatement statement = con
					.prepareStatement("SELECT * "
							+ " FROM PRODUCTO "
							+ " WHERE CATEGORIA_ID = ?");
			
			try(statement) {
				statement.setInt(1, categoriaId);
				statement.execute();
				
				final ResultSet resultSet = statement.getResultSet();
				
				try(resultSet){
					while (resultSet.next()) {
						Producto fila = new Producto(resultSet.getInt("ID"), 
								resultSet.getString("NOMBRE"),
								resultSet.getString("DESCRIPCION"),
								resultSet.getInt("CANTIDAD"));
						
						resultado.add(fila);
					}
				}
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return resultado; 
	}
	
	
}
