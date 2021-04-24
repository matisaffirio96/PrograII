package impl;

import api.ConjuntoTDA;
import jdk.nashorn.internal.ir.WhileNode;

public class ConjuntoLD implements ConjuntoTDA {

    class Nodo{
        int info;
        Nodo sig;
    }
    Nodo c;

    @Override
    public void InicializarConjunto() {
        c = null;

    }

    @Override
    public void Agregar(int x) {
        if(!this.Pertenece(x)){
            Nodo nuevo = new Nodo();
            nuevo.info = x;
            nuevo.sig = c;
            c = nuevo;
        }
    }

    @Override
    public int Elegir() {
        return c.info;
    }

    @Override
    public boolean Conjuntovacio() {
        return (c == null);
    }

    @Override
    public void Sacar(int x) {
        if (c != null) {
            if (c.info == x) { // es el primero
                c = c.sig;
            } else { // es alg´un otro; lo buscamos
                Nodo aux = c;
                while (aux.sig != null && aux.sig.info != x)
                    aux = aux.sig;
                if (aux.sig != null) { // encontrado
                    aux.sig = aux.sig.sig;
                }
            }
        }
    }

    @Override
    public boolean Pertenece(int x) {
        Nodo aux = c;
        while (aux != null && aux.info !=x){
            aux = aux.sig;
        }
        return (aux != null);
    }
}
