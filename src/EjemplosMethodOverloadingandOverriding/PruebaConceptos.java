package EjemplosMethodOverloadingandOverriding;

public class PruebaConceptos {
	public static void main(String[] args) {
	     
	     Mensaje msg = new Mensaje();
	     MensajeWhatsApp wa = new MensajeWhatsApp();

	     System.out.println("--- Ejemplo de Overloading (Sobrecarga) ---");
	     // Se decide qué método usar según los argumentos (en tiempo de compilación)
	     msg.escribir("Hola"); 
	     msg.escribir("Hola", "👋");

	     System.out.println("\n--- Ejemplo de Overriding (Sobrescritura) ---");
	     // El comportamiento cambia según el tipo de objeto (en tiempo de ejecución)
	     msg.enviar(); // Salida: Enviando un mensaje genérico...
	     wa.enviar();  // Salida: Enviando mensaje por WhatsApp...
	 }
	}
