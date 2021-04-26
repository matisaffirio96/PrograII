package impl;

import api.ConjuntoTDA;

public class Nodo {
    int info;
    Nodo sig;

    /*public void MysteryTour(Nodo origen) {
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
    }*/
}

