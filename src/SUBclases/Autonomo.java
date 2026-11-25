package SUBclases;

import SUPERclases.Trabajador;

public class Autonomo extends Trabajador {
    private double sueldo;

    public Autonomo(String nombre, String cuil, double sueldo) {
        super(nombre, cuil);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularImpuesto() {
        return sueldo * 0.25;
    }
}