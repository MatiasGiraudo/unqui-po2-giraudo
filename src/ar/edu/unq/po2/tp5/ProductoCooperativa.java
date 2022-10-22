package ar.edu.unq.po2.tp5;

public class ProductoCooperativa  extends Producto{

	public ProductoCooperativa(String nombre, float precio, int stock) {
		super(nombre, precio, stock);
	}
	
	@Override
	public float getPrecio() {
		return (float) (super.getPrecio() * 0.9);
	}
 
}
