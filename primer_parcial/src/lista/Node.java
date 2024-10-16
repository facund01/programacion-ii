package lista;

public class Node<E> {
	private E elemento;
	private Node<E> next;
	
	public Node(E elemento) {
		this.elemento = elemento;
		this.next = null;
	}
	
	// getters
	public E getElement() {
		return elemento;
	}
	
	public Node<E> getNext() {
		return next;
	}
	
	// setters
	public void setElement(E elemento) {
		this.elemento = elemento;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}
}
