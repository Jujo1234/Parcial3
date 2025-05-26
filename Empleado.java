import java.util.ArrayList;
import java.util.List;

class Empleados {
    List<Empleado> lista;

    public Empleados() {
        this.lista = new ArrayList<>();
    }

    public void darDeAlta(Empleado empleado) {
        lista.add(empleado);
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public void mostrarListado() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
}