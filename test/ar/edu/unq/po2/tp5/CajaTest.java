package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	Caja caja1;
	Producto producto1;
	Producto producto2;
	Producto producto3;
	
	@BeforeEach
	public void setUp() {
		caja1 = new Caja(1);
		
		producto1 = new Producto("Leche", 80.5, 10);
		producto2 = new Producto("Harina", 77.0, 25);
		producto3 = new ProductoCooperativa("Azucar", 49.80, 5);
		
	}
	
	@Test
	void testMontoAPagarCero() {
		assertEquals(0, caja1.getMontoAPagar());
	}
	
	@Test
	void testMontoAcumulado() throws Exception {
		caja1.registrarProducto(producto1);
		caja1.registrarProducto(producto1);
		
		assertEquals(161, caja1.getMontoAPagar());
		
		caja1.registrarProducto(producto2);
		caja1.registrarProducto(producto3);
		assertEquals(282.82, caja1.getMontoAPagar());
	}

}
