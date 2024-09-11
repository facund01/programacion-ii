package clase2.ejercicio.cajadeahorro;

public class CajaDeAhorro {
	
	private String numeroCuenta;
	private double saldo;
	
	// constructor para inicializar la cuenta con un número y un saldo inicial
	public CajaDeAhorro(String numeroCuenta, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
	}
	
	// método para obtener el saldo actual
	public double getSaldo() {
		return saldo;
	}
	
	// método para realizar un depósito
	public void depositar(double monto) {
		if (monto <= 0) {
			System.out.println("El monto a depositar debe ser mayor a 0");
		} else {
			saldo += monto;
			System.out.println("Depósito de " + monto + " realizado con éxito");
		}
	}
	
	// método para realizar una extracción
	public void extraer(double monto) {
		if (monto <= 0) {
			System.out.println("El monto debe ser mayor a 0");
		} else if (monto > saldo) {
			System.out.println("Fondos insuficientes para realizar la extracción");
		} else {
			saldo -= monto;
			System.out.println("Extracción de " + monto + " realizada con éxito");
		}
	}
	
	// método para mostrar la información de la cuenta
	public void mostrarInfo() {
		System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
	}
}
