package Principal;

public class Main {

	public static void main(String[] args) {
		
		// Creamos la primera colección de enteros 
		CollectionCustom<Integer> coleccion1 = new CollectionCustom<>(7);

		// Agregarmos elementos
		coleccion1.addLast(1);
		coleccion1.addLast(2);   
		coleccion1.addFirst(5);
		coleccion1.add(4);
		coleccion1.addFirst(7);
		
		coleccion1.add(5);		
		coleccion1.addLast(31);
	
		
		// Mostrar tamaño y contenido
		System.out.println("Tamaño de la colección: " + coleccion1.size());
		System.out.println("");
		
		System.out.println("Contenido de la colección: ");
		coleccion1.mostrarContenido();

		

		// Comprobar si la colección está vacía
		System.out.println("");
		System.out.println("La colección está vacía: " + coleccion1.empty());

		//Removemos el elemento 5
		System.out.println("");
		coleccion1.removeAll(5); 
		
		// Vemos cómo quedó el contenido de la colección 
		System.out.println("Contenido de la colección: ");
		coleccion1.mostrarContenido();
		
		System.out.println("Tamaño de la colección: " + coleccion1.size());
		System.out.println("");
		
		
		// Creamos otra colección de String
		
		CollectionCustom<String> coleccion2 = new CollectionCustom<>(7);

		// Agregarmos elementos
		coleccion2.addLast("Hola");
		coleccion2.addLast("mundo");   
		coleccion2.addFirst("Casa");
		coleccion2.add("Auto");
		coleccion2.addFirst("Juan");
		
		coleccion2.add("Pedro");		
		coleccion2.addLast("Auto");
		
		// Mostrar tamaño y contenido
		System.out.println("Tamaño de la colección: " + coleccion2.size());
		System.out.println("");
				
		System.out.println("Contenido de la colección: ");
		coleccion2.mostrarContenido();
		
		//Removemos el elemento "Auto"
		System.out.println("");
		coleccion2.remove("Auto"); 
				
		// Vemos cómo quedó el contenido de la colección 
		System.out.println("Contenido de la colección: ");
		coleccion2.mostrarContenido();

		
	}

}
