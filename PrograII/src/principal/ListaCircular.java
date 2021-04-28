package principal;

public class ListaCircular {

    public static class NodoCircular {
        int info;
        NodoCircular sig;

    }

    public static void MostrarLista(NodoCircular origen) {
        NodoCircular aux = new NodoCircular();
        NodoCircular first = new NodoCircular();
        aux = origen;
        first = aux;
        System.out.print("[");
        System.out.print(aux.info);
        System.out.print(", ");
        aux = aux.sig;
        while (aux != first) {
            System.out.print(aux.info);
            aux = aux.sig;
            if (aux != first) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void MostrarLista2(NodoCircular u) {
        System.out.print("[");
        if (u != null) {
            System.out.print(u.info + "] --> ");
            MostrarLista2(u.sig);
        } else {
            System.out.println("]");
        }
    }
    public static NodoCircular AgregarI(NodoCircular u, int num) {
        NodoCircular aux = new NodoCircular();
        NodoCircular nuevo = new NodoCircular();

        aux = u;
        nuevo.sig = aux.sig;
        aux.sig = nuevo;
        nuevo.info = num;
        return nuevo;
    }
    public static NodoCircular AgregarF(NodoCircular u, int num) {
        NodoCircular aux = new NodoCircular();
        aux.info = num;
        aux.sig = null;
        if (u == null) {
            u = aux;
        } else {
            NodoCircular aux2 = new NodoCircular();
            aux2 = u;
            while (aux2.sig != null) {
                aux2 = aux2.sig;
            }
            aux2.sig = aux;
        }
        return u;
    }

    public static NodoCircular Eliminar(NodoCircular u, int num) {

        if (u != null) {
            if (u.info == num) {
                u = u.sig;
            } else {
                NodoCircular aux2 = new NodoCircular();
                aux2 = u;
                while (aux2.sig != null && aux2.sig.info != num) {
                    aux2 = aux2.sig;
                }
                if (aux2.sig != null) {
                    aux2.sig = aux2.sig.sig;
                }
            }
        }
        return u;
    }


    public static void main(String[] args) {

        NodoCircular nOrigen = new NodoCircular();
        NodoCircular n2 = new NodoCircular();
        NodoCircular n3 = new NodoCircular();
        NodoCircular n4 = new NodoCircular();

        nOrigen.info = 4;
        n2.info = 5;
        n3.info = 3;
        n4.info = 2;

        nOrigen.sig = n2;
        n2.sig = n3;
        n3.sig = n4;
        n4.sig = nOrigen;

        AgregarI(nOrigen,8);
        MostrarLista(nOrigen);

    }
}
