import java.util.Scanner;

/**
 * Clase principal para gestionar empleados en el sistema.
 * Permite aumentar el salario de los empleados y mostrar su información.
 */
public class SistemaGestionEmpleados {

    /**
     * Array de empleados gestionados por el sistema.
     */
    private Empleado[] empleados;

    /**
     * Constructor de la clase SistemaGestionEmpleados.
     *
     * @param empleados Array de empleados iniciales.
     */
    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    /**
     * Obtiene el array de empleados.
     *
     * @return Array de empleados.
     */
    public Empleado[] getEmpleados() {
        return empleados;
    }

    /**
     * Establece un nuevo array de empleados.
     *
     * @param empleados Nuevo array de empleados.
     */
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     *
     * @param porcentaje Porcentaje de aumento del salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.salario * (1 + porcentaje / 100);
            empleado.salario = nuevoSalario;
        }
    }

    /**
     * Método principal del programa.
     * Crea empleados, solicita un porcentaje de aumento y muestra la lista actualizada.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Mensajes.INTRODUCIR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        sistema.aumentarSalario(porcentaje);

        System.out.println(Mensajes.LISTA_EMPLEADOS);
        for (Empleado empleado : sistema.getEmpleados()) {
            System.out.println(empleado);
        }

        scanner.close();
    }
}