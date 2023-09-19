package model.domain;


import java.util.Calendar;
import java.util.Date;

import model.util.ContratoPista1;
import model.util.ConversorFechas;

public class Avioneta extends Volador implements ContratoPista1 {
	
	// Atributos
	private Date fechaUltimaInspeccion;
	
	// Métodos
	public Avioneta (String nombre, int velMax, int altMax , int capMaxComb , int combActual , boolean desperfTec , String fechaUltInsp ) {
		this.nombre = nombre;
		this.velocidadMaxima = velMax ;
		this.capacidadMaximaCombustible = capMaxComb ;
		this.combustibleActual = combActual ;
		this.DesperfectoTecnico = desperfTec ;	
		this.fechaUltimaInspeccion = ConversorFechas.stringToDate(fechaUltInsp) ;
	}
	

	@Override
    public boolean cumpleContrato() {
         // Fecha actual
        Date fechaActual = new Date();

        // Utilizamos el método stringToDate de ConversorFechas para parsear la fecha de inspección
        Date fechaInspeccion = ConversorFechas.stringToDate(ConversorFechas.dateToString(this.fechaUltimaInspeccion));

        if (fechaInspeccion != null) {
            // Calculamos la fecha hace un año
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaActual);
            calendar.add(Calendar.YEAR, -1);
            Date fechaHaceUnAnio = calendar.getTime();

            // Comparamos la fecha de inspección con la fecha hace un año
            return fechaInspeccion.after(fechaHaceUnAnio);
        } else {
            // Si la fecha no se pudo parsear correctamente, consideramos que no cumple el contrato.
            return false;
        }
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
