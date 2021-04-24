package impl;

import api.ConjuntoTDA;
import api.DiccionarioMultipleTDA;

public class DicMultipleA implements DiccionarioMultipleTDA {

    class Elemento {
        int clave;
        int [] valores;
        int cantValores;

    }

    Elemento[] elementos;
    int cantClaves;


    @Override
    public void IncicializarDiccionario() {
        elementos = new Elemento[100];
        cantClaves = 0;

    }

    @Override
    public void Agregar(int clave, int valor) {
        int PosC = Clave2Indice(clave);
        if (PosC == -1) { // La clave no existe
            PosC = cantClaves;
            elementos[PosC] = new Elemento(); // Nueva entrada
            elementos[PosC].clave = clave;
            elementos[PosC].cantValores = 0;
            elementos[PosC].valores = new int[100];
            cantClaves++;
        }

        Elemento e = elementos[PosC];
        int PosV = Valor2Indice(e, valor);
        if (PosV == -1){
            e.valores[e.cantValores] = valor;
            e.cantValores++;
        }

    }

    @Override
    public void Eliminar(int clave) {

        int PosC = Clave2Indice(clave);
        if(PosC != -1){
            elementos[PosC] = elementos[cantClaves-1];
            cantClaves--;
        }

    }

    @Override
    public void Eliminarvalor(int clave, int valor) {
        int PosC = Clave2Indice(clave);
        if(PosC != -1){
            Elemento e = elementos[PosC];
            int PosV = Valor2Indice(e, valor);
            if(PosV != -1){
                e.valores[PosV] = e.valores[e.cantValores-1];
                e.cantValores--;
            }
            if(e.cantValores==0){
                Eliminar(clave);
            }
        }
    }

    private int Clave2Indice (int clave){
        int i = cantClaves-1;
        while (i>=0 && elementos[i].clave != clave){
            i--;
        }
        return i;
    }

    private int Valor2Indice (Elemento e, int valor){
        int i = e.cantValores-1;
        while (i>=0 && elementos[i].clave != valor){
            i--;
        }
        return i;

    }

    @Override
    public ConjuntoTDA Recuperar(int clave) {
        ConjuntoTDA c = new ConjuntoLD();
        c.InicializarConjunto();
        int PosC = Clave2Indice(clave);
        if (PosC != -1){
            Elemento e = elementos[PosC];
            for(int i=0; i< e.cantValores; i++){
                c.Agregar(e.valores[i]);
            }
        }
        return c;
    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new ConjuntoLD();
        c.InicializarConjunto();
        for (int i = 0; i<cantClaves; i++){
            c.Agregar(elementos[i].clave);
        }
        return c;
    }
}
