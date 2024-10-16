package conjunto;
import exception.MyException;
import lista.LinkedList;

public class ArraySet<E> implements Set<E> {
	private E[] array;
	private int size;
	
	public ArraySet() {
		array = (E[]) new Object[10];
		size = 0;
	}
	
	public void insert(E x) throws MyException {
		if (!member(x)) {
			if (array.length == size) {
				throw new MyException("el conjunto esá lleno.");
			} else {
				array[size] = x;
				size++;
			}
		}
	}
	
	public void delete(E x) {
		int i = 0;
		boolean esMiembro = false;
		while (!esMiembro && i < size) {
			if (array[i].equals(x)) {
				esMiembro = true;
				array[i] = array[size - 1];
				size--;
			} else {
				i++;
			}
		}
	}
	
	public Set<E> intersection(Set<E> s) {
		ArraySet<E> salida = new ArraySet<E>();
		for (int i = 0; i < size; i++) {
			if (s.member(array[i])) {
				salida.insert(array[i]);
			}
		}
		return salida;
	}
	
	public Set<E> union(Set<E> s) {
		ArraySet<E> salida = new ArraySet<E>();
		for (int i = 0; i < size; i++) {
			salida.insert(array[i]);
		}
		LinkedList<E> valoresDeS = s.values();
		valoresDeS.first();
		while (!valoresDeS.atEnd()) {
			E elemento = valoresDeS.getCurrent();
			salida.insert(elemento);
			valoresDeS.advance();
		}
		return salida;
	}
	
	public boolean member(E x) {
		int i = 0;
		boolean esMiembro = false;
		while (!esMiembro && i < size) {
			if (array[i].equals(x)) {
				esMiembro = true;
			} else {
				i++;
			}
		}
		return esMiembro;
	}
	
	public LinkedList<E> values() {
		LinkedList<E> salida = new LinkedList<E>();
		for (int i = 0; i < size; i++) {
			salida.add(array[i]);
		}
		return salida;
	}
}
