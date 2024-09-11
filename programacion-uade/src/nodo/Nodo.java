package nodo;

public class Nodo<T> {
	private T elemento;
	private Nodo<T> next;
	
	public Nodo(T elemento) {
		this.elemento = elemento;
		this.next = null;
	}
	
	// getters
	public T getElemento() {
		return elemento;
	}
	
	public Nodo<T> getNext() {
		return next;
	}
	
	// setters
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	
	public void setNext(Nodo<T> next) {
		this.next = next;
	}
}
