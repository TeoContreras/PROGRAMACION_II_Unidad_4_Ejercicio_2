import ORGANIZADOR.EstudioContable;
import SUBclases.Autonomo;
import SUBclases.DirectorEmpresa;
import SUBclases.EmpleadoRelacionDependencia;
import SUPERclases.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {

        List<Trabajador> elementos = new ArrayList<>();
        elementos.add(new Autonomo("Santiago", "123456", 100000));
        elementos.add(new EmpleadoRelacionDependencia("Marta", "789456", 250250));
        elementos.add(new DirectorEmpresa("Guri", "456183", 789456));

        EstudioContable estudio = new EstudioContable();
        double total = estudio.recaudacion(elementos);

        for (Trabajador r : elementos) {
            System.out.println("----------------");
            System.out.println("Trabajador/a: " + r.getNombre());
            System.out.println("CUIL: " + r.getCuil());
            System.out.println("Impuesto: $" + r.calcularImpuesto());
        }
        System.out.println("----------------");
        System.out.println("Recaudacion total: $" + total);
    }
}
