package ar.edu.unq.po2.tp5;

public class FacturaImpuesto  extends Factura{

	private float tasa;
	
	public FacturaImpuesto(float precio, float tasa) {
		super(precio);
		this.tasa = tasa;
	}

	@Override
	public float getPrecio() {
		return this.tasa;
	}
	
	
}
