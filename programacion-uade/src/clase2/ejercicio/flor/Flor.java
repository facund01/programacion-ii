package clase2.ejercicio.flor;

public class Flor {
	
	private String nombreFlor;
	private int petalos;
	private float precio;
	
	// constructor para inicializar los atributos
	public Flor(String nombreFlor, int petalos, float precio) {
		this.nombreFlor = nombreFlor;
		this.petalos = petalos;
		this.precio = precio;
	}
	
	// constructor por defecto
	public Flor() {
		this.nombreFlor = "Margarita";
		this.petalos = 10;
		this.precio = 34.3f;
	}
	
	// métodos para setear los atributos de la flor
	public void setNombre(String nombre) {
		nombreFlor = nombre;
	}
	
	public void setNroPetalos(int nroPetalos) {
		petalos = nroPetalos;
	}
	
	public void setPrecioFlor(float precioFlor) {
		precio = precioFlor;
	}
	
	// métodos para obtener los atributos de forma individual
	public String getNombre() {
		return nombreFlor;
	}
	
	public int getNroPetalos() {
		return petalos;
	}
	
	public float getPrecioFlor() {
		return precio;
	}
	
}
