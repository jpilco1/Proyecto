package com.distribuida.principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlJDBC="jdbc:mysql://localhost:3306/bd-productos-organicos";
		String user="root";
		String clave="root";
		
		try {
			System.out.println("Estableciendo conexion...........");
			Connection connection=DriverManager.getConnection(urlJDBC,user,clave);
			System.out.println("Conexion Establecida");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
