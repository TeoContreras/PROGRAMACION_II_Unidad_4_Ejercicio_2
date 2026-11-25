package SUBclases;

import SUPERclases.Trabajador;

public class DirectorEmpresa extends Trabajador {
    private double sueldo;

    public DirectorEmpresa(String nombre, String cuil, double sueldo) {
        super(nombre, cuil);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularImpuesto() {
        return sueldo * 0.35;
    }
}