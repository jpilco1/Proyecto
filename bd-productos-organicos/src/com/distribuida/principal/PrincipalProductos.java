package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.ProductosDAO;
import java.util.List;
import com.distribuida.entities.Productos;

public class PrincipalProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
				ProductosDAO productosDAO = context.getBean("productosDAOImpl",ProductosDAO.class);
				
				
				//CRUD
				
				//ADD
				Productos producto =new Productos(0,"kiwi","fruta tropical",0.25,30,"kiwi.jpg");
				//productosDAO.add(producto);
				
				//UP
				Productos producto2 =new Productos(1,"pera","fruta seca",0.45,100,"pera.jpg");
			//productosDAO.up(producto2);
				
				//	DEL
				productosDAO.del(1);
				
				//findAll
				List<Productos> productos=productosDAO.findAll();
				
				
				
				
				//impresion
				for (Productos item : productos) {
					System.out.println(item.toString());
				}
				
				//findOne
				//Clientes cliente =clienteDAO.findOne(3);
				
				//System.out.println(cliente.toString());
				
				context.close();
			}

	}


