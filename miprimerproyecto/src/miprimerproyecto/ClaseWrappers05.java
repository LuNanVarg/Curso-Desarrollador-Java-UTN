package miprimerproyecto;

public class ClaseWrappers05 {

	public static void main(String[] args) {
		//  Wrappers 
		
		Integer unNumero = 1;
		int unNumero2 = 2;
		
		Double otroNumero = 1.0;
		Character unCarater = 'X';
		Boolean unBooleano = true;
		
		unNumero = unNumero + unNumero2; //Compatible
		otroNumero.equals(unNumero); //false
		unBooleano.toString(); //"true"
		
		//Y también nos provee de varios métodos útiles 
		Integer.parseInt("123"); // entero 123
		Integer.toHexString(13);
		
		
		
	}

}
