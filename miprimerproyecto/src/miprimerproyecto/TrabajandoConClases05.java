package miprimerproyecto;

import miprimerproyecto.entidades.Carrito;
import miprimerproyecto.entidades.Persona;
import miprimerproyecto.entidades.Producto;


public class TrabajandoConClases05 {

	public static void main(String[] args) {
		// Carrito carrito = new Carrito()
		
		// Instanciar una persona
		Persona nahuel = new Persona("Nahuel", "Ramirez");
		
		//System.out.print(nahuel.getApellido()+", "+nahuel.getNombre());
		System.out.println(nahuel.toString());
		
		// Instanciar tres productos
		//1 producto solo con su nombre
		Producto harina = new Producto("Harina");
		//2 productos con su nombre, descripción y peso
		Producto roastBeef = new Producto("Roast beef","Carne de ternera",3000.0);
		Producto leche = new Producto("Leche","Producto lacteo cero lactosa",750.0);
		
		//Instanciar un carrito
		Carrito carrito = new Carrito(nahuel,leche,roastBeef,leche);
				
		System.out.println("Costo final del carrito: "+carrito.costoFinal());

	}

}
