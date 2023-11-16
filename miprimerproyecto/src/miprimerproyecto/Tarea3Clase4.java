package miprimerproyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tarea3Clase4 {

    public static void main(String[] args) {
    	  			
    	Scanner scanner = new Scanner(System.in);
    	
    	//Argumentos 
    	System.out.println("Ingresar 'codificar' o 'decodificar': ");
    	String operacion = scanner.nextLine();

    	System.out.println("Ingresar la ruta del archivo de entrada: ");
    	String archivoEntrada = scanner.nextLine();

    	System.out.println("Ingresar la ruta del archivo de salida: ");
    	String archivoSalida = scanner.nextLine();

    	System.out.println("Ingresar el número de desplazamiento: ");
    	int desplazamiento = scanner.nextInt();
    	
    	try {
    		byte[] resultado = realizarOperacion(operacion, archivoEntrada, desplazamiento);
    		Files.write(Paths.get(archivoSalida), resultado);
    		
    		System.out.println("La operación ha sigo completada con éxito.");
    			
    	} catch (IOException e) {
    		
    		System.err.println("Error al leer/escribir archivos: " + e.getMessage());
    			
    	} catch (NumberFormatException e) {
    		
    		System.err.println("Error en el argumento de desplazamiento: Debe ingresar un número entero: " + e.getMessage());
   
    	} catch (IllegalArgumentException e) {
    		
    	    System.err.println("Error en la operación: La operación debe ser 'codificar' o 'decodificar': " + e.getMessage());
    	       
    	}

    	 scanner.close();
    	 
    }
    
    public static byte[] realizarOperacion(String operacion, String archivoEntrada, int desplazamiento) throws IOException { 
    	
    	byte[] contenidoEntrada = Files.readAllBytes(Paths.get(archivoEntrada));
    	byte[] resultado = new byte[contenidoEntrada.length]; 
    	
    	 // Validación de la operación
        if (!operacion.equals("codificar") && !operacion.equals("decodificar")) {
            throw new IllegalArgumentException("Operación inválida: " + operacion);
        }
        
    	// Codifica( = derecha) o Decodifica( = izquierda)
    	for (int i = 0; i < contenidoEntrada.length; i++) {
    		if (operacion.equals("codificar")) {
    			resultado[i] = (byte) (contenidoEntrada[i] + desplazamiento); 
    		} else if (operacion.equals("decodificar")) {
    			resultado[i] = (byte) (contenidoEntrada[i] - desplazamiento);
    			
    		}
    	}
    	
    	return resultado;
    	
    }

}
