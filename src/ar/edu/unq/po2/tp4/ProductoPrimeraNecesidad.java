package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);
	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	}

	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}
}
