package principal;

import api.ConjuntoTDA;
import impl.ConjuntoLD;

public class EjercicioNodo {
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

    public static void MostrarLista2 (Nodo u) {
        System.out.print("[");
        if (u != null) {
            System.out.print(u.info + "] --> ");
            MostrarLista2(u.sig);
        } else {
            System.out.println("]");
        }
    }

    public static Nodo AgregarF(Nodo u, int num) {
        Nodo aux = new Nodo();
        aux.info = num;
        aux.sig = null;
        if(u == null){
            u = aux;
        } else {
            Nodo aux2 = new Nodo();
            aux2 = u;
            while(aux2.sig != null){
                aux2 = aux2.sig;
            }
            aux2.sig = aux;
        }
        return u;
    }

    public static Nodo AgregarI(Nodo u, int num) {
        Nodo aux = new Nodo();
        aux.info = num;
        aux.sig = u;

        return aux;
    }

    public static Nodo Eliminar(Nodo u, int num) {

        if(u != null){
            if (u.info == num){
                u = u.sig;
            } else {
                Nodo aux2 = new Nodo();
                aux2 = u;
                while (aux2.sig != null && aux2.sig.info != num) {
                    aux2 = aux2.sig;
                }
                if (aux2.sig != null){
                    aux2.sig = aux2.sig.sig;
                }
            }
        }
        return u;
    }

    public static void MysteryTour(Nodo origen) {
        ConjuntoTDA bolsa = new ConjuntoLD();
        bolsa.InicializarConjunto();
        if (origen != null)
            bolsa.Agregar(origen.info);
        Nodo aux = new Nodo();
        aux = origen;
        while (aux.sig != null) {
            if (bolsa.Pertenece(aux.sig.info)) {
                aux.sig = aux.sig.sig;
            } else {
                bolsa.Agregar(aux.sig.info);
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

        n1.info = 3;
        n2.info = 5;
        n3.info = 3;
        n4.info = 2;
        n5.info = 5;
        n6.info = 5;
        n7.info = 7;


        n1.sig = n2;
        n2.sig = n3;
        n3.sig  = n4;
        n4.sig = n5;
        n5.sig = n6;
        n6.sig  = n7;
        n7.sig = null;

        //MostrarLista(n1); //Para mostrar todos los nodos, se debe seleccionar el primer NODO
        //MostrarLista2(n1);
        MostrarLista(n1);
        MysteryTour(n1);
        MostrarLista(n1);





    }

}
