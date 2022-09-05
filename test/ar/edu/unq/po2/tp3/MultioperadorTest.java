package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTest {
	Multioperador multioperador;
	
	@BeforeEach
	public void setUp() {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(5);
		listaNumeros.add(6);

		
		multioperador = new Multioperador(listaNumeros);
	}

	@Test
	void testMultioperadorSuma() {
		assertEquals(12, multioperador.resultadoSuma());
	}
	
	@Test
	void testMultioperadorResta() {
		assertEquals(-12, multioperador.resultadoResta());
	}
	
	@Test
	void testMultioperadorMultiplicacion() {
		assertEquals(30, multioperador.resultadoMultiplicacion());
	}

}
