package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
		arroz = new ProductoPrimeraNecesidad("Arroz", 5d, false, 8);
	}

	@Test
	public void testCalcularPrecioLeche() {
		assertEquals(7.2, leche.getPrecio());
	}

	@Test
	public void testCalcularPrecioArroz() {
		assertEquals(4.6, arroz.getPrecio());
	}
}
