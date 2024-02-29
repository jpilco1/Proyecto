package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Categorias;





public interface CategoriasDAO {
	
public List<Categorias> findAll();
	
	public Categorias findOne(int id);
	
	public void add(Categorias categoria);
	
	public void up(Categorias categoria);
	
	public void del(int id);
}
