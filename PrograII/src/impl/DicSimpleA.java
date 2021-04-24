package impl;

import api.ConjuntoTDA;
import api.DiccionarioSimpleTDA;

public class DicSimpleA implements DiccionarioSimpleTDA {

    class Elemento{
        int clave;
        int valor;
    }

    Elemento[] elementos;
    int cant;

    @Override
    public void IncicializarDiccionario() {
        elementos = new Elemento[100];
        cant = 0;

    }

    @Override
    public void Agregar(int clave, int valor) {
        int Pos = Clave2Ind(clave);
        if(Pos == -1){
            Pos = cant;
            elementos[Pos] = new Elemento();
            elementos[Pos].clave = clave;
            cant++;
        }
        elementos[Pos].valor = valor;

    }
    private  int Clave2Ind(int clave){
        int i = cant-1;
        while(i>=0 && elementos[i].clave != clave)
            i--;
        return i;
    }

    @Override
    public void Eliminar(int clave) {
        int Pos = Clave2Ind(clave);
        if(Pos != -1){
            elementos[Pos] = elementos[cant-1];
            cant--;
        }
    }

    @Override
    public int Recuperar(int clave) {
        int Pos = Clave2Ind(clave);
        return elementos[Pos].valor;
    }

    @Override
    public ConjuntoTDA Claves() {
        ConjuntoTDA c = new ConjuntoLD();
        c.InicializarConjunto();
        for (int i=0; i<cant; i++){
            c.Agregar(elementos[i].clave);
        }
        return c;
    }
}
