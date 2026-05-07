package Herencia;

public class Animal {

		private boolean esVegetariano;

		private String come;

		private int numeroDePatas;

		// Constructor vacío
		public Animal(){}

		// Constructor con parámetros
		public Animal(boolean vegetariano, String alimento, int patas){
			this.esVegetariano = vegetariano;
			this.come = alimento;
			this.numeroDePatas = patas;
		}

		// Métodos Getter y Setter
		public boolean esVegetariano() {
			return esVegetariano;
		}

		public void setEsVegetariano(boolean esVegetariano) {
			this.esVegetariano = esVegetariano;
		}

		public String getCome() {
			return come;
		}

		public void setCome(String come) {
			this.come = come;
		}

		public int getNumeroDePatas() {
			return numeroDePatas;
		}

		public void setNumeroDePatas(int numeroDePatas) {
			this.numeroDePatas = numeroDePatas;
		}

	}


