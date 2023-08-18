package Principal;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;        //Creamos el objeto scanner
		
		System.out.println("Usted deberá ingresar una fecha con el siguiente formato: dd/mm/yyyy");
		System.out.println("Ingrese el día (dd): ");
		int dia = scanner.nextInt(); 
		
		System.out.println("Ingrese el mes (mm): ");
		int mes = scanner.nextInt(); 
		
		System.out.println("Ingrese el año (yyyy): ");
		int anio = scanner.nextInt(); 
		
		boolean anioBisiesto = false ;
		boolean anioCorrecto = false ;
		boolean mesCorrecto = false ; 
		boolean diaCorrecto = false ;
		
		
		if (anio>=1900 && anio<=2099) {
			anioCorrecto = true ;
			if (anio%4 == 0) {
				anioBisiesto = true ;
			}
		}
		
		if (mes>=1 && mes<=12) {
			mesCorrecto = true ;
		}
		
		
		if ( (anioCorrecto && anioBisiesto) && mesCorrecto) {
			if (mes==2 && (dia>=1 && dia<=29) ) {
				diaCorrecto = true; 
			} else if ( ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)) && (dia>=1 && dia<=31) ) {
				diaCorrecto = true;
			} else if ( ((mes==4)||(mes==6)||(mes==9)||(mes==11)) && (dia>=1 && dia<=30) ) {
				diaCorrecto = true;
			}
			
		} else if (anioCorrecto && !anioBisiesto){
			if (mes==2 && (dia>=1 && dia<=28) ) {
				diaCorrecto = true; 
			} else if ( ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)) && (dia>=1 && dia<=31) ) {
				diaCorrecto = true;
			} else if ( ((mes==4)||(mes==6)||(mes==9)||(mes==11)) && (dia>=1 && dia<=30) ) {
				diaCorrecto = true;
			}
			
		}
		
		
		if (anioCorrecto && mesCorrecto && diaCorrecto) {
			System.out.println("La fecha ingresada: "+dia+"/"+mes+"/"+anio+" ES CORRECTA");
		} else {
			System.out.println("La fecha ingresada: "+dia+"/"+mes+"/"+anio+" NO ES CORRECTA");
		}
		

	}

}
