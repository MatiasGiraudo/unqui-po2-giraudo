package ar.edu.unq.po2.tp5;

public abstract class Factura implements Facturable, Agencia  {

	private float precio;
	
	public Factura(float precio) {
		this.precio = precio;
	}
	
	@Override
	public abstract float getPrecio();

	@Override
	public void registrar() {
		this.registrarPago(this);
	}
	
	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Pago registrado correctamente por un monto de $" + this.getPrecio());
	}	
}
