package api;

import impl.Nodo;

public interface ListEnlazadaTDA {
    void MostrarLista(Nodo u);
    Nodo AgregarF(Nodo u, int num);
    Nodo AgregarI(Nodo u, int num);
    Nodo Eliminar(Nodo u, int num);

}
