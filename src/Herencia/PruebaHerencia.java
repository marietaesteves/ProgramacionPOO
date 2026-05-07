package Herencia;

public class PruebaHerencia {

	public static void main(String[] args) {
		// Creamos una instancia de Gato con los nuevos nombres de parámetros
		Gato miGato = new Gato(false, "leche", 4, "negro");

		// Imprimimos los resultados traducidos
		System.out.println("¿El gato es vegetariano?: " + miGato.esVegetariano());
		System.out.println("El gato come: " + miGato.getCome());
		System.out.println("El gato tiene: " + miGato.getNumeroDePatas() + " patas.");
		System.out.println("El color del gato es: " + miGato.getColor());
	}

}
