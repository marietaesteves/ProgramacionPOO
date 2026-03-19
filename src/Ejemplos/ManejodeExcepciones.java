package Ejemplos;

import java.util.Scanner;

public class ManejodeExcepciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. El bloque TRY: El "área protegida" de nuestro código
        try {
            System.out.print("Ingresa un número para dividir 100 entre él: ");
            String entrada = teclado.nextLine();
            
            // Intentamos convertir el texto a número
            // Si el usuario escribe "abc", el programa salta directamente al primer catch
            int divisor = Integer.parseInt(entrada); 
            
            // Intentamos hacer la división
            // Si el usuario escribe "0", el programa salta directamente al segundo catch
            int resultado = 100 / divisor; 
            
            System.out.println("El resultado es: " + resultado);

        } 
        // 2. El bloque CATCH: Nuestra "red de seguridad"
        catch (NumberFormatException e) {
            // Se activa si la conversión de texto a número falla
            System.out.println("ERROR: ¡Eso no es un número!");
        } 
        catch (ArithmeticException e) {
            // Se activa si intentamos una operación matemáticamente imposible
            System.out.println("ERROR: No puedes dividir entre cero.");
        } 
        // 3. El bloque FINALLY: El "cierre de seguridad"
        finally {
            // Esto se ejecuta SIEMPRE (haya error o no)
            System.out.println("Gracias por usar el programa.");
            teclado.close();
        }
    }
}