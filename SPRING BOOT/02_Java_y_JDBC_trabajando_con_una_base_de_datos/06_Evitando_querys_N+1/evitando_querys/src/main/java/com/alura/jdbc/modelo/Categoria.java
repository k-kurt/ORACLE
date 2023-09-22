package com.alura.jdbc.modelo;

public class Categoria {

	
		
	public Categoria(int id, String nombre) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nombre=nombre;
	}
	private Integer id;
	private String nombre;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre;
	}
}
