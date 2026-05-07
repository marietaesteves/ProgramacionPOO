package Abstraccion;

//No puedes hacer "new Empleado()"
public abstract class Empleado {
 private String nombre;
 private String id;

 public Empleado(String nombre, String id) {
     this.nombre = nombre;
     this.id = id;
 }

 // Método concreto: Todos los empleados se presentan igual
 public void presentarse() {
     System.out.println("Empleado: " + nombre + " (ID: " + id + ")");
 }

 // MÉTODO ABSTRACTO: No tiene cuerpo {}. 
 // Obliga a las subclases a definir CÓMO se calcula su sueldo.
 public abstract double calcularSueldo();
}
//Empleado con sueldo fijo mensual
class EmpleadoAsalariado extends Empleado {
 private double sueldoMensual;

 public EmpleadoAsalariado(String nombre, String id, double sueldo) {
     super(nombre, id);
     this.sueldoMensual = sueldo;
 }

 @Override
 public double calcularSueldo() {
     return sueldoMensual;
 }
}

//Empleado que gana por horas trabajadas
class EmpleadoPorHoras extends Empleado {
 private int horasTrabajadas;
 private double tarifaPorHora;

 public EmpleadoPorHoras(String nombre, String id, int horas, double tarifa) {
     super(nombre, id);
     this.horasTrabajadas = horas;
     this.tarifaPorHora = tarifa;
 }

 @Override
 public double calcularSueldo() {
     return horasTrabajadas * tarifaPorHora;
 }
}
