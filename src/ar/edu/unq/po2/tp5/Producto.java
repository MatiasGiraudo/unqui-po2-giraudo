package ar.edu.unq.po2.tp5;

public class Producto implements Facturable {

	private String nombre;
	private float precio;
	private int stock;

	public Producto(String nombre, float precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	private void validarStock() throws Exception {
		if(this.getStock() <= 0) throw new Exception("No hay stock disponible");
	}
	
	public void registrar () throws Exception{
		validarStock();
		this.stock -= 1;
	}


}
