package impl;
import api.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA{

    int[] a;
    int cant;

    public void InicializarConjunto() {
        a = new int[10];
        cant = 0;
    }

    public void Agregar(int x) {
        if(!this.Pertenece(x)){
            a[cant] = x;
            cant++;
        }

    }

    public int Elegir() {
        return a[cant-1];
    }

    public boolean Conjuntovacio() {
        return (cant == 0);
    }

    public void Sacar(int x) {
        int i = 0;
        while(i < cant && a[i] !=x){
            i++;
        }
        if (i < cant){
            a[i] = a[cant-1];
            cant--;
        }
    }

    public boolean Pertenece(int x) {
        int i = 0;
        while(i < cant && a[i] != x)
            i++;
        return (i < cant);
    }
}
