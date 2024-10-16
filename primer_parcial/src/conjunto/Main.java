package conjunto;
import exception.MyException;
import lista.LinkedList;
import java.util.Scanner;
import pila.ArrayStack;

public class Main {

	public static void main(String[] args) {
		ArraySet<String> conjuntoA = new ArraySet<String>();
		ArraySet<String> conjuntoB = new ArraySet<String>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingrese un elemento para A: ");
			String input = scanner.nextLine();
			while (!validarHTML(input)) {
				System.out.print("El elemento ingresado no es input HTML válido, ingrese un elemento para A: ");
				input = scanner.nextLine();
			}
			conjuntoA.insert(input);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Ingrese un elemento para B: ");
			String input = scanner.nextLine();
			while (!validarHTML(input)) {
				System.out.print("El elemento ingresado no es input HTML válido, ingrese un elemento para B: ");
				input = scanner.nextLine();
			}
			conjuntoB.insert(input);
		}
		
		System.out.println("");
		
		Set<String> unionAB = conjuntoA.union(conjuntoB);
		LinkedList<String> union = unionAB.values();
		System.out.println("Union de A y B: ");
		union.first();
		while (!union.atEnd()) {
			String elemento = union.getCurrent();
			System.out.println(elemento);
			union.advance();
		}
		
		System.out.println("");
		
		Set<String> intersectionAB = conjuntoA.intersection(conjuntoB);
		LinkedList<String> intersection = intersectionAB.values();
		System.out.println("Intersección de A y B: ");
		intersection.first();
		while (!intersection.atEnd()) {
			String elemento = intersection.getCurrent();
			System.out.println(elemento);
			intersection.advance();
		}
	}
	
	public static boolean validarHTML(String s) {
		char[] caracteres = s.toCharArray();
		ArrayStack<Character> pila = new ArrayStack<Character>();
		
		if (caracteres[0] != '<') {
			return false;
		} else {
			for (int i = 0; i < caracteres.length; i++) {
				if (caracteres[i] == '<') {
					pila.push(caracteres[i]);
				} else if (caracteres[i] == '>') {
					pila.pop();
				}
			}
			return pila.isEmpty();
		}
	}
}
