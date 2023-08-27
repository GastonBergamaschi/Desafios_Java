package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("ESCUELA PRIMARIA  XYZ");

		Scanner scanner = new Scanner(System.in);        //Creamos el objeto scanner
		
		System.out.print("Ingrese la cantidad de alumnos a procesar: ");
		int cantidadAlumnos = scanner.nextInt();
		        
		Alumno[] alumnos = new Alumno[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos para el alumno " + (i + 1) + ":");
            scanner.nextLine();          
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            
            System.out.print("Número de exámenes: ");
            int numExamenes = scanner.nextInt();
            
            double[] notas = new double[numExamenes];
            for (int j = 0; j < numExamenes; j++) {
                System.out.print("Nota del examen " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            
            alumnos[i] = new Alumno(nombre, apellido, notas);
        }

        
     // Buscar alumnos con la calificación más alta
        Alumno[] mejoresAlumnos = new Alumno[cantidadAlumnos];
        int numMejoresAlumnos = 0;
        double maxPromedio = -1;

        for (int i = 0; i < cantidadAlumnos; i++) {
            double promedio = alumnos[i].calcularPromedio();

            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                numMejoresAlumnos = 1;  // Esta variable me permite contabilizar cuantos alumnos comparten la nota más alta, 
                                        // y a su vez me sirve como índice para ir moviendome en el arreglo "mejoresAlumnos"
                						// que es donde voy a ir almacenando el o los alumnos con mejor promedio.
                mejoresAlumnos[0] = alumnos[i];
            } else if (promedio == maxPromedio) {
                mejoresAlumnos[numMejoresAlumnos] = alumnos[i];
                numMejoresAlumnos++;        
            }
        }
        
     // Imprimir alumnos con la calificación más alta
        System.out.println("\nAlumno/s con la calificación más alta:");
        for (int i = 0; i < numMejoresAlumnos; i++) {
            System.out.println(mejoresAlumnos[i].informePromedio());
        }

        
	 // Buscar alumnos con la calificación más baja
        Alumno[] peoresAlumnos = new Alumno[cantidadAlumnos];
        int numPeoresAlumnos = 0;
        double minPromedio = 10;

        for (int i = 0; i < cantidadAlumnos; i++) {
            double promedio = alumnos[i].calcularPromedio();

            if (promedio < minPromedio) {
                minPromedio = promedio;
                numPeoresAlumnos = 1;  // Esta variable me permite contabilizar cuantos alumnos comparten la nota más baja
                					   // y a su vez me sirve como índice para ir moviendome en el arreglo "peoresAlumnos"
                					   // que es donde voy a ir almacenando el o los alumnos con peor promedio.                
                	
                peoresAlumnos[0] = alumnos[i];
            } else if (promedio == minPromedio) {
                peoresAlumnos[numPeoresAlumnos] = alumnos[i];
                numPeoresAlumnos++;        
            }
        }
        
     // Imprimir alumnos con la calificación más baja
        System.out.println("\nAlumno/s con la calificación más baja:");
        for (int i = 0; i < numPeoresAlumnos; i++) {
            System.out.println(peoresAlumnos[i].informePromedio());
        }
        
        
     // Imprimir los alumnos que promocionan 
        System.out.println("\nAlumnos que promocionan:");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (alumnos[i].calcularPromedio() >= 7) {
                System.out.println(alumnos[i].informePromedio());
            }
        }
        
     // Imprimir los alumnos que recursan     
        System.out.println("\nAlumnos que deben recursar:");
        for (int i = 0; i < cantidadAlumnos; i++) {
            if (alumnos[i].calcularPromedio() < 7) {
                System.out.println(alumnos[i].informePromedio());
            }
        }
        

        scanner.close();

	}

}
