package SUBclases;

import SUPERclases.Trabajador;

public class EmpleadoRelacionDependencia extends Trabajador {
    private double sueldo;

    public EmpleadoRelacionDependencia(String nombre, String cuil, double sueldo) {
        super(nombre, cuil);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularImpuesto() {
        return sueldo * 0.15;
    }

}