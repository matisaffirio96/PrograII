package principal;

import api.ConjuntoTDA;
import impl.ConjuntoLD;

public class Punto4 {

    public static class Nodo {
        int info;
        Nodo sig;
    }

    public static void MostrarLista(Nodo u) {
        Nodo aux = new Nodo();
        aux = u;
        System.out.print("[");
        while (aux != null){
            System.out.print(aux.info);
            aux = aux.sig;
            if(aux != null){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void EliminarDuplicado(Nodo origen) {
        ConjuntoTDA conju = new ConjuntoLD();
        conju.InicializarConjunto();
        if (origen != null)
            conju.Agregar(origen.info);
        Nodo aux = new Nodo();
        aux = origen;
        while (aux.sig != null) {
            if (conju.Pertenece(aux.sig.info)) {
                aux.sig = aux.sig.sig;
            } else {
                conju.Agregar(aux.sig.info);
                aux = aux.sig;
            }
        }
    }

    public static void main(String[] args) {
        Nodo n1 = new Nodo();
        Nodo n2 = new Nodo();
        Nodo n3 = new Nodo();
        Nodo n4 = new Nodo();
        Nodo n5 = new Nodo();
        Nodo n6 = new Nodo();
        Nodo n7 = new Nodo();
        Nodo n8 = new Nodo();


        n1.info = 4;
        n2.info = 5;
        n3.info = 3;
        n4.info = 2;
        n5.info = 4;
        n6.info = 5;
        n7.info = 3;
        n8.info = 2;

        n1.sig = n2;
        n2.sig = n3;
        n3.sig  = n4;
        n4.sig = n5;
        n5.sig = n6;
        n6.sig  = n7;
        n7.sig = n8;
        n8.sig = null;
        
        MostrarLista(n1); //Mostrar lista virgen
        EliminarDuplicado(n1); //Elimino duplicado
        MostrarLista(n1); // Muestro lista sin duplicados

    }
}
