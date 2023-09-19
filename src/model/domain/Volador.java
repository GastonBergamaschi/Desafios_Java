package model.domain;

public abstract class Volador {
	
	// Atributos
	protected String nombre ;
	protected int velocidadMaxima ;
	protected int alturaMaxima ; 
	protected int capacidadMaximaCombustible ;                   
	protected int combustibleActual ;
	protected boolean DesperfectoTecnico ;


	// Métodos
	
	public String getNombre() {
		return nombre;
	}
		
	
	public int getCombustibleActual() {
		return combustibleActual;
	}

	public boolean getDesperfectoTecnico() {
		return DesperfectoTecnico;
	}

	public void setDesperfectoTecnico(boolean desperfectoTecnico) {
		DesperfectoTecnico = desperfectoTecnico;
	}
	
	

	public boolean tieneUrgenciaDeAterrizaje(Volador objeto) {
		boolean respuesta = false;
		if(objeto.DesperfectoTecnico || objeto.getCombustibleActual()<100)
			respuesta = true;
		
		return respuesta;	
	}	

	
	
}
