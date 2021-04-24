package impl;

import api.PilaTDA;

public class PilaLD implements PilaTDA {

    class Nodo{
        int info;
        Nodo sig;
    }

    Nodo primero;

    @Override
    public void InicializarPila() {
        primero = null;

    }

    @Override
    public void Apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = primero;
        primero = nuevo;
    }


    @Override
    public void Desapilar() {
        primero = primero.sig;
    }

    @Override
    public boolean PilaVacia() {
        return (primero == null);
    }

    @Override
    public int Tope() {
        return (primero.info);
    }
}
