package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	protected int mes;
	protected String concepto;
	protected double montoPercibido;
	
	public Ingreso(int mes, String concepto, double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public int getMes() {
		return mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	
}
