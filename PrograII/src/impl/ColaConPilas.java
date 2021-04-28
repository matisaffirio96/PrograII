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

        p1.Apilar(x);

    }

    @Override
    public void Desacolar() {
        PasarPila(p1,p2);
        p2.Desapilar();
        PasarPila(p2,p1);
    }

    @Override
    public boolean ColaVacia() {

        return p1.PilaVacia();
    }

    @Override
    public int Primero() {
        //int prim = p1.Tope();
        PasarPila(p1,p2);
        int prim = p2.Tope();
        PasarPila(p2,p1);
        return prim;
    }

}
