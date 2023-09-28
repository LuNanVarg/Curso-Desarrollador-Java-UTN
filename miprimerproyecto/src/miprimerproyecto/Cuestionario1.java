package miprimerproyecto;

public class Cuestionario1 {

	public static void main(String[] args) {
		//Primera pregunta 
		int i = 10;
		while(i > 10) {
			i = i +1; 
			}
		//Respuesta: No se ejecuta porque I ya es > 10

		//Cuarta pregunta
		int a = 17;
		int b = 4;
		int c = 4;
		
		boolean unBoolean = (a > b) && (c != b); //es verdadero/true
		System.out.println(unBoolean); 
	
		unBoolean = (a > b) && ((c * b) < a); // es verdadero/true
		
		System.out.println(unBoolean); 
		
        unBoolean = (a == c) || (b == c); // es verdadero/true
		
		System.out.println(unBoolean); 
	
		//Quinta pregunta
		
		i = 6;
		while(i > 0) {
			if(i < 3) {
				i = i + 1;
			}
			i = i - 2;
			System.out.println(i);
		}
		//Devuelve 4,2,1,0
		
		
	}

}
