package impl;

import api.ColaTDA;

public class ColaPU implements ColaTDA {

    int[] arr;
    int inx;


    @Override
    public void IncicializarCola() {
        arr = new int[10];
        inx = 0;
    }

    @Override
    public void Acolar(int x) {
        for (int i =inx-1; i>=0; i++){
            arr[i+1] = arr[i];
        }
        arr[0] = x;
        inx++;
    }

    @Override
    public void Desacolar() {
        inx--;
    }

    @Override
    public boolean ColaVacia() {
        return (inx==0);
    }

    @Override
    public int Primero() {
        return arr[inx-1];
    }
}
