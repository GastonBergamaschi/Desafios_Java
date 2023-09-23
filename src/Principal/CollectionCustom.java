package Principal;

public class CollectionCustom <T> {
	
	// Atributos
	protected Object[] array;
	//protected T[] array;
	private int size;
	private int capacidad;

	
	// Métodos
	
	// Constructor
	public CollectionCustom(int capacidad) {
		this.capacidad = capacidad;
		array = new Object[capacidad];
		size = 0;
	}

	// Método que retorna el tamaño del arreglo  
	public int size() {
		return size;
	}

	// Método que retorna el tamaño del arreglo  
	public int capacidad() {
		return capacidad;
	}
	
	// Método que agrega un elemento en la primera posición del arreglo. 	
	public void addFirst(T element) {
		if (isComplete()) {
			System.out.println("El arreglo está completo, no se puede agregar más elementos.");
			return;
		}

		for (int i = size; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = element;
		size++;
	}

	//  Método que agrega un elemento en la última posición del arreglo. 	
	public void addLast(T element) {
	    if (isComplete()) {
	        System.out.println("El arreglo está completo, no se puede agregar más elementos.");
	        return;
	    }

	    int lastIndex = capacidad - 1; // Última posición del arreglo

	    // Buscar la última posición vacía hacia atrás
	    while (lastIndex >= 0 && array[lastIndex] != null) {
	        lastIndex--;        //lastIndex queda con el indice de la primera posicion vacia yendo de atrás hacia adelante    
	    }

	    // Desplazar los valores hacia adelante desde la última posición ocupada hasta la última posición vacía
	    for (int i = lastIndex; i < capacidad - 1; i++) {
	       /* if (array[i] != null) {
	            array[i + 1] = array[i];
	        } */
	        array[i]= array[i+1]; 
	    }

	    // Agregar el elemento en la última posición vacía
	    array[capacidad-1] = element;
	    size++;
	}


	//  Método que agrega un elemento en la primera posición que se encuentra vacía en el arreglo. 	
	public void add(T element) {
		if (isComplete()) {
			System.out.println("El arreglo está completo, no se puede agregar más elementos.");
			return;
		}

		for (int i = 0; i < capacidad; i++) {
			if (array[i] == null) {
				array[i] = element;
				size++;
				return;
			}
		}
	}

	// Método remueve al primer elemento pasado por parámetro y lo retorna 
	public T remove(T element) {
		int index = indexOf(element);
		if (index == -1) {
			return null; 
		}
		T removedElement = (T) array[index];
		array[index] = null; 
		size--;
		return removedElement;
	}

	// Método que remueve a todos los elementos que coincidan con el elemento pasado por parámetro. 
	public void removeAll(T element) {
		int index;
		while ((index = indexOf(element)) != -1) {
			remove(element);
		}
	}

	// Método que indica si el arreglo está vacio 
	public boolean empty() {
		return size == 0;
	}
	
	// Método que indica si el arreglo está completo 
	public boolean isComplete() {
		return size >= capacidad;
	}

	// Método que retorna el índice del elemento pasado por parámetro
	private int indexOf(T element) {
	    if (element == null) {
	        for (int i = 0; i < size; i++) {
	            if (array[i] == null) {
	                return i;
	            }
	        }
	    } else {
	        for (int i = 0; i < size; i++) {
	            if (element.equals(array[i])) {
	                return i;
	            }
	        }
	    }
	    return -1; 
	}
	
	
	public void mostrarContenido() {
		for (int i = 0; i < capacidad ; i++) {
			System.out.println("Posicion "+ i +": " + array[i]);
		}
		
	}
	
	
}
