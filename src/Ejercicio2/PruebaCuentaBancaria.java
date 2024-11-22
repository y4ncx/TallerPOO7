package Ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("AAA4444", 40000, "Ahorro");


        // cuenta.numeroCuenta = "87954"; //este es el error

        System.out.println("Detalles de la cuenta");
        cuenta.mostrarDetalles();



    }
}
