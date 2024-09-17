package tda.lista;

public interface List<T> {
	// agrega un elemento al principio de la lista
	void addFirst(T elemento); 
	
	// agrega un elemento al final de la lista
	void addLast(T elemento); 
	
	// elimina el primer elemento de la lista
	void removeFirst(); 
	
	// elimina el último elemento de la lista
	void removeLast(); 
	
	// devuelve el elemento indicado por su posición en la lista
	T get(int index);
	
	// devuelve el tamaño de la lista
	int getSize();
	
	// devuelve un boolean para saber si la lista se encuentra vacía
	boolean isEmpty(); 
}