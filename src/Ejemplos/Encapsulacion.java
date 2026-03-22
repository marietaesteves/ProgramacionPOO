package Ejemplos;

public class Encapsulacion {
	// 1. Atributos privados (ocultos al exterior)
    private String nombre;
    private int edad;

    // Constructor
    public Encapsulacion(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad); // Usamos el setter para validar incluso en el constructor
    }

    // 2. Getters y Setters (la interfaz pública)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        // Aquí aplicamos lógica de negocio / validación
        if (nuevaEdad >= 0) {
            this.edad = nuevaEdad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

}
//¿Cómo se logra el encapsulamiento?
//Para implementar esto en Java, seguimos dos pasos fundamentales:
//
//Declaramos las variables de la clase como private.
//
//Proporcionamos métodos public (llamados Getters y Setters) para leer y actualizar el valor de esas variables.
