/**
 * Clase que representa a un empleado con nombre, cargo y salario..
 */
public class Empleado {

    /**
     * Nombre del empleado.
     */
    private String nombre;

    /**
     * Cargo del empleado.
     */
    private String cargo;

    /**
     * Salario del empleado.
     */
    double salario;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombre Nombre del empleado.
     * @param cargo Cargo del empleado.
     * @param salario Salario del empleado.
     */
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    /**
     * Devuelve una representación en cadena del empleado.
     *
     * @return Cadena con la información del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}