package ar.edu.unq.po2.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeporteTest {
	Deporte deporte;

	@Test
	void testComplejidadDeportes() {
		assertEquals(1, deporte.RUNNING.getComplejidad());
		assertEquals(2, deporte.FUTBOL.getComplejidad());
		assertEquals(2, deporte.BASKET.getComplejidad());
		assertEquals(3, deporte.TENNIS.getComplejidad());
		assertEquals(4, deporte.JABALINA.getComplejidad());
	}

}
