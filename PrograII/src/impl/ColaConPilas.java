package impl;

import api.ColaTDA;
import api.PilaTDA;

public class ColaConPilas implements ColaTDA {
    PilaTDA p1 = new PilaTF();
    PilaTDA p2 = new PilaTF();

    private void PasarPila(PilaTDA p1, PilaTDA p2){
        while (!p1.PilaVacia()){
            p2.Apilar(p1.Tope());
            p1.Desapilar();
        }
    }

    @Override
    public void IncicializarCola() {
        p1.InicializarPila();
        p2.InicializarPila();
    }

    @Override
    public void Acolar(int x) {

    }

    @Override
    public void Desacolar() {

    }

    @Override
    public boolean ColaVacia() {
        return false;
    }

    @Override
    public int Primero() {
        return 0;
    }
}
