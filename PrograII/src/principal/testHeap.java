package principal;

import impl.ColaPrioridadHeap;

public class testHeap {
    public static void main(String[] args) {
        ColaPrioridadHeap h1 = new ColaPrioridadHeap();
        h1.InicializarCola();
        h1.AcolarPrioridad(3,15);
        h1.AcolarPrioridad(2,15);
        h1.AcolarPrioridad(4,15);
        h1.AcolarPrioridad(8,15);
    }
}
