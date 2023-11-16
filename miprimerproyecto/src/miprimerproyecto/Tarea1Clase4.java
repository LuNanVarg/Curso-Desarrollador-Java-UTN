package miprimerproyecto;

import java.util.Arrays;
import java.util.Scanner;

public class Tarea1Clase4 {

	public static void main(String[] args) {
//		1. Tomando los Ejercicios de la clase anterior
//		a. haga un main, donde por parámetro ponga 3 números y una letra que
//		represente ascendente o descendente y los muestre ordenados por tal criterio.

		    int[] num = new int[3];
		    char orden = 'B';

	        if (args.length == 4) {
		        for (int i = 0; i < 3; i++) {
		             num[i] = Integer.parseInt(args[i]);
		         }
		            orden = args[3].charAt(0);
		     } else {
		            Scanner scanner = new Scanner(System.in);
		         for (int i = 0; i < 3; i++) {
		              System.out.print("Indicar el número " + (i + 1) + ": ");
		                num[i] = scanner.nextInt();
		            }
		            System.out.print("Indicar 'B' para ascendente o 'E' para descendente: ");
		            orden = scanner.next().charAt(0);
		            scanner.close();
		        }

		        ordenarNumeros(num, orden);
		        mostrarNumeros(num);
		    }
//	b. haga lo mismo, pero solicitando los parámetros de a uno por consola

     public static void ordenarNumeros(int[] num, char orden) {
		      Arrays.sort(num);
		      if (orden == 'E' || orden == 'e') {
		          for (int i = 0; i < num.length / 2; i++) {
		               int temp = num[i];
		               num[i] = num[num.length - 1 - i];
		               num[num.length - 1 - i] = temp;
		            }
		        }
		    }
		    
//			c. lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
//			si no detecta ninguno. Vea si con una función puede evitar repetir código.			
		    
	 public static void mostrarNumeros(int[] num) {
		    System.out.print("Números ordenados: ");
		    for (int numero : num) {
		            System.out.print(numero + " ");
		        }
		    }
		}
