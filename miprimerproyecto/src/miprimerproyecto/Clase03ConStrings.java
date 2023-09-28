package miprimerproyecto;

public class Clase03ConStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt1 = "Hola clase!";
		
			System.out.println(txt1.length());
			char data[] = {'a', 'b', 'c'};
			String dataAString = new String(data);
			
			System.out.println(dataAString);
			
			dataAString = "abcdefghijk";
			
			System.out.println(dataAString.charAt(2));
			
			int numero = 2;
			String entradaDelMetodoPrintln = "hola"+"que tal: "+numero;
			
			System.out.println(entradaDelMetodoPrintln);
			
			String txt2 = "hola";
			String txt3 = "hola";
			
			if(txt2.equals(txt3)) {
				System.out.println("Sí es lo mismo");
			}
			
			System.out.println(txt2.toUpperCase());
			System.out.println(txt2.toLowerCase());
			
			//Funcion split
			
			String apellidoYNombre = "Ramirez, Nahuel aspi,";
			
			String nombreYApellidoSeparados[] = apellidoYNombre.split(",");
			
			System.out.println(nombreYApellidoSeparados[0]);
			System.out.println(nombreYApellidoSeparados[1]);
			System.out.println(nombreYApellidoSeparados[2]);
			//No puede mostrar la 4ta ya que despues de la coma no hay nada. 
			//System.out.println(nombreYApellidoSeparados[3]);
			
//			String muchasPalabras = "casa arbol mandarina naranja";
//			for(String unaPalabra : muchasPalabras.split(" ")) {
//			    System.out.println(unaPalabra);
//			}
			
			

			
	}

}
