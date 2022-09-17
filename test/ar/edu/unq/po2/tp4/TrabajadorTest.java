package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	Trabajador trabajador;
	Ingreso ingreso1;
	Ingreso ingreso2;
	IngresoHorasExtras ingresoConExtras1;
	IngresoHorasExtras ingresoConExtras2;

	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingreso1 = new Ingreso(2, "Sueldo", 10000);
		ingreso2 = new Ingreso(8, "Cliente", 8000);
		ingresoConExtras1 = new IngresoHorasExtras(5, "Horas Extras", 5000, 5);
		ingresoConExtras2 = new IngresoHorasExtras(1, "Horas Extras", 8000, 8);
		
		trabajador.nuevoIngreso(ingreso1);
		trabajador.nuevoIngreso(ingreso2);
		trabajador.nuevoIngreso(ingresoConExtras1);
		trabajador.nuevoIngreso(ingresoConExtras2);
	}

	@Test
	void testDatosIngreso1() {
		assertEquals(2, ingreso1.getMes());
		assertEquals("Sueldo", ingreso1.getConcepto());
		assertEquals(10000, ingreso1.getMontoPercibido());
	}
	
	@Test
	void testDatosIngreso2() {
		assertEquals(8, ingreso2.getMes());
		assertEquals("Cliente", ingreso2.getConcepto());
		assertEquals(8000, ingreso2.getMontoPercibido());
	}

	@Test
	void testDatosIngresoConExtras1() {
		assertEquals(5, ingresoConExtras1.getMes());
		assertEquals("Horas Extras", ingresoConExtras1.getConcepto());
		assertEquals(5000, ingresoConExtras1.getMontoPercibido());
		assertEquals(5, ingresoConExtras1.getHorasExtras());
	}
	
	@Test
	void testDatosIngresoConExtras2() {
		assertEquals(1, ingresoConExtras2.getMes());
		assertEquals("Horas Extras", ingresoConExtras2.getConcepto());
		assertEquals(8000, ingresoConExtras2.getMontoPercibido());
		assertEquals(8, ingresoConExtras2.getHorasExtras());
	}
	
	@Test
	void testTotalPercibido() {
		assertEquals(31000, trabajador.getTotalPercibido());
	}
	
	@Test
	void testTotalImponible() {
		assertEquals(18000, trabajador.getMontoImponible());
	}
	
	@Test
	void testImpuestosAPagar() {
		assertEquals(360, trabajador.getImpuestoAPagar());
	}

}
