package ORGANIZADOR;

import SUPERclases.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class EstudioContable {
    public double recaudacion(List<Trabajador> trabajadores) {
        double recaudaciones = 0;
        for (Trabajador t : trabajadores) {
            recaudaciones = recaudaciones + t.calcularImpuesto();
        }
        return recaudaciones;
    }
}
