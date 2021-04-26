package impl;

import api.ColaLimitadaTDA;

public class ColaLim implements ColaLimitadaTDA {
    int[] arr;
    int inx;

    int limite;

    @Override
    public void InicializarCola(int capacidad) {
        limite = capacidad;
        if (limite >= 0) {
            arr = new int[limite];
            inx = 0;
        } else {
            System.out.println("La capacidad debe ser mayor a 0");
        }


    }

    @Override
    public int Acolar(int x) {
        int resultado = 1;
        if(!ColaLlena()){
            arr[inx] = x;
            inx++;
            return resultado = 0;
        }
        return resultado;
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
        return (inx == 0);
    }

    @Override
    public int Primero() {
        return arr[0];
    }

    @Override
    public boolean ColaLlena() {
        if (inx > 0){
            return true;
        }
        return false;
    }
}
