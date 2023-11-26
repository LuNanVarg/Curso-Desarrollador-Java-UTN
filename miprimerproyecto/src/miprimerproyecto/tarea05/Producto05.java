package miprimerproyecto.tarea05;

import java.time.LocalDate;

public class Producto05 {
	//Clase Producto
	
	//Estos atributos son de instancia 
		private String nombre;
		private LocalDate fechaAlta;
		private Double precioUnitario;
		
		
		private static final Double minPrecio = 5.5;
		
		public Producto05 (String nombre){
			this.setNombre(nombre);
			this.setFechaAlta(LocalDate.now());
			this.setPrecioUnitario(minPrecio);
		}
		
		public Producto05 (String nombre, Double precioUnitario) {
			this.setNombre(nombre);
			this.setPrecio(precioUnitario);
			this.setFechaAlta(LocalDate.now());
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public LocalDate getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}

		public Double getPrecioUnitario() {
			return precioUnitario;
		}

		public void setPrecioUnitario(Double precioUnitario) {
			this.precioUnitario = precioUnitario;
		}
		
	

}
