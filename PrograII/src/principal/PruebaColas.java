package principal;

import impl.ColaConPilas;

public class PruebaColas {
    public static void main(String[] args) {
        ColaConPilas c1 = new ColaConPilas();
        c1.IncicializarCola();

        c1.Acolar(1);
        c1.Acolar(2);
        c1.Acolar(3);
        c1.Acolar(4);
        c1.Acolar(5);

        while (!c1.ColaVacia()){
            System.out.println(c1.Primero());
            c1.Desacolar();
        }

    }
}
