package miprimerproyecto;

public class Ejercicio02bClase03 {

	public static void main(String[] args) {
//		Desplazamiento. 
//		Genere una clase que tenga los métodos para realizar la codificación y decodificación
//		de un string, dado un número de desplazamiento.
//	  	Por ejemplo, con desplazo de 1:
//		b. Con desplazo de 2
//		“hola que tal” -> “jqnc!swg!vcn”
//		h -> j / o -> q
//		Si desplazo 4 "lspe$uyi$xep"
	
	   String unString = "hola que tal";
	   // jqnc"swg"vcn
	   
	   //1ro pasamos el string a un array de bytes
	   byte [] decodedBytes = unString.getBytes();
	
	   // Recorremos el array de bytes y sumamos 2 a cada elemento.
	   for(int i = 0; i < decodedBytes.length; i++ ) {
		   //Sumar a cada elemento un 2
		   decodedBytes[i]+= 2;
	   }
	   String otroString = new String(decodedBytes);
	   
	   System.out.println("Imprimo el String sin desplazamiento: "+unString);
	   System.out.println("Imprimo el String con desplazamiento: "+ otroString);
	   
	}
}

