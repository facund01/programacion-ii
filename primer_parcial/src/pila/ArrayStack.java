package pila;
import exception.MyException;
import lista.Node;

public class ArrayStack<E> implements Stack<E> {
	private E[] array;
	private int size;
	
	public ArrayStack() {
		array = (E[]) new Object[10];
		size = 0;
	}
	
	public void push(E elemento) throws MyException {
		if (array.length == size) {
			throw new MyException("la pila está llena.");
		} else {
			array[size] = elemento;
			size++;
		}
	}
	
	public E pop() throws MyException {
		if (isEmpty()) {
			throw new MyException("la pila está vacía.");
		} else {
			E salida = array[size - 1];
			array[size - 1] = null;
			size--;
			return salida;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
