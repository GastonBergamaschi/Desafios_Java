package Principal;

import model.domain.AvionDeCarga;
import model.domain.AvionDePersonas;
import model.domain.Avioneta;
import model.domain.TorreDeControl;
import model.domain.Volador;


public class Main {

	public static void main(String[] args) {
		

		TorreDeControl torre1 = new TorreDeControl();

		Volador[] objetosVoladores = new Volador[100] ;
		
// Creamos y agregamos al array dos objetos de tipo "AvionDeCarga"		
// String nombre, int velMax, int altMax , int capMaxComb , int combActual , boolean desperfTec , int capacDeCarga
		objetosVoladores[0] = new AvionDeCarga ("avionDeCarga1" , 800 , 3000 , 5000 , 3000 , false , 3500 );
		objetosVoladores[1] = new AvionDeCarga ("avionDeCarga2" , 900 , 3300 , 6000 , 90 , false , 950 );
		objetosVoladores[2] = new AvionDeCarga ("avionDeCarga3" , 900 , 3300 , 6000 , 200 , false , 950 );
		
// Creamos y agregamos al array dos objetos de tipo "AvionDePersonas"		
// String nombre, int velMax, int altMax , int capMaxComb , int combActual , boolean desperfTec , int canAsientos 		
		objetosVoladores[3] = new AvionDePersonas ("avionDePersonas1" , 1000 , 3500 , 5500 , 4000 , false , 400);
		objetosVoladores[4] = new AvionDePersonas ("avionDePersonas2" , 1000 , 3500 , 6000 , 4500 , true , 250 );
		objetosVoladores[5] = new AvionDePersonas ("avionDePersonas3" , 1000 , 3500 , 6000 , 4500 , false , 250 );
		
// Creamos y agregamos al array dos objetos de tipo "Avioneta"				
//String nombre, int velMax, int altMax , int capMaxComb , int combActual , boolean desperfTec , String fechaUltimaIns		
		objetosVoladores[6] = new Avioneta ("avioneta1" , 500 , 2000 , 2000 , 1500 , false , "02/02/2023" );
		objetosVoladores[7] = new Avioneta ("avioneta2" , 600 , 2500 , 2000 , 70 , false , "01/01/2021" );
		objetosVoladores[8] = new Avioneta ("avioneta3" , 600 , 2500 , 2000 , 800 , false , "01/01/2021" );		
		
		for (Volador objeto : objetosVoladores) {
			if(objeto != null) {
			
				System.out.print( objeto.getNombre() + ": " );
				boolean respuesta1 = torre1.puedeAterrizarEnPista1(objeto);
				if (respuesta1) {
					System.out.println("Puede aterrizar en la pista 1.");
				} else {
					boolean respuesta2 = torre1.puedeAterrizarEnPista2(objeto);
					if (respuesta2) {
						System.out.println("Puede aterrizar en la pista 2.");
					} else {
						System.out.println("No puede aterrizar en ninguna pista.");
					}
				}
			} 
		}
				
		
	}

}
