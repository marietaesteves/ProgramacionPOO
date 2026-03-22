package Ejemplos;

public class PruebadeEncapsulamiento {
	public static void main(String[] args) {
        // 1. Creamos el objeto (Instanciación)
        // El constructor recibe "Juan" y 25.
        Encapsulacion usuario = new Encapsulacion("Juan", 25);

        // 2. Intentamos acceder directamente a un atributo privado
        // System.out.println(usuario.nombre); 
        // ^ El código de arriba daría un ERROR de compilación: 'nombre has private access'

        // 3. Usamos los métodos públicos (Getters) para ver los datos
        System.out.println("Nombre original: " + usuario.getNombre());
        System.out.println("Edad original: " + usuario.getEdad());

        System.out.println("\n--- Intentando modificar datos ---");

        // 4. Modificación válida usando Setter
        usuario.setNombre("Juan Carlos");
        usuario.setEdad(30);
        
        // 5. Modificación INVÁLIDA (Prueba de fuego del encapsulamiento)
        // Intentamos poner una edad negativa
        usuario.setEdad(-15); 

        System.out.println("\n--- Resultado Final ---");
        System.out.println("Nombre actualizado: " + usuario.getNombre());
        System.out.println("Edad final (no cambió a -15): " + usuario.getEdad());
    }

}
