package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumeroMayorParesTest {
	NumeroMayorPares numeroMayorPares;
	int[] arrayNumeros = {345, 22112, 8754, 222222};

	@BeforeEach
	public void setUp() {
		numeroMayorPares = new NumeroMayorPares();
	}

	@Test
	void testNumeroMayorPares() {
		assertEquals(222222,numeroMayorPares.numeroConMayorPares(arrayNumeros));
		
	}
	
	@Test
	void testFallaNumeroMayorPares() {
	 
		assertNotEquals(345, numeroMayorPares.numeroConMayorPares(arrayNumeros));
	}

}
