package miprimerproyecto;

import miprimerproyecto.entidades.Persona;
import miprimerproyecto.entidades.Producto;

public class TrabajoConClases {

	public static void main(String[] args) {
		
		// Crear dos personas
		Persona persona1 = new Persona();
		
		//Persona persona1 = new Persona("Mariana","González");
		
		//Ejemplo si los atributos fueran publicos 
		//persona1.nombre = "Mariana";
		//persona1.apellido = "Gonzáles";
		
		persona1.setNombre("Mariana");
		persona1.setApellido("González");
		
		Persona persona2 = new Persona();
		
		persona2.setNombre("Pedro");
		persona2.setApellido("Sousa");
		
		System.out.println(persona1.getApellido()+", "+persona2.getNombre());
		
		// Crear dos productos
		
		Producto prod1 = new Producto();
		prod1.setNombre("cepillo de dientes");
		prod1.setCodigo("1234567");
		prod1.setPrecio(550);
		
		Producto prod2 = new Producto();
		prod2.setNombre("hilo dental");
		prod2.setCodigo("1234765");
		prod2.setPrecio(900);
		

	}

}
