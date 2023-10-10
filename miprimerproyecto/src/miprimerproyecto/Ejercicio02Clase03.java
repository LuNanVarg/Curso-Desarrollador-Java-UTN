package miprimerproyecto;

public class Ejercicio02Clase03 {

	public static void main(String[] args) {
//		Desplazamiento. 
//		Genere una clase que tenga los métodos para realizar la codificación y decodificación
//		de un string, dado un número de desplazamiento.
//	  	a. Por ejemplo, con desplazo de 1:
//		“hola que tal” -> “ipmbarvfaubm”
//		h -> i
//  	o -> p
	
	   String unString = "hola que tal";
	   // ipmb!rvf!ubm 
	   
	   //1ro pasamos el string a un array de bytes
	   byte [] decodedBytes = unString.getBytes();
	   
	   //  System.out.println(decodedBytes);
	   // Validar que puedo hacer reversible el array de bytes a un String.
	  //System.out.println(new String(decodedBytes));
	
	   // Recorro
	   for(int i = 0; i < decodedBytes.length; i++ ) {
		   //Sumar a cada elemento un 1
		   // decodedBytes[i] = decodedBytes[i] + 1;
		   decodedBytes[i]++;
	   }
	   String otroString = new String(decodedBytes);
	   
	   System.out.println("Imprimo el String sin desplazamiento: "+unString);
	   System.out.println("Imprimo el String con desplazamiento: "+otroString);
	  
	}

}
