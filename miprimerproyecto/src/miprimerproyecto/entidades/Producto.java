package miprimerproyecto.entidades;

import java.time.LocalDate;

public class Producto {
	
	//Estos atributos son de instancia 
	private String nombre;
	private String descripcion;
	private LocalDate fechaAlta;
	private Integer pesoKg;
	private Double precio;
	
	private static final Double minPrecio = 150.5;
	
	public Producto (String nombre){
		this.nombre = nombre;
		this.fechaAlta = LocalDate.now();
		this.precio = minPrecio;
	}
	
	public Producto (String nombre, String descripcion, Double precio) {
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setPrecio(precio);
		this.setFechaAlta(LocalDate.now());
		
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Integer getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(Integer pesoKg) {
		this.pesoKg = pesoKg;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public static Double getMinprecio() {
		return minPrecio;
	}
	

	//private static final Double minPrecio = 0.1;
	
	//public Producto(String nombre) {
		//this.nombre = nombre;
		//this.fechaAlta = LocalDate.now();
		//this.precio = minPrecio;
	//}
	
	
	//private String nombre;
	//private String codigo;
	//private float precio;
	
	//public float costoFinal(int cantCuotas) {
		//return 0;	}

	//public String getNombre() {
		//return nombre;	}

	//public void setNombre(String nombre) {
		//this.nombre = nombre;	}

	//public String getCodigo() {
		//return codigo;	}

	//public void setCodigo(String codigo) {
		//this.codigo = codigo;	}

	//public float getPrecio() {
		//return precio;	}

	//public void setPrecio(float precio) {
		//this.precio = precio;	}

}
