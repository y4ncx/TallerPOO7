public class PruebaUtilidades {

    public static void main(String[] args) {


        double a = 20;
        double b = 15;

        System.out.println("Suma =");
        System.out.println(a + " + " + b + " = " + Utilidades.sumar(a,b));

        System.out.println("\nResta:");
        System.out.println(a + " - " + b + " = " + Utilidades.restar(a, b));

        System.out.println("\nMultiplicación:");
        System.out.println(a + " * " + b + " = " + Utilidades.multiplicar(a, b));

        System.out.println("\nDivisión:");
        System.out.println(a + " / " + b + " = " + Utilidades.dividir(a, b));


        System.out.println("\nPrueba de división por cero:");
        System.out.println(a + " / 0 = " + Utilidades.dividir(a, 0));

    }
}
