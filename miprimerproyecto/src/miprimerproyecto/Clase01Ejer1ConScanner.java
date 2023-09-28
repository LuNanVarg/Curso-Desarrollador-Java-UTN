package miprimerproyecto;

public class Clase01Ejer1ConScanner {

	public static void main(String[] args) {
//		A. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
//		y “b”. Su código puede arrancar (por ejemplo):
//		int numeroInicio = 5;
//		int numeroFin = 14;
//		// Se deberían mostrar los números:
//		5,6,7,8,9,10,11,12,13,14
        
        System.out.println("Item A del ejercicio 1");
        
        int numeroInicio = 5;
        int numeroFin = 14;
        while(numeroInicio <= numeroFin) {
        	System.out.println(numeroInicio); 
        	numeroInicio++; // numeroInicio = numeroInicio + 1 	
        }
        // B. A lo anterior, solo muestre los números pares
        System.out.println("Item B del ejercicio 1"); 
        
        numeroInicio = 5;
        while(numeroInicio <= numeroFin) {
        	if(numeroInicio % 2 == 0) {
        		System.out.println(numeroInicio);
        	}
        	numeroInicio++;
        }
        
//		C. A lo anterior, con una variable extra, elija si se deben mostrar los números
//		pares o impares
       
        System.out.println("Item C del ejercicio 1"); 
        
        numeroInicio = 5;
        char parOImpar = 'p'; //p es par .. i es impar
        
        while(numeroInicio <= numeroFin){
        	
        	switch (parOImpar) {
        	case 'p':
        		if(numeroInicio % 2 == 0) {
        			System.out.println(numeroInicio);
        		}
        		break;
        	case 'i':
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
        
		// D. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
        System.out.println("Item D del ejercicio 1");  
        
        numeroInicio = 5; 
        for(numeroFin = 14; numeroInicio <= numeroFin; numeroFin--) {
        	 if(numeroFin % 2 == 0) {
         		System.out.println(numeroFin);
         	}
       	 
         } 
        
//      Ejercicio 2
//		Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
//		todas y todos los convivientes:	
//		- Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
//		(3,5 canastas básicas para un hogar tipo 2 según el INDEC).
//		- Tener 3 o más vehículos con una antigüedad menor a 5 años.
//		- Tener 3 o más inmuebles.
//		- Poseer una embarcación, una aeronave de lujo o ser titular de activos
//		societarios que demuestren capacidad económica plena.”
		
		float ingresosMensuales = 100000; // Cambiar el valor de ingresos segun el caso
		int cantidadVehiculosMenorA5anios = 3; 
		int cantidadInmuebles = 1; 
		// int cantidadVehiculosLujo = 0; //Incluye embarcación, aeronave o titular de activos
		boolean tieneEmbarcacion = false; 
		boolean tieneAeronave = false;
		boolean titularActivos = false; 
		boolean ingresosAltos = false; 
		
		if (
				ingresosMensuales >= 489083 || 
				cantidadVehiculosMenorA5anios >= 3 ||
				cantidadInmuebles >= 3 ||
				tieneEmbarcacion || 
				tieneAeronave ||
				titularActivos
				) {
			ingresosAltos = true; 
			}
			
		if (ingresosAltos) {
			System.out.println("El hogar pertenece al segmento de ingresos altos");
		} else {
			System.out.println("El hogar NO pertenece al segmento de ingresos altos");		
		}
	}

}
