package miprimerproyecto;

public class Clase01Ejercicio2A {

	public static void main(String[] args) {	
		
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
		int cantidadVehiculosLujo = 0; //Incluye embarcación, aeronave o titular de activos
		
		if (
				ingresosMensuales >= 489083 || 
				cantidadVehiculosMenorA5anios >= 3 ||
				cantidadInmuebles >= 3 ||
				cantidadVehiculosLujo > 0
				) {
			System.out.println("El hogar pertenece al segmento de ingresos altos");
		} else {
			System.out.println("El hogar NO pertenece al segmento de ingresos altos");		
		}
			
	}
 
}
