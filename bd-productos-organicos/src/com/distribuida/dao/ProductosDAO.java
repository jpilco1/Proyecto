package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Productos;



public interface ProductosDAO {
	
public List<Productos> findAll();
	
	public Productos findOne(int id);
	
	public void add(Productos producto);
	
	public void up(Productos producto);
	
	public void del(int id);
}
