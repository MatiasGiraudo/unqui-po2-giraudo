package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	Ingreso ingreso;
	IngresoHorasExtras ingresoConExtras;
	
	@BeforeEach
	public void setUp() {
		ingreso = new Ingreso(2, "Sueldo", 10000);
		ingresoConExtras = new IngresoHorasExtras(5, "Horas Extras", 5000, 5);
	}
	
	@Test
	void testDatosIngreso() {
		assertEquals(2, ingreso.getMes());
		assertEquals("Sueldo", ingreso.getConcepto());
		assertEquals(10000, ingreso.getMontoPercibido());
	}

	@Test
	void testDatosIngresoConExtras() {
		assertEquals(5, ingresoConExtras.getMes());
		assertEquals("Horas Extras", ingresoConExtras.getConcepto());
		assertEquals(5000, ingresoConExtras.getMontoPercibido());
		assertEquals(5, ingresoConExtras.getHorasExtras());
	}
}
