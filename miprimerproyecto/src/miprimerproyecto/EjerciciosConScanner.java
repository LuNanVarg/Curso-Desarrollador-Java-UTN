package miprimerproyecto;

import java.util.Scanner;

public class EjerciciosConScanner {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Ingresa un número de inicio");	
		int numeroInicio = Integer.parseInt(obj.nextLine());
		// En ve de (Integer.parseInt(obj.nextLine()); se puede utilizar (obj.nextInt();))
		System.out.println("Ingresa un número de fin");	
		int numeroFin = Integer.parseInt(obj.nextLine());
		System.out.println("Ingresa si queres imprimir los pares (p), impares (i)");	
		String parOImpar = obj.nextLine();
        
        while(numeroInicio <= numeroFin){	
        	switch (parOImpar) {
        	case "p":
        		if(numeroInicio % 2 == 0) {
        			System.out.println(numeroInicio);
        		}
        		break;
        	case "i":
        		if(numeroInicio % 2 != 0 ) {
        			System.out.println(numeroInicio);
        		}
        		break;
        		default:
        			System.out.println("Opción ingresa es incorrecta");
        			break;
        	}
        	numeroInicio++;
        }
		

	}

}
