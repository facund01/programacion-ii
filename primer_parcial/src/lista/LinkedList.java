package lista;
import exception.MyException;

public class LinkedList<E> implements List<E> {
	private Node<E> head;
	private Node<E> current;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public void add(E elemento) {
		Node<E> nuevoNodo = new Node<E>(elemento);
		nuevoNodo.setNext(head);
		head = nuevoNodo;
		size++;
	}
	
	public void first() {
		current = head;
	}
	
	public boolean atEnd() {
		return current == null;
	}
	
	public void advance() throws MyException {
		if (current == null) {
			throw new MyException("fuera de lista.");
		} else {
			current = current.getNext();
		}
	}
	
	public E getCurrent() throws MyException {
		if (current == null) {
			throw new MyException("no se puede devolver el elemento actual porque el nodo es nulo.");
		} else {
			return current.getElement();
		}
	}
}
