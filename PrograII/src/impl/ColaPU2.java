package impl;

import api.ColaTDA;

public class ColaPU2 implements ColaTDA {

    int[] arr;

    @Override
    public void IncicializarCola() {
        arr = new int[10];
        arr[0] = 0;
    }

    @Override
    public void Acolar(int x) {
        for (int i=arr[0]; i>0; i--){
            arr[i+1] = arr[i];
        }
        arr[1] = x;
        arr[0]++;
    }

    @Override
    public void Desacolar() {
        arr[0]--;
    }

    @Override
    public boolean ColaVacia() {
        return (arr[0]==0);
    }

    @Override
    public int Primero() {
        return arr[arr[0]];
    }
}
