package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> listaIngresos = new ArrayList<Ingreso>();

	public List<Ingreso> getListaIngresos() {
		return listaIngresos;
	}

	public void nuevoIngreso(Ingreso ingreso) {
		this.listaIngresos.add(ingreso);
	}

	public double getTotalPercibido() {
		return this.listaIngresos.stream().mapToDouble(ingreso -> ingreso.getMontoPercibido()).sum();
	}

	public double getMontoImponible() {
		return this.listaIngresos.stream().filter(ingreso -> ingreso.getHorasExtras() == 0)
				.mapToDouble(ingreso -> ingreso.getMontoPercibido()).sum();
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
