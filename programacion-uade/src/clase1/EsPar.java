package clase1;

public class EsPar {

	public static void main(String[] args) {
		System.out.print("Ingrese un número: ");
		String entrada = System.console().readLine();
		int num = Integer.parseInt(entrada);
		
		if (esPar(num) == true) {
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " no es par");
		}
	}
	
	static boolean esPar(int x) {
		return x % 2 ==0;
	}

}
