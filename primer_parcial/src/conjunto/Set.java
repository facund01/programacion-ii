package conjunto;
import exception.MyException;
import lista.LinkedList;

public interface Set<E> {
	// inserta un elemento x en el conjunto
	public void insert(E x) throws MyException;
	// elimina el elemento x del conjunto
	public void delete(E x);
	// retorna true si x pertenece al conjunto
	public boolean member(E x);
	// intersecta dos conjuntos y retorna un nuevo conjunto
	public Set<E> intersection(Set<E> s);
	// une dos conjuntos y retorna un nuevo conjunto
	public Set<E> union(Set<E> s);
	// retorna una lista de E con todos los elementos del conjunto
	public LinkedList<E> values();
}
