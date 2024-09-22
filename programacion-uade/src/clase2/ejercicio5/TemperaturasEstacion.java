package clase2.ejercicio5;

public class TemperaturasEstacion {
	private float[] temperaturas;
	
	public TemperaturasEstacion(float[] temperaturas) {
		this.temperaturas = temperaturas;
	}
	
	// retornar la menor temperatura registrada
	public float menorTemperatura() {
		float min = temperaturas[0];
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < min) {
				min = temperaturas[i];
			}
		}
		return min;
	}
	
	// retornar la posición de la menor temperatura
	public int posMenorTemperatura() {
		float min = temperaturas[0];
		int pos = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < min) {
				min = temperaturas[i];
				pos = i;
			}
		}
		return pos;
	}
	
	// determinar si todas las temperaturas son positivas
	public boolean todosPositivos() {
		int i = 0;
		while (i < temperaturas.length) {
			if (temperaturas[i] < 0) {
				return false;
			} else {
				i++;
			}
		}
		return true;
	}
	
	// calcular en cuántos días dos estaciones coincidieron en la temperatura mínima
	public int contarCoincidencias(TemperaturasEstacion otraEstacion) {
		int coincidencias = 0;
		float[] otrasTemperaturas = otraEstacion.getTemperaturas();
		
		for (int i = 0; i < this.temperaturas.length; i++) {
			if (this.temperaturas[i] == otrasTemperaturas[i]) {
				coincidencias++;
			}
		}
		return coincidencias;		
	}
	
	// getter para obtener las temperaturas de una estación
	public float[] getTemperaturas() {
		return this.temperaturas;
	}
	
	// invertir el orden de las temperaturas de una estación
	public TemperaturasEstacion invertir() {
		float[] temperaturasInvertidas = new float[temperaturas.length];
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturasInvertidas[i] = temperaturas[temperaturas.length - 1 - i];
		}
		return new TemperaturasEstacion(temperaturasInvertidas);
	}
	
	public void mostrarTemperaturas() {
        System.out.print("[");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i]);
            if (i < temperaturas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
	
	// reemplazar toda aparición de val1 por val2
	public void reemplazar(float val1, float val2) {
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] == val1) {
				temperaturas[i] = val2;
			}
		}
	}
	
	// intercambiar los valores de las posiciones pos1 y pos2
	public String intercambiar(int pos1, int pos2) {
		if (pos1 < 0 || pos2 < 0 || pos1 >= temperaturas.length || pos2 >= temperaturas.length) {
            return "Error: una o ambas posiciones son inválidas.";
        } else {
        	float aux = temperaturas[pos1];
    		temperaturas[pos1] = temperaturas[pos2];
    		temperaturas[pos2] = aux;
    		return "";
    	}
	}
	
	// invertir los elementos de la tabla
	public void invertirMe() {
		int largo = temperaturas.length;
		for (int i = 0; i < largo / 2; i++) {
			float aux = temperaturas[i];
			temperaturas[i] = temperaturas[largo - 1 - i];
			temperaturas[largo - 1 - i] = aux;
		}
	}
}
