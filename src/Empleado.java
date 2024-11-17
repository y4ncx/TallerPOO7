public class Empleado {
    public String nombre;
    private double salario;

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        setSalario(salario);  //set para validar
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if (salario < 0 ) {
            System.out.println("El salario no puede ser negativo, el valor cambiará a 0");
            this.salario = 0;
        }else {
            this.salario = salario;
        }
    }


}
