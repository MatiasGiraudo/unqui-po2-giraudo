package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto producto1;
	Producto producto2;
	Producto producto3;
	
	@BeforeEach
	public void setUp() {
		producto1 = new Producto("Leche", 80.5, 10);
		producto2 = new Producto("Harina", 77.0, 25);
		producto3 = new ProductoCooperativa("Azucar", 49.80, 5);
	}
	
	@Test
	void testPrecio() {
		assertEquals(80.5, producto1.getPrecio());
		assertEquals(77, producto2.getPrecio());
		assertEquals(44.82, producto3.getPrecio());
	}
	
	@Test
	void testRegistrar() throws Exception {
		producto1.registrar();
		producto2.registrar();
		producto3.registrar();		
				
		assertEquals(9, producto1.getStock());
		assertEquals(24, producto2.getStock());
		assertEquals(4, producto3.getStock());
		
		Producto producto4 = new Producto("Yerba", 100, 0);
		Exception exception = assertThrows(Exception.class, () -> producto4.registrar());
		assertEquals("No hay stock disponible", exception.getMessage());				
	}
}
