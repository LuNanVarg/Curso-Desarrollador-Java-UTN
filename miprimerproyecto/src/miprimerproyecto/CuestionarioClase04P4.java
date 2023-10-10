package miprimerproyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CuestionarioClase04P4 {

	public static void main(String[] args) {
//		Dado el siguiente código, indique la opción correcta:
		
		String archivo = "recursos/ArchivoTextoEjemplo.txt";
		try {
			for (String linea : Files.readAllLines(Paths.get(archivo))){
				 if(linea.startsWith("*")){
				     System.out.println(linea);
				}
				}
		} catch (IOException e) {
			e.printStackTrace();
		}

//			la variable archivo debe ser un String (Sí)
//			Se imprimen todas las lineas del archivo (Sí)
//			Se imprimen solo las lineas que tienen un “*” (No)
//			Se imprimen solo las lineas que empiezan con un “*” (No)
//			todas son incorrectas
//			a y d son correctas (Correcto)
//			a y c con correctas

	}

}
