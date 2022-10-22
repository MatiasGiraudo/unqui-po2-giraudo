package ar.edu.unq.po2.tp3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {
	private String nombre;
	private String fechaNacimiento;
	
	public Persona(String nombre, Date fechaNaciemiento) {
		this.nombre = nombre;
		this.nombre = nombre;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.fechaNacimiento = dateFormat.format(fechaNacimiento);
	}

	public String getNombre() {
		return nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	//1 Cualquier otro objeto que envie el mensaje edad sobre la persona no sabe como la calcula.
	//Esta mecanismo de abstraccion se llama polimorfismo.
	public int edad() {
		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate fechaNac = LocalDate.parse(this.fechaNacimiento, fmt);
	        LocalDate ahora = LocalDate.now();

	        Period periodo = Period.between(fechaNac, ahora);
	        return periodo.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
}
