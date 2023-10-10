package miprimerproyecto;

public class CuestionarioClase04 {
	public static void main(String[] args) {
		//Se crea una variable de dato int para ver si devuelve el parametro 
		
		int cantVeces = contarLetra("helado", 'i');
		
		System.out.println(cantVeces);
		
	}
	
 
		 public static int contarLetra(String unaPalabra, char letra){
//       Contador que lo inicializa en 0
			int cuenta = 0;

			for (int i = 0; i < unaPalabra.length(); i++){
				// En el siguiente, validamos que el caracter en el cual nos encontramos, sea igual al caracter de la búsqueda.
			    if( unaPalabra.charAt(i)  == letra){
			    	// cuenta++;
			        cuenta = cuenta + 1;
			        }
			}

			return cuenta;

	
//		 a. La función puede ser utilizada dentro de un main (Verdadero)
//		 b. Los parámetros unaPalabra y letra pueden tomar cualquier valor dentro de su tipo (Verd)
//		 c. Si unaPalabra es un String vacío “” la función retorna 0. (Verd)
//		 d. todas las anteriores (El correcto)
//		 e. ninguna de las anteriores
		
		
		
	}

}
