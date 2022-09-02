package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	private Counter counter;
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	@Test
	public void testCantPares() {
		assertEquals(counter.cantPares(), 1);
	}
	
	@Test
	public void testCantImpares() {
		assertEquals(counter.cantImpares(), 9);
	}
	
	@Test
	public void testCantMultiplos() {
		assertEquals(counter.cantidadMultiplosDe(1), 5);
		assertEquals(counter.cantidadMultiplosDe(9), 7);
		assertEquals(counter.cantidadMultiplosDe(3), 6);
	}

}
