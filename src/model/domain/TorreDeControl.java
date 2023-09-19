package model.domain;

public class TorreDeControl {

	
	
	public boolean puedeAterrizarEnPista1(Volador objeto) {
		boolean respuesta = false ;
				
		if (objeto instanceof AvionDeCarga) {
			respuesta = ((AvionDeCarga)objeto).cumpleContrato();
		} else if (objeto instanceof AvionDePersonas) {
			respuesta = ((AvionDePersonas)objeto).cumpleContrato();
		} else if (objeto instanceof Avioneta) {
			respuesta = ((Avioneta)objeto).cumpleContrato();
		} 
		return respuesta;
	}

	
	
	public boolean puedeAterrizarEnPista2(Volador objeto) {
		boolean respuesta = objeto.tieneUrgenciaDeAterrizaje(objeto);
		return respuesta;
	}
	
	
	
	
	
}
