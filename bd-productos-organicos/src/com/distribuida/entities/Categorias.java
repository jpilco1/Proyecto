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
@Table(name = "categorias")
public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id_categoria")
	private int idCategoria;
	@Column(name = "categoria")
	private String categoria;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "imagen")
	private String imagen;

	
	
public Categorias(int idCategoria, String categoria, String descripcion, String imagen) {
	
		this.idCategoria = idCategoria;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}


public Categorias() {
	
}


public int getIdCategoria() {
	return idCategoria;
}


public void setIdCategoria(int idCategoria) {
	this.idCategoria = idCategoria;
}


public String getCategoria() {
	return categoria;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public String getImagen() {
	return imagen;
}


public void setImagen(String imagen) {
	this.imagen = imagen;
}


@Override
public String toString() {
	return "Categorias [idCategoria=" + idCategoria + ", categoria=" + categoria + ", descripcion=" + descripcion
			+ ", imagen=" + imagen + "]";
}

}
