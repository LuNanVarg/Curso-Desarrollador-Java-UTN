package miprimerproyecto.entidades;

public class ItemCarrito {
	
	private Producto05 producto1;
	private Producto05 producto2;
	private Producto05 producto3;
	
	public ItemCarrito(Producto05 producto1, Producto05 producto2, Producto05 producto3) {
		this.setProducto1(producto1);
		this.setProducto2(producto2);
		this.setProducto3(producto3);
	}
	
	//Debería retornar la suma del costo de los productos del carrito
	public Double costoFinal() {
		return 
			   this.getProducto1().getPrecioUnitario() + 
			   this.getProducto2().getPrecioUnitario() +
               this.getProducto3().getPrecioUnitario();
	}

	public Producto05 getProducto1() {
		return producto1;
	}
	
	public void setProducto1(Producto05 producto1) {
		this.producto1 = producto1;
	}
	
	public Producto05 getProducto2() {
		return producto2;
	}
	
	public void setProducto2(Producto05 producto2) {
		this.producto2 = producto2;
	}
	
	public Producto05 getProducto3() {
		return producto3;
	}
	
	public void setProducto3(Producto05 producto3) {
		this.producto3 = producto3;
	}

	public static double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

}