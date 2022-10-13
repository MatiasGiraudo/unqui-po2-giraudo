package ar.edu.unq.po2.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LesionDermatologicaTest {
	
	LesionDermatologica lesion; 
	
	@Test
	void testDescripcionYNivelRiesgoLesiones() {
		assertEquals("Lesion leve", lesion.ROJO.getDescripcion());
		assertEquals("Lesion media", lesion.GRIS.getDescripcion());
		assertEquals("Lesion intensa", lesion.AMARILLO.getDescripcion());
		assertEquals("Lesion grave", lesion.MIEL.getDescripcion());
		
		assertEquals(1, lesion.ROJO.getNivelRiesgo());
		assertEquals(2, lesion.GRIS.getNivelRiesgo());
		assertEquals(3, lesion.AMARILLO.getNivelRiesgo());
		assertEquals(4, lesion.MIEL.getNivelRiesgo());
	}
	
	@Test
	public void testSiguienteLesion() {
		assertEquals(lesion.GRIS, lesion.ROJO.siguienteLesion());
		assertEquals(lesion.AMARILLO, lesion.GRIS.siguienteLesion());
		assertEquals(lesion.MIEL, lesion.AMARILLO.siguienteLesion());
		assertEquals(lesion.ROJO, lesion.MIEL.siguienteLesion());
		
	}

}
