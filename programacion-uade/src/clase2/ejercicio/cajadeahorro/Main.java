package clase2.ejercicio.cajadeahorro;

public class Main {

	public static void main(String[] args) {
		
		// crear una nueva caja de ahorro
		CajaDeAhorro miCuenta = new CajaDeAhorro("123456789", 10000.0);
		
		// mostrar información inicial de la cuenta
		miCuenta.mostrarInfo();
		
		// hacer un depósito
		miCuenta.depositar(2000.0);
		
		// intentar hacer una extracción mayor que el saldo
		miCuenta.extraer(12500.0);
		
		// hacer una extracción
		miCuenta.extraer(7000.0);
		
		// mostrar información final de la cuenta
		miCuenta.mostrarInfo();
	}

}
