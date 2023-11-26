package miprimerproyecto.tarea05;

import java.time.LocalDate;

import miprimerproyecto.entidades.Persona;
import miprimerproyecto.entidades.Producto;

public class CarritoDeCompras05 {

	
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDate fechaCompra;
	
	public CarritoDeCompras05() {
		this.fechaCompra = LocalDate.now();
	}
	
	public CarritoDeCompras05(Producto producto1, Producto producto2, Producto producto3) {
		this.setProducto1(producto1);
		this.setProducto2(producto2);
		this.setProducto3(producto3);
		this.fechaCompra = LocalDate.now();
	}
	
	//Debería retornar la suma del costo de los productos del carrito
	public Double costoFinal() {
		return 
			   this.getProducto1().getPrecio() + 
			   this.getProducto2().getPrecio() +
               this.getProducto3().getPrecio();
	}

	
	
}
