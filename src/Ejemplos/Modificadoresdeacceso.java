package Ejemplos;

public class Modificadoresdeacceso {
	// Nadie fuera de esta clase puede ver esto directamente
    private double saldo; 

    // Cualquier clase puede usar este constructor
    public Modificadoresdeacceso(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Las subclases (ej. CuentaAhorro) pueden usar este método
    protected void aplicarInteres() {
        this.saldo += this.saldo * 0.05;
    }

    // Solo clases en el mismo paquete pueden ver esto
    void mostrarAlerta() {
        System.out.println("Revisando saldo...");
    }

    // Acceso universal para obtener el saldo de forma segura
    public double getSaldo() {
        return saldo;
    }

}
////private: Es la mejor práctica para las variables de instancia (atributos). La regla de oro es: 
//"Mantén todo privado hasta que necesites que sea público".
////
////Default: No se escribe la palabra default. Simplemente dejas el espacio vacío (ej. int edad;). 
//Se le conoce como package-private.
////
////protected: Es un poco especial, ya que permite el acceso a hijos (herencia) incluso si están 
//en paquetes diferentes, pero también a cualquier clase dentro del mismo paquete.