package pila;
import exception.MyException;

public interface Stack<E> {
	// inserta un elemento en la pila
	public void push(E elemento) throws MyException;
	// elimina el último elemento de la pila
	public E pop() throws MyException;
	// retorna true si la pila está vacía
	public boolean isEmpty();
}
