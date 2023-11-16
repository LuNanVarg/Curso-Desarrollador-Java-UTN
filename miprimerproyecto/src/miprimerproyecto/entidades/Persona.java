package miprimerproyecto.entidades;

import java.time.LocalDateTime;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDateTime fechaDeNacimiento;
	
	//Método Constructor
	public Persona(String nombre, String apellido) {
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	// El método toString es muy útil cuando quieres devolver un resumen del estado interno del objeto. 
	public String toString() {
		return this.getApellido()+", "+this.getNombre();
	}
	
	public Persona() {}
	
	public Persona(String nombre, String apellido, LocalDateTime FechaDeNacimiento) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setFechaDeNacimiento(FechaDeNacimiento);
	}

	public int edad() {
		return 3;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDateTime fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}
