package ar.edu.unq.po2.enums;

public enum LesionDermatologica {
	  
	ROJO("Lesion leve", 1), 
	GRIS("Lesion media", 2),
	AMARILLO("Lesion intensa", 3),
	MIEL("Lesion grave", 4){
		@Override
		public LesionDermatologica siguienteLesion() {
			return LesionDermatologica.values()[0];
		}
	};
	
	private String descripcion;
	private int nivelRiesgo;
	
 	
	private LesionDermatologica(String descripcion, int nivelRiesgo) {
		this.descripcion = descripcion;
		this.nivelRiesgo = nivelRiesgo;	
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getNivelRiesgo() {
		return nivelRiesgo;
	}
	
	public LesionDermatologica siguienteLesion() {
		return LesionDermatologica.values()[this.ordinal() + 1];
	}
	
	
}
