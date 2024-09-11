package tda.lista;
import nodo.Nodo;
import excepcion.MyException;

public class LinkedList<T> implements List<T> {
	private Nodo<T> head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void addFirst(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		nuevoNodo.setNext(head);
		head = nuevoNodo;
		size++;
	}
	
	public void addLast(T elemento) {
		Nodo<T> nuevoNodo = new Nodo<T>(elemento);
		if (head == null) {
			head = nuevoNodo;
		} else {
			Nodo<T> aux = head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(nuevoNodo);
		}
		size++;
	}
	
	public void removeFirst() throws MyException {
		if (head == null) {
			throw new MyException("Error. La lista se encuentra vacía");
		} else {
			head = head.getNext();
			size--;
		}
	}
	
	public void removeLast() throws MyException {
		if (head == null) {
			throw new MyException("Error. La lista se encuentra vacía");
		} else if (size == 1) {
			head = null;
		} else {
			Nodo<T> aux = head;
			Nodo<T> aux2 = aux.getNext();
			while (aux2.getNext() != null) {
				aux = aux2;
				aux2 = aux2.getNext();
			}
			aux.setNext(null);
			size--;
		}
	}
	
	public T get(int index) throws MyException {
		if (index < 0 || index >= size) {
			throw new MyException("Error. Índice fuera de rango");
		} else {
			Nodo<T> aux = head;
			for (int i = 0; i < index; i++) {
				aux = aux.getNext();
			}
			return aux.getElemento();
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
