package miprimerproyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;                                      

public class Clase04LecturaArchivos {

	public static void main(String[] args) {
		// utilizar la rutaRelativa es mas 
//      String rutaAbsoluta = "C:\\Users\\nancy\\OneDrive\\Escritorio\\java-utn\\Curso-Desarrollador-Java-UTN\\miprimerproyecto\\recursos"
			
		String rutaRelativa = "recursos/ArchivoTextoEjemplo.txt";
		
		Path pathDelArchivo = Paths.get(rutaRelativa);
		
		try {
			for(String linea : Files.readAllLines(pathDelArchivo)) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException s) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
