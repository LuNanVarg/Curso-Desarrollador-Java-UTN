package miprimerproyecto.tarea05;

import miprimerproyecto.entidades.ItemCarrito;
import miprimerproyecto.entidades.Producto05;

public class CalcularPrecio05 {

	public static void main(String[] args) {
	//Clase main del ejercicio Clase 05

	//2 productos con su nombre, descripción y peso
	Producto05 jabon = new Producto05("jabon", 40.0);
	Producto05 esponjas = new Producto05("esponjas", 10.0);
	Producto05 chocolates = new Producto05("chocolates" ,100.0);
		
	//Instanciar un carrito
	ItemCarrito carrito = new ItemCarrito(jabon,esponjas,chocolates);
						
	System.out.println("Costo final del carrito: "+carrito.costoFinal());

	}

}
