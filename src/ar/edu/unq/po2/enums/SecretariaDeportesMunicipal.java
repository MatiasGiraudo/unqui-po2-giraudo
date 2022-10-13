package ar.edu.unq.po2.enums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecretariaDeportesMunicipal {
	
	Deporte deporte;
	List<ActividadSemanal> listActividades = new ArrayList<ActividadSemanal>();
	
	public List<ActividadSemanal> getListActividades() {
		return listActividades;
	}

	public void addNuevaActividad(ActividadSemanal actividadSemanal) {
		this.listActividades.add(actividadSemanal);
	}
	
	public List<ActividadSemanal> actividadesDeFultbol(){
		return this.listActividades.stream().filter(actividad -> actividad.getDeporte() == deporte.FUTBOL).toList();
	}

	public List<ActividadSemanal> actividadesPorComplejidad(int complejidad){
		return this.listActividades.stream().filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public int cantidadHorasSemanales() {
		return this.listActividades.stream().mapToInt(actividad -> actividad.getDuracion()).sum();
	}
	
	public ActividadSemanal actividadConMenorCosto(Deporte deporte) {
		return this.listActividades.stream().min(Comparator.comparing(ActividadSemanal::costoActividad)).get(); 
	}
	
	/*public Map<Deporte, ActividadSemanal> actividadPorDeporte(){
		return this.listActividades.stream().collect(Collectors.groupingBy(ActividadSemanal::actividadConMenorCosto(Deporte)));
	}*/
	
	
}
