package EjemplosMethodOverloadingandOverriding;
//Clase base: Abstracción
class Mensaje {
 
 // --- OVERRIDING (Sobrescritura) ---
 // Este método será redefinido por las clases hijas.
 public void enviar() {
     System.out.println("Enviando un mensaje genérico...");
 }

 // --- OVERLOADING (Sobrecarga) ---
 // Misma función (escribir), pero diferentes parámetros.
 // Ocurre en la MISMA clase.
 
 public void escribir(String texto) {
     System.out.println("Escribiendo texto: " + texto);
 }

 public void escribir(String texto, String emoji) {
     System.out.println("Escribiendo: " + texto + " " + emoji);
 }
}

//Clase hija que aplica Overriding
class MensajeWhatsApp extends Mensaje {

 // --- OVERRIDING ---
 // Usamos @Override para indicar que estamos cambiando el comportamiento 
 // del método que heredamos de la clase "Mensaje".
 @Override
 public void enviar() {
     System.out.println("Enviando mensaje por WhatsApp con cifrado de extremo a extremo.");
 }
}
