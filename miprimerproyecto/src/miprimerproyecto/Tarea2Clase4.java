package miprimerproyecto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tarea2Clase4 {

    public static void main(String[] args) {
    	//Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
    	//contener números. El programa debe escribir por consola la suma de esos números
    	//a. Al programa anterior agreguele un parámetro para que la operación pueda ser
    	//suma o multiplicación.
    	
        String rutaRelativa = "recursos/ArchivoSuma.txt";
        String operacion = "suma";
        
        Path pathDelArchivo = Paths.get(rutaRelativa);
        try (Scanner scanner = new Scanner(pathDelArchivo)) {
            double resultado = 0;
            if (operacion.equals("suma")) {
                while (scanner.hasNextDouble()) {
                    resultado += scanner.nextDouble();
                }
            } else if (operacion.equals("suma")) {
                resultado = 1;
                while (scanner.hasNextDouble()) {
                    resultado *= scanner.nextDouble();
                }
            }
            System.out.println("Resultado de la " + operacion + " es " + resultado);
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
