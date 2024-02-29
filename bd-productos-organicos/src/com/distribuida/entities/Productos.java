package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_producto")
	private int idProducto;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "precio")
	private Double precio; 
	@Column(name = "stock")
	private int stock;
	@Column(name = "imagen")
	private String imagen;

	
public Productos(int idProducto, String nombre, String descripcion, Double precio, int stock, String imagen) {
		
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.imagen = imagen;
	}


public Productos() {
	
}


public int getIdProducto() {
	return idProducto;
}


public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}


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


public Double getPrecio() {
	return precio;
}


public void setPrecio(Double precio) {
	this.precio = precio;
}


public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}


public String getImagen() {
	return imagen;
}


public void setImagen(String imagen) {
	this.imagen = imagen;
}


@Override
public String toString() {
	return "Productos [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
			+ precio + ", stock=" + stock + ", imagen=" + imagen + "]";
}

}

