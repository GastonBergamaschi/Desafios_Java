package model.domain;

import model.util.ContratoPista1;


public class AvionDeCarga extends Volador implements ContratoPista1  {

	// Atributos
	private int capacidadDeCarga ;

	
	// Métodos
	public AvionDeCarga (String nombre, int velMax, int altMax , int capMaxComb , int combActual , boolean desperfTec , int capacDeCarga ) {
		this.nombre = nombre;
		this.velocidadMaxima = velMax ;
		this.capacidadMaximaCombustible = capMaxComb ;
		this.combustibleActual = combActual ;
		this.DesperfectoTecnico = desperfTec ;	
		this.capacidadDeCarga = capacDeCarga ;
	}

		
	public int getCapacidadDeCarga() {
		return capacidadDeCarga;
	}


	@Override
    public boolean cumpleContrato() {
        int capacidadMinima = 1000;     // Capacidad mínima requerida en kilogramos 
        int capacidadActual = getCapacidadDeCarga(); 
        return capacidadActual >= capacidadMinima;
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
