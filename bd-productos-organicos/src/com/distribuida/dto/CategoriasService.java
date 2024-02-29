package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.Categorias;

public interface CategoriasService {
public List<Categorias> findAll();
	
	public Categorias findOne(int id);
	
	public void add(int idCategoria, String categoria, String descripcion, String imagen);
	
	public void up(int idCategoria, String categoria, String descripcion, String imagen);
	
	public void del(int id);

	
}
