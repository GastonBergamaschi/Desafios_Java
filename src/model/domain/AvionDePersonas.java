package model.domain;

import model.util.ContratoPista1;

public class AvionDePersonas extends Volador implements ContratoPista1 {
	
	// Atributos
	private int cantidadDeAsientos ; 
	
	
	// Métodos 
	public AvionDePersonas (String nombre, int velMax, int altMax , int capMaxComb , int combActual , boolean desperfTec , int canAsientos ) {
		this.nombre = nombre;
		this.velocidadMaxima = velMax ;
		this.capacidadMaximaCombustible = capMaxComb ;
		this.combustibleActual = combActual ;
		this.DesperfectoTecnico = desperfTec ;	
		this.cantidadDeAsientos = canAsientos ;
	}
	
	
	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}
	
	@Override
    public boolean cumpleContrato() {
        int cantidadMinima = 300;     // Capacidad mínima requerida de asientos 
        int capacidadActual = getCantidadDeAsientos(); 
        return capacidadActual >= cantidadMinima;
	}
	
	/*	
	@Override
	public boolean tieneUrgenciaDeAterrizaje(Volador objeto) {
		boolean respuesta = false;
		if(objeto.DesperfectoTecnico || objeto.getCombustibleActual()<100)
			respuesta = true;
		return respuesta;	
	}
	*/
			
}
