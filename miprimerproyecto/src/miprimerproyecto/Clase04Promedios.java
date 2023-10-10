package miprimerproyecto;

public class Clase04Promedios {

	public static void main(String[] args) {
		// Promedios 
		// int numeros[] = new int[] { 1, 37, 16 };
		// int resultado = 0;
		// for (int i = 0; i < numeros.length; i++) {
		   //  resultado = resultado + i;
		//}
		// int resultado = sumatoria(numeros);
		// resultado = resultado / numeros.length;
		// System.out.println(resultado);
			//otra forma de reutilizar la clase
		    int numerosNaturales[] = new int[] { 1, 37, 16 };	
			System.out.println(promedio(numerosNaturales));
	}
	
	 public static int sumatoria(int[] numeros) {
		 int resultado = 0;
		 for (int i = 0; i < numeros.length; i++) {
			    resultado = resultado + i;	 
		 }
		 return resultado;
	 } 
	 
	 public static int promedio(int[] numeros){
		 return sumatoria(numeros)/ numeros.length;
	 }
}
