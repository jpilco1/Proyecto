package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.CategoriasDAO;
import java.util.List;
import com.distribuida.entities.Categorias;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
				CategoriasDAO categoriasDAO = context.getBean("categoriasDAOImpl",CategoriasDAO.class);
				
				
				//CRUD
				
				//ADD
				Categorias categoria =new Categorias(0,"frutas","saludables","frutas.jpg");
				categoriasDAO.add(categoria);
				
				//UP
				Categorias categoria2 =new Categorias();
			//categoriasDAO.up(categoria2);
				
				//	DEL
				//categoriasDAO.del(1);
				
				//findAll
				List<Categorias> categorias=categoriasDAO.findAll();
				
				
				
				
				//impresion
				for (Categorias item : categorias) {
					System.out.println(item.toString());
				}
				
				//findOne
				//Clientes cliente =clienteDAO.findOne(3);
				
				//System.out.println(cliente.toString());
				
				context.close();
			}

	}


