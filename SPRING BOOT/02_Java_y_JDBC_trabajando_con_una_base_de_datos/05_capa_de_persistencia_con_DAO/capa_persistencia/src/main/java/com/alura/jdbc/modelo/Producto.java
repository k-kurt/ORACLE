package com.alura.jdbc.modelo;

public class Producto {

	public Producto(String nombre, String descripcion , Integer cantidad) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.cantidad=cantidad;
		
	}
	
	public Producto(int id,String nombre, String descripcion , int cantidad) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.cantidad=cantidad;
	}

	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer cantidad;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return String.format(
				"{id: ,%s, nombre: , %s, descripcion: ,%s, cantidad: ,%d}",
				this.id, this.nombre, this.descripcion, this.cantidad);
	}

}
