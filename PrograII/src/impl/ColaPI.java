package impl;

import api.ColaTDA;

public class ColaPI implements ColaTDA {

    int[] arr;
    int inx;


    @Override
    public void IncicializarCola() {
        arr = new int[10];
        inx = 0;
    }

    @Override
    public void Acolar(int x) {
        arr[inx] = x;
        inx++;
    }

    @Override
    public void Desacolar() {
        for (int i = 0; i< inx-1; i++){
            arr[i] = arr[i+1];
        }
        inx--;
    }

    @Override
    public boolean ColaVacia() {
        return (inx==0);
    }

    @Override
    public int Primero() {
        return arr[0];
    }
}
