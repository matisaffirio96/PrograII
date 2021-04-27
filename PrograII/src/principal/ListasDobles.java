package principal;

import api.ConjuntoTDA;
import impl.ConjuntoLD;

public class ListasDobles {

    public static class NodoDoble {
        int info;
        NodoDoble sig;
        NodoDoble ant;
    }

    public static void MostrarLista(NodoDoble u) {
        NodoDoble aux = new NodoDoble();
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

    public static void MostrarLista2 (NodoDoble u) {
        System.out.print("[");
        if (u != null) {
            System.out.print(u.info + "] --> ");
            MostrarLista2(u.sig);
        } else {
            System.out.println("]");
        }
    }

    public static NodoDoble AgregarF(NodoDoble u, int num) {
        NodoDoble aux = new NodoDoble();
        aux.info = num;
        aux.sig = null;
        if(u == null){
            u = aux;
        } else {
            NodoDoble aux2 = new NodoDoble();
            aux2 = u;
            while(aux2.sig != null){
                aux2 = aux2.sig;
            }
            aux2.sig = aux;
        }
        return u;
    }

    public static NodoDoble AgregarI(NodoDoble u, int num) {
        NodoDoble aux = new NodoDoble();
        aux.info = num;
        aux.sig = u;

        return aux;
    }

    public static NodoDoble Eliminar(NodoDoble u, int num) {
        if(u != null){
            if (u.info == num){
                u = u.sig;
            } else {
                NodoDoble aux2 = new NodoDoble();
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
    public static void EliminarDuplicado(NodoDoble origen) {
        ConjuntoTDA bolsa = new ConjuntoLD();
        bolsa.InicializarConjunto();
        if (origen != null)
            bolsa.Agregar(origen.info);
        NodoDoble aux = new NodoDoble();
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

    public static NodoDoble EliminarObjetivo(NodoDoble n, int num_eliminar){

        /*{n1, n2, n3, n4, n5}

        Eliminar n1 sig =2 ant= null;
        n2 sig n3;
        ant n1= null
        n3.sig = n4.sig;
        n5.ant = n4.ant;*/


        if (n != null){
            if (n.info == num_eliminar){ //aca evaluamos si es el primer nodo

                n.sig.ant = n;
                //n.sig.ant = null;
                //n.sig = n.sig.sig;

            } else {
                NodoDoble aux = new NodoDoble();
                aux = n;
                while (aux.sig != null && aux.info != num_eliminar){
                    aux = aux.sig;

                }
                if(aux.sig != null){ // esto anda
                    aux.ant.sig = aux.sig;
                    aux.sig.ant = aux.ant;

                } else {    // evaluamos si es el ultimo nodo
                    aux.ant.sig = aux.ant;
                    aux.sig.ant = aux.sig;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {

        NodoDoble n1 = new NodoDoble();
        NodoDoble n2 = new NodoDoble();
        NodoDoble n3 = new NodoDoble();
        NodoDoble n4 = new NodoDoble();



        n1.info = 4;
        n2.info = 5;
        n3.info = 3;
        n4.info = 2;


        n1.ant = null;
        n1.sig = n2;
        n2.ant = n1;
        n2.sig = n3;
        n3.ant = n2;
        n3.sig  = n4;
        n4.ant = n3;
        n4.sig = null;

        MostrarLista(n1);
        EliminarObjetivo(n1,4);
        MostrarLista(n1);





    }


}
