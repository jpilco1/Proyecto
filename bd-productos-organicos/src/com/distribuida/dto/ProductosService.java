package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Productos;

public interface ProductosService {
	
public List<Productos> findAll();
	
	public Productos findOne(int id);
	
	public void add(int idProducto, String nombre, String descripcion, Double precio, int stock, String imagen);
	
	public void up(int idProducto, String nombre, String descripcion, Double precio, int stock, String imagen);
	
	public void del(int id);

}
