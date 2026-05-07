package Abstraccion;

	public class SistemaNomina {
	    public static void main(String[] args) {
	        // Creamos una lista de Empleados (aunque sean tipos distintos)
	        Empleado[] nomina = {
	            new EmpleadoAsalariado("Juan Perez", "A101", 3000.0),
	            new EmpleadoPorHoras("Maria Garcia", "H202", 40, 20.0)
	        };

	        for (Empleado emp : nomina) {
	            emp.presentarse();
	            // Java sabe qué fórmula usar para cada uno (Polimorfismo)
	            System.out.println("Sueldo a pagar: $" + emp.calcularSueldo());
	            System.out.println("---------------------------");
	        }
	    }
	}


