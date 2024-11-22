package Ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo");
        } else {
            this.saldo = saldo;
        }
    }

    public void mostrarDetalles(){
        System.out.println("El numero de cuenta es = " + numeroCuenta);
        System.out.println("El saldo de la cuenta es = " + saldo);
        System.out.println("El tipo de cuenta es de = " + tipoCuenta);
    }


}
