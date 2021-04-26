package principal;

public class EjercicioNodo {
    public static class Nodo {
        int info;
        Nodo sig;
    }

    public void MostrarLista(Nodo u) {
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

    public Nodo AgregarF(Nodo u, int num) {
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

    public Nodo AgregarI(Nodo u, int num) {
        Nodo aux = new Nodo();
        aux.info = num;
        aux.sig = u;

        return aux;
    }

    public Nodo Eliminar(Nodo u, int num) {
        Nodo aux = new Nodo();
        if(u != null){
            if (u.info == num){
                u = u.sig;
            } else {
                Nodo aux2 = new Nodo();
                aux2 = u;
                while (aux2.sig != null && aux2.sig.info != num) {
                    aux2 = aux2.sig;
                }
                if (aux.sig != null){
                    aux2.sig = aux2.sig.sig;
                }
            }
        }
        return u;
    }


}
