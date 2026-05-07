package Herencia;

public class Gato extends Animal {

	private String color;

	// Constructor básico: asigna color blanco por defecto
	public Gato(boolean vegetariano, String alimento, int patas) {
		super(vegetariano, alimento, patas);
		this.color = "Blanco";
	}

	// Constructor completo
	public Gato(boolean vegetariano, String alimento, int patas, String color){
		super(vegetariano, alimento, patas);
		this.color = color;
	}

	// Métodos Getter y Setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
