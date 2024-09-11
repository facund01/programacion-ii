package ejercicio.invertircadena;
import tda.pila.LinkedStack;

public class InvertirCadena {

	public static void main(String[] args) {
		System.out.println("Ingrese una cadena para invertir: ");
		String cadena = System.console().readLine();
		char[] caracteres = cadena.toCharArray();
		LinkedStack<Character> pila = new LinkedStack<Character>();
		for (int i = 0; i < caracteres.length; i++) {
			pila.push(caracteres[i]);
		}
		System.out.println("La salida es: ");
		while (!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	}
}
