package ar.edu.unq.po2.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadSemanalTest {
	DiaDeLaSemana dia;
	Deporte deporte;
	ActividadSemanal actividad1;
	ActividadSemanal actividad2;
	ActividadSemanal actividad3;
	ActividadSemanal actividad4;
	ActividadSemanal actividad5;
	ActividadSemanal actividad6;
	ActividadSemanal actividad7;
	
	@BeforeEach
	public void setUp() {
		actividad1 = new ActividadSemanal(dia.LUNES, "11:30", 1, deporte.FUTBOL);
		actividad2 = new ActividadSemanal(dia.MARTES, "15:00", 1, deporte.BASKET);
		actividad3 = new ActividadSemanal(dia.MIERCOLES, "18:30", 2, deporte.TENNIS);
		actividad4 = new ActividadSemanal(dia.JUEVES, "09:00", 2, deporte.FUTBOL);
		actividad5 = new ActividadSemanal(dia.VIERNES, "17:00", 1, deporte.RUNNING);
		actividad6 = new ActividadSemanal(dia.SABADO, "17:00", 1, deporte.FUTBOL);
		actividad7 = new ActividadSemanal(dia.DOMINGO, "13:45", 3, deporte.JABALINA);
	}
	
	@Test
	void testCostoActividades() {
		assertEquals(900, actividad1.costoActividad());
		assertEquals(900, actividad2.costoActividad());
		assertEquals(1600, actividad3.costoActividad());
		assertEquals(2400, actividad4.costoActividad());
		assertEquals(1200, actividad5.costoActividad());
		assertEquals(1400, actividad6.costoActividad());
		assertEquals(3800, actividad7.costoActividad());
	}

}
