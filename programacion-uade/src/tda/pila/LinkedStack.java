package tda.pila;
import nodo.Nodo;
import excepcion.MyException;

public class LinkedStack<T> implements Stack<T> {
	private Nodo<T> top;
	private int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public void push(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<>(elemento);
		nuevoNodo.setNext(top);
		top = nuevoNodo;
		size++;
	}
	
	public T pop() throws MyException {
		if (top == null) {
			throw new MyException("Error. La pila se encuentra vacía");
		} else {
			Nodo<T> salida = top;
			top = top.getNext();
			size--;
			return salida.getElemento();
		}
	}
	
	public T peek() throws MyException {
		if (top == null) {
			throw new MyException("Error. La pila se encuentra vacía");
		} else {
			return top.getElemento();
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
