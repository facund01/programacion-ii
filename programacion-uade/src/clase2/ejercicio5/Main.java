package clase2.ejercicio5;

public class Main {

	public static void main(String[] args) {
		float[] temperaturas1 = {-5.0f, 3.2f, 6.0f, 0.5f, 3.2f, 4.0f};
		float[] temperaturas2 = {-5.0f, 2.1f, 0.0f, 0.5f, -2.1f, 3.2f};
		TemperaturasEstacion estacion = new TemperaturasEstacion(temperaturas1);
		TemperaturasEstacion estacionInvertida = estacion.invertir();
		
		estacion.invertirMe();
		estacion.mostrarTemperaturas();
	}
}
