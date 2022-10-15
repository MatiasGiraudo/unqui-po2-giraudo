package ar.edu.unq.po2.enums;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeportesMunicipalTest {

	SecretariaDeportesMunicipal secretaria;
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
		secretaria = new SecretariaDeportesMunicipal();
		
		actividad1 = new ActividadSemanal(dia.LUNES, "11:30", 1, deporte.FUTBOL);
		actividad2 = new ActividadSemanal(dia.MARTES, "15:00", 1, deporte.BASKET);
		actividad3 = new ActividadSemanal(dia.MIERCOLES, "18:30", 2, deporte.TENNIS);
		actividad4 = new ActividadSemanal(dia.JUEVES, "09:00", 2, deporte.FUTBOL);
		actividad5 = new ActividadSemanal(dia.VIERNES, "17:00", 1, deporte.RUNNING);
		actividad6 = new ActividadSemanal(dia.SABADO, "17:00", 1, deporte.FUTBOL);
		actividad7 = new ActividadSemanal(dia.DOMINGO, "13:45", 3, deporte.JABALINA);
		
		secretaria.addNuevaActividad(actividad1);
		secretaria.addNuevaActividad(actividad2);
		secretaria.addNuevaActividad(actividad3);
		secretaria.addNuevaActividad(actividad4);
		secretaria.addNuevaActividad(actividad5);
		secretaria.addNuevaActividad(actividad6);
		secretaria.addNuevaActividad(actividad7);
	}
	
	@Test
	void testListaDeFutbol() {
		
		List<ActividadSemanal> listaResultante = new ArrayList<ActividadSemanal>();
		
		listaResultante.add(actividad1);
		listaResultante.add(actividad4);
		listaResultante.add(actividad6);
		
		assertEquals(listaResultante, secretaria.actividadesDeFultbol());
	}
	
	@Test
	void testActividadesPorComplejidad() {
		
		List<ActividadSemanal> listaResultante = new ArrayList<ActividadSemanal>();
		
		listaResultante.add(actividad3);
				
		assertEquals(listaResultante, secretaria.actividadesPorComplejidad(3));
	}
	
	@Test
	void testCantidadHorasSemanales() {
		assertEquals(11, secretaria.cantidadHorasSemanales());
	}
	
	@Test
	void testActividadConMenorCosto() {
		ActividadSemanal actividadNueva = new ActividadSemanal(dia.MARTES, "13:45", 1, deporte.JABALINA);
		secretaria.addNuevaActividad(actividadNueva);
		
		System.out.println(actividadNueva.costoActividad());
		System.out.println(actividad7.costoActividad());
		
		assertEquals(actividad1, secretaria.actividadConMenorCosto(deporte.FUTBOL));
		assertEquals(actividadNueva, secretaria.actividadConMenorCosto(deporte.JABALINA));
	}

}
