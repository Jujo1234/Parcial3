import java.util.Scanner;

public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    // Getter para empleados
    public Empleado[] getEmpleados() {
        return empleados;
    }

    // Setter para empleados
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.salario * (1 + porcentaje / 100);
            empleado.salario = nuevoSalario;
        }
    }

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el porcentaje de aumento de salario: ");
        double porcentaje = scanner.nextDouble();

        sistema.aumentarSalario(porcentaje);

        System.out.println("Lista de Empleados:");
        for (Empleado empleado : sistema.getEmpleados()) { // Usamos el getter
            System.out.println(empleado);
        }

        scanner.close();
    }
}