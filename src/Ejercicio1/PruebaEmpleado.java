package Ejercicio1;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 40000);
        Empleado empleado2 = new Empleado("Carlos", -6); // para probar el if de la clase empleado

        System.out.println("Empleado 1 =");
        System.out.println();
        System.out.println("Nombre = " + empleado1.nombre);
        System.out.println("Salario = " + empleado1.getSalario());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Empleado 2 =");
        System.out.println();
        System.out.println("Nombre = " + empleado2.nombre);
        System.out.println("Salario = " + empleado2.getSalario());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Actualizando salario...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        empleado2.setSalario(40000);
        System.out.println("El nuevo salario del empleado 2 es de = " + empleado2.getSalario());


    }
}
