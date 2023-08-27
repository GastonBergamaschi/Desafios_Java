package Principal;

public class Alumno {
	
	
	    private String nombre;
	    private String apellido;
	    private double[] notas;

	    public Alumno(String nombre, String apellido, double[] notas) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.notas = notas;
	    }

	    public double calcularPromedio() {
	        double total = 0;
	        for (double nota : notas) {
	            total += nota;
	        }
	        return total / notas.length;
	    }

	    
	    public String informePromedio() {
	        return nombre + " " + apellido + " - Promedio: " + calcularPromedio();
	    }
	
	
	
	
	
	

}
