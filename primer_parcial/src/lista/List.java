package lista;

public interface List<E> {
	// inserta un elemento al final de la lista
	public void add(E elemento);
	// se posicional al principio de la lista
	public void first();
	// retorna true si llegó al final de la lista
	public boolean atEnd();
	// avanza un nodo en la lista
	public void advance();
	// obtiene el elemento del nodo actual
	public E getCurrent();
}
