package miprimerproyecto;

import java.util.Arrays;
import java.util.Collections;

public class Tarea03Clase04 {

	public static void main(String[] args) {
		// Ejercicio 1.b
		// Dados 3 números y un orden (ascendente o decreciente) 
		// que ordene los mismos y los retorne en un vector de 3.
				
		System.out.println("b. Dados 3 números y un orden (ascendente o decreciente) que ordene los\r\n"
						+ "mismos y los retorne en un vector de 3");
				
		// Uso Integer para utilizar el metodo sort con reverseOrden. Dato simple.
		// int numeros = 1;
		Integer numeros [] = {-2, 23, 0};
		boolean ascendente = true; //o false
		
		if(ascendente){
			//Ascendente. De menor a mayor. 
			Arrays.sort(numeros);
			}else {
				// Desc. De mayor a menor
				Arrays.sort(numeros, Collections.reverseOrder());
				}
		
		for(int elemento : numeros) {
			System.out.println(elemento);
			
			// Buscar (Ordenamiento de burbuja (Procedimiento de la burbuja))
			// Ejercicio 1.c
			// c. dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado
			
			System.out.println("c. dado un vector de números, y un número X, que sume todos los números > X y\r\n"
					+ "retorne el resultado");
			int vectorNumeros[] = {10,20,30,40,50,-10}; //Sumatoria = 140
			int sumatoriaDeNumeros = 0;
			// Crear la variable: 
			int x = 15; // 140
			
			//Recorrooo 
			for (int num : vectorNumeros){
				// if (Siempre el número sea > x) {
				if (num >= x) {
					sumatoriaDeNumeros = sumatoriaDeNumeros + num;	
					}
				}
			
			System.out.println("La sumatoria de números mayores o iguales de "+x+" es: "+sumatoriaDeNumeros);
			}

	}

}
