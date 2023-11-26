package com.tp.entregatp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

@SuppressWarnings("unused")
public class App {
	
	public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/tppartidos";
	
	//Credenciales
	public static final String USER = "root";
	public static final String PASS = "0911";

    public static void main( String[] args ){
    	// DataBase     
        
        try {
        	// Establecer la conexion
        	Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        		
        	//Consulta para obtener los pronosticos
        	System.out.println("Pronosticos");
        	String consulta = "SELECT * FROM tppartidos";
        	PreparedStatement statement = conexion.prepareStatement(consulta);

        	//Consulta ejecutada
        	ResultSet resultados = statement.executeQuery();
        	
        	// Procesar los resultados	
        	while(resultados.next()){
        		String nombre = resultados.getString("nombre");
        		String equipo1 = resultados.getString("equipo1");
        		String equipo2 = resultados.getString("equipo2");
        		String resultado = resultados.getString("resultado");
        		
        		System.out.println("Nombre: "+ nombre +
        				", Equipo1: " + equipo1 +
        				", Equipo2: " + equipo2 +
        				", Resultado: " + resultado);
        	} 
        	
        	// La conexion se cierra
        	conexion.close();
        	
        	} catch (SQLException e) {
        		e.printStackTrace();
        	}
    }
}
