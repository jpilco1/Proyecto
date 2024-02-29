package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.CategoriasDAO;
import com.distribuida.entities.Categorias;

@Service
public class CategoriasServiceImpl implements CategoriasService {

	@Autowired
	
	private CategoriasDAO categoriasDAO;
	@Override
	public List<Categorias> findAll() {
		// TODO Auto-generated method stub
		return categoriasDAO.findAll();
	}

	@Override
	public Categorias findOne(int id) {
		// TODO Auto-generated method stub
		return categoriasDAO.findOne(id);
	}

	@Override
	public void add(int idCategoria, String categoria, String descripcion, String imagen) {
		// TODO Auto-generated method stub}
		Categorias categorias = new Categorias(idCategoria, categoria, descripcion, imagen);
		categoriasDAO.add(categorias);

	}

	@Override
	public void up(int idCategoria, String categoria, String descripcion, String imagen) {
		// TODO Auto-generated method stub
		Categorias categorias = new Categorias(idCategoria, categoria, descripcion, imagen);
		categoriasDAO.up(categorias);

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		categoriasDAO.del(id);

	}

}
