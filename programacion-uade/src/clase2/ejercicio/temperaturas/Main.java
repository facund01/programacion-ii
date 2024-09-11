package clase2.ejercicio.temperaturas;

public class Main {

	public static void main(String[] args) {
		float[] temperaturas = {-5.0f, -3.2f, 0.5f, 2.1f, 4.0f};
		TempMinEstacion estacion = new TempMinEstacion(temperaturas);
		
		System.out.println("Mayor temperatura registrada: " + estacion.obtenerMayorTemp());
		System.out.println("Promedio de temperaturas: " + estacion.calcularPromedioTemps());
		System.out.println("Días que heló: " + estacion.contarHeladas());
		System.out.println("Hubo heladas? " + estacion.huboHeladas());
		System.out.println("Primera temperatura mayor a 0: " + estacion.primeraTempMayor(0.0f));
		System.out.println("Las temperaturas se produjeron en orden creciente? " + estacion.ordenCreciente());
	}
}
