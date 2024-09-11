package clase1;
import java.util.Scanner;

public class Mayor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		int i = 0;
		while (i < 3) {
			System.out.print("Ingrese un número: ");
	        String entrada = scanner.nextLine();
	        
	        int numero = Integer.parseInt(entrada);
			
			switch (i) {
			case 0:
				num1 = numero;
				break;
			case 1:
				num2 = numero;
				break;
			case 2:
				num3 = numero;
				break;
			} 
			
			i++;
		}
		
		scanner.close();
		
		int mayorNum = devolverMayor(num1, num2, num3); 
		System.out.println("El mayor número de los ingresados es " + mayorNum);
	}
	
	static int devolverMayor(int a, int b, int c) {
		int mayor = a;
		
		if (b > mayor) {
			mayor = b;
		}
		
		if (c > mayor) {
			mayor = c;
		}
		
		return mayor;
	}

}
