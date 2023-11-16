package miprimerproyecto.tarea05;

import java.time.LocalDate;

public class Producto05 {
	//Clase Producto
	
	//Estos atributos son de instancia 
		private String nombre;
		private LocalDate fechaAlta;
		private Double precioUnitario;
		
		
		private static final Double minPrecio = 5.5;
		
		public Producto (String nombre){
			this.nombre = nombre;
			this.fechaAlta = LocalDate.now();
			this.precioUnitario = minPrecio;
		}
		
		public Producto (String nombre, Double precioUnitario) {
			this.setNombre(nombre);
			this.setPrecio(precioUnitario);
			this.setFechaAlta(LocalDate.now());
			
		}
		
	

}
