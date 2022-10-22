package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura {
	
	private float costoUnidad;
	private int unidadesTotales;

	public FacturaServicio(float precio, float costoUnidad, int unidadesTotales) {
		super(precio);
		this.costoUnidad = costoUnidad;
		this.unidadesTotales = unidadesTotales;		
	}

	public float getCostoUnidad() {
		return costoUnidad;
	}

	public int getUnidadesTotales() {
		return unidadesTotales;
	}
	
	@Override
	public float getPrecio() {
		return this.getCostoUnidad() * this.getUnidadesTotales();
	}
	
}
