package tda.pila;

public interface Stack<T> {
	// agrega un elemento al tope de la pila
	void push(T elemento);
	
	// quita el elemento del tope de la pila y lo retorna
	T pop(); 
	
	// devuelve el elemento del tope de la pila
	T peek(); 
	
	// devuelve el tamaño de la pila
	int getSize(); 
	
	// devuelve un boolean para saber si la pila se encuentra vaciía
	boolean isEmpty(); 
}
