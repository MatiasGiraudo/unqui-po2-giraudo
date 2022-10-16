package ar.edu.unq.po2.tp5;

public class Caja {
	private int numeroCaja;
	private double montoAPagar;

	public Caja(int numeroCaja) {
		this.numeroCaja = numeroCaja;
		this.montoAPagar = 0;
	}

	public int getNumeroCaja() {
		return numeroCaja;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void registrarProducto(Producto producto) throws Exception {
		this.montoAPagar += producto.getPrecio();
		producto.registrar();
	}

}
