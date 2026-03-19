package Ejemplos;

public class valorporreferencia {
    
    // --- Clase interna Dog para que el ejemplo funcione ---
    static class Dog {
        private String name;
        
        public Dog(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Creamos un nuevo objeto Perro llamado "Max"
        Dog aDog = new Dog("Max");
        // Creamos una copia de la referencia: 'oldDog' apunta al mismo objeto que 'aDog'
        Dog oldDog = aDog;

        // Pasamos el objeto al método foo
        foo(aDog);
        
        System.out.println("------------------------------------");
        System.out.println("RESULTADOS EN EL MAIN:");
        
        // La variable 'aDog' sigue apuntando al perro "Max" cuando foo(...) retorna.
        // Esto demuestra que Java pasa la referencia POR VALOR (una copia de la dirección).
        System.out.println("¿aDog sigue siendo Max?: " + aDog.getName().equals("Max")); 
        System.out.println("¿aDog cambió a Fifi en el main?: " + aDog.getName().equals("Fifi")); 
        
        // Comprobamos que 'aDog' sigue siendo el mismo objeto original que 'oldDog'
        System.out.println("¿aDog y oldDog apuntan al mismo espacio de memoria?: " + (aDog == oldDog)); 
    }

    public static void foo(Dog d) {
        System.out.println("DENTRO DEL MÉTODO FOO:");
        
        // Al entrar, 'd' apunta a "Max" porque recibió la copia de la dirección de memoria
        System.out.println("Al inicio de foo, d es: " + d.getName()); 
        
        // Cambiamos 'd' dentro de foo() para que apunte a una NUEVA instancia de Dog
        // creada con el nombre "Fifi". 
        // IMPORTANTE: Esto solo cambia la dirección que guarda la variable local 'd'.
        // No afecta en nada a la variable 'aDog' que está en el método main.
        d = new Dog("Fifi");
        
        System.out.println("Al final de foo, d ahora apunta a: " + d.getName()); 
    }
}