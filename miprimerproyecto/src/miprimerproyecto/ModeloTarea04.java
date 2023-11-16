package miprimerproyecto;

import java.util.Arrays;
import java.util.Collections;

public class ModeloTarea04 {

	public static void main(String[] args) {
		// Tomando los Ejercicios de la clase anterior
        //a. haga un main, donde por parámetro ponga 3 números y una letra que
		//represente ascendente o descendente y los muestre ordenados por tal criterio.
		
	    int num1 = 3;
	    int num2 = 6;
		int num3 = -9;
				
		String orden = "C";
				
		if(orden.equals("F")) {
			ordenAsc(num1, num2, num3);
		} else {
				ordenDesc(num1, num2, num3);
				}
				
	}
			
    // Crear la funcion que ordena asc
	public static void ordenAsc(int c, int d, int e){
		
		Integer arrNum[] = {c, d, e};
		Arrays.sort(arrNum);
		
		for(int g : arrNum) {
			System.out.println(g);
		    }
		}
	
	public static void ordenDesc(int c, int d, int e) {
		
		Integer arrNum[] = {c, d, e};
		Arrays.sort(arrNum, Collections.reverseOrder());
		for(int g : arrNum) {
			System.out.println(g);
			}
			
		
		}

	}


