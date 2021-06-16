package principal;

import impl.ColaPrioridadHeap;

public class testHeap {
    public static void main(String[] args) {
        ColaPrioridadHeap h1 = new ColaPrioridadHeap();
        h1.InicializarCola();
        h1.AcolarPrioridad(48,15);
        h1.AcolarPrioridad(5,15);
        h1.AcolarPrioridad(24,15);
        h1.AcolarPrioridad(15,15);
        h1.AcolarPrioridad(67,15);
        h1.AcolarPrioridad(17,15);
        h1.AcolarPrioridad(30,15);

        while (!h1.ColaVacia()){
            System.out.println(h1.Primero());
            h1.Desacolar();
        }
    }


}
