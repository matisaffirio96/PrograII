package principal;

import impl.ColaMaxSeq;


public class Punto2 {
    public static void main(String[] args) {
        ColaMaxSeq cola1 = new ColaMaxSeq();
        cola1.IncicializarCola();
        cola1.Acolar(1);
        cola1.Acolar(3);
        cola1.Acolar(2);
        cola1.Acolar(5);
        cola1.Acolar(4);
        cola1.Acolar(3);
        cola1.Acolar(4);
        cola1.Acolar(2);
        cola1.Acolar(7);



        System.out.println(cola1.MaxSeq());

    }

}
