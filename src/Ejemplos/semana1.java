package Ejemplos;

public class semana1 {

    // --- 1. ENUMS Y CLASES DE APOYO ---
    enum Tamanio {
        PEQUENA, MEDIANA, GRANDE, EXTRAGRANDE
    }

    static class Prueba {
        Tamanio tamanioPizza;

        public Prueba(Tamanio tamanioPizza) {
            this.tamanioPizza = tamanioPizza;
        }

        public void ordenarPizza() {
            switch(tamanioPizza) {
                case PEQUENA:
                    System.out.println("Pedí una pizza de tamaño pequeño.");
                    break;
                case MEDIANA:
                    System.out.println("Pedí una pizza de tamaño mediano.");
                    break;
                default:
                    System.out.println("No sé cuál tamaño pedir (Grande o Extragrande).");
                    break;
            }
        }
    }

    // BLOQUES ESTÁTICOS ---
    static int variableEstatica;
    int variableNoEstatica;

    static {
        System.out.println(">>> INICIALIZACIÓN ESTÁTICA (Se ejecuta una vez al cargar la clase)");
        variableEstatica = 5;
    }

    {
        System.out.println(">>> INICIALIZACIÓN DE INSTANCIA (Antes del constructor)");
        variableNoEstatica = 7;
    }

    public semana1() {
        System.out.println(">>> CONSTRUCTOR EJECUTADO");
    }

    // --- 3. MÉTODO PRINCIPAL ---
    public static void main(String[] args) {

        System.out.println("--- SECCIÓN 1: CONVERSIONES ---");
        
        // #1: De int a double
        int num1 = 50;
        double data1 = num1; 
        System.out.println("Entero a Double: " + data1);

        // #2: De double a int (Casting)
        double num2 = 50.55;
        int data2 = (int) num2;
        System.out.println("Double a Int (Casting): " + data2);

        // #3: De int a String
        int num3 = 50;
        String data3 = String.valueOf(num3);
        System.out.println("Int a String: " + data3);

        // #4: De String a int (Parsing)
        String data4 = "50";
        int num4 = Integer.parseInt(data4);
        System.out.println("String a Int (Parsing): " + num4);

        System.out.println("\n--- SECCIÓN 2: ENUMS ---");
        Prueba t1 = new Prueba(Tamanio.MEDIANA);
        t1.ordenarPizza();

        System.out.println("\n--- SECCIÓN 3: CICLO DE VIDA (OBJETOS) ---");
        System.out.println("Creando primer objeto de semana1:");
        new semana1();
        
        System.out.println("\nCreando segundo objeto de semana1:");
        new semana1();
    }
    
    
}