package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {

	private int horasExtras;
	
	public IngresoHorasExtras(int mes, String concepto, double montoPercibido, int horasExtras) {
		super(mes, concepto, montoPercibido);
		this.horasExtras = horasExtras;
	}
	
	@Override
	public int getHorasExtras() {
		return this.horasExtras;
	}
	
	
}
