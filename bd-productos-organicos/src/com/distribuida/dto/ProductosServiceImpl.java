package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.distribuida.dao.ProductosDAO;
import com.distribuida.entities.Productos;
@Service

public class ProductosServiceImpl implements ProductosService {
	@Autowired
	private ProductosDAO productosDAO;
	

	@Override
	public List<Productos> findAll() {
		// TODO Auto-generated method stub
		return productosDAO.findAll();
	}

	@Override
	public Productos findOne(int id) {
		// TODO Auto-generated method stub
		return productosDAO.findOne(id);
	}

	@Override
	public void add(int idProducto, String nombre, String descripcion, Double precio, int stock, String imagen) {
		// TODO Auto-generated method stub
		Productos producto =new Productos(idProducto, nombre, descripcion, precio, stock,imagen);
		productosDAO.add(producto);
	}

	@Override
	public void up(int idProducto, String nombre, String descripcion, Double precio, int stock, String imagen) {
		// TODO Auto-generated method stub
		Productos producto =new Productos(idProducto, nombre, descripcion, precio, stock,imagen);
		productosDAO.up(producto);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
