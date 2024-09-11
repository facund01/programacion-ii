package clase2.ejercicio.flor;

public class Main {

	public static void main(String[] args) {
		
		// crear una flor
		Flor rosa = new Flor("Rosa", 7, 52.1f);
		
		// mostrar nombre de la flor
		System.out.println(rosa.getNombre());
		
		// mostrar número de pétalos de la flor
		System.out.println(rosa.getNroPetalos() + " pétalos");
		
		// mostrar precio de la flor
		System.out.println("$" + rosa.getPrecioFlor());
		
		// mostrar constructor por defecto
		Flor margarita = new Flor();
		System.out.println("Flor: " + margarita.getNombre() + " " + margarita.getNroPetalos() + " pétalos $" + margarita.getPrecioFlor());
	}
}
