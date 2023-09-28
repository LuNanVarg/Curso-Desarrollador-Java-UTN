package miprimerproyecto;

public class CuestionarioClase03 {

	public static void main(String[] args) {
		// Pregunta N°1
		
		// int numeros[] = new int[]{1, 37, 16};
          	//Imprimir el valor del numero 2 (0,1,2)	
		  // System.out.println("¿Que valor es numeros[2] es:" + numeros[2]);
		
	
		  //Pregunta N°2 
		  
		  char letras[] = {'a','b','c','d'};
		  int numeros[] = new int[]{1,37,16};
		  for(int i=0;i<numeros.length;i++){
		  if (numeros[i] < 30) {
		  System.out.println(letras[i+1]);
		  } else {
		  System.out.println(numeros[i]);
		  }
		  }
		  
		  // Pregunta N°4
		  String elResultado= "hola que tal?".toUpperCase().replace("hola","chau");
		  
		  System.out.println(elResultado);
		  
		  
		  // Pregunta N°5
		  String[] separado = "3_tristes tigres_del_13".split("_");
		  
		  // for (String palabras : separado) { 
		  // System.out.println(palabras); Me dio mal con for
		  //}
		  
		  System.out.println("separado[1] \"" + separado[1] + "\"");
		  
		  
		  
		  
		

		  



	}

}
