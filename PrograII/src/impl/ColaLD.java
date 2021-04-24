package impl;

import api.ColaTDA;

public class ColaLD implements ColaTDA {

    class Nodo{
        int info;
        Nodo sig;
    }

    Nodo primero;
    Nodo ultimo;

    @Override
    public void IncicializarCola() {
        primero = null;
        ultimo = null;

    }

    @Override
    public void Acolar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = null;
        if(ultimo != null){
            ultimo.sig = nuevo;
        }
        ultimo = nuevo;
        if(primero == null){
            primero = ultimo;
        }
    }

    @Override
    public void Desacolar() {
        primero = primero.sig;
        if(primero == null){
            ultimo = null;
        }
    }

    @Override
    public boolean ColaVacia() {
        return (ultimo == null);
    }

    @Override
    public int Primero() {
        return primero.info;
    }
}
