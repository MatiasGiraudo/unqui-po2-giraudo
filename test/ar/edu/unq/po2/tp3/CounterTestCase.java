package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Instanciamos en contador
		counter = new Counter();
		//Agregamos una serie de 10 numeros de prueba
		counter.agregarNumero(1);
		counter.agregarNumero(3);
		counter.agregarNumero(5);
		counter.agregarNumero(7);
		counter.agregarNumero(9);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(4);
	}
	
	@Test
	public void testCantidadPares() {
		
		int totalPares = counter.getCantidadPares();
		
		assertEquals(totalPares, 1);
		
	}
	
	@Test void testCantidadImpares() {
		int totalImpares = counter.getCantidadImpares();
		
		assertEquals(totalImpares, 9);
	}
	
	@Test void testCantidadMultiplos() {
		int totalMultiplosDe4 = counter.getCantidadMultiplosDe(4);
		int totalMultiplosDe9 = counter.getCantidadMultiplosDe(9);
		
		assertEquals(totalMultiplosDe4, 6); //Tiene 6 multiplos ya que en la lista hay 5 unos, y 1 cuatro.
		assertEquals(totalMultiplosDe9, 7);
	}

}
