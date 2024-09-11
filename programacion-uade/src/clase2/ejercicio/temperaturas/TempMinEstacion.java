package clase2.ejercicio.temperaturas;

public class TempMinEstacion {

	// atributo que almacena las temperaturas mínimas registradas
	private float[] temperaturas;
	
	// constructor que inicializa el arreglo de temperaturas
	public TempMinEstacion(float[] temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	// método que retorna la mayor temperatura registrada
	public float obtenerMayorTemp() {
		float max = temperaturas[0];
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > max) {
				max = temperaturas[i];
			}
		}
		return max;
	}
	
	// método que calcula el promedio de las temperaturas
	public float calcularPromedioTemps() {
		float suma = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			suma += temperaturas[i];
		}
		return suma / temperaturas.length;
	}
	
	// método que cuenta cuántos días heló
	public int contarHeladas() {
		int contador = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < 0) {
				contador++;
			}
		}
		return contador;
	}
	
	// método que indica si hubo heladas
	public boolean huboHeladas() {
		int i = 0;
		while (i < temperaturas.length) {
			if (temperaturas[i] < 0) {
				return true;
			}
			i++;
		}
		return false;
	}
	
	// método que retorna la primera temperatura mayor a una dada
	public float primeraTempMayor(float valor) {
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > valor) {
				return temperaturas[i];
			}
		}
		return valor;
	}
	
	// método que verifica si las temperaturas registradas se produjeron en orden creciente
	public boolean ordenCreciente() {
		int i = 0;
		while (i < temperaturas.length - 1) {
			if (temperaturas[i] > temperaturas[i + 1]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
