package miprimerproyecto.entidades;

public class Producto05 {
	
    private String nombre;
    private double precioUnitario;

    public Producto05(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public Producto05(String nombre2) {
		
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
}
