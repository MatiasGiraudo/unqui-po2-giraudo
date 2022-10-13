package ar.edu.unq.po2.enums;

public class ActividadSemanal {

	private DiaDeLaSemana diaDeLaSemana;
	private String horaInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, String horaInicio, int duracion, Deporte deporte) {
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}
	
	public String getHoraInicio() {
		return horaInicio;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public float costoActividad() {
		int precioSegunDia = 0;
		
		if(this.getDiaDeLaSemana() == diaDeLaSemana.LUNES || this.getDiaDeLaSemana() == diaDeLaSemana.MARTES || this.getDiaDeLaSemana() == diaDeLaSemana.MIERCOLES) {
			precioSegunDia=  500;
		}
		else {
			precioSegunDia = 1000;
		}		   
		
		return (this.getDuracion() * precioSegunDia) + (this.getDeporte().getComplejidad() * 200);
	}
	
	
	
}
