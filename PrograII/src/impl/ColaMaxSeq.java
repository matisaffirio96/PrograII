package impl;

import api.ColaTDAM;

public class ColaMaxSeq implements ColaTDAM {
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
        for (int i = 0; i < inx - 1; i++) {
            arr[i] = arr[i + 1];
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

    public int MaxSeq() {
        int valor, valor2, contadorSeq, contadorMax;

        contadorSeq = 1;
        contadorMax = 1;

        for (int i = 0; i < inx - 1; i++) {
            valor = arr[i];
            valor2 = arr[i + 1];
            if (valor2 > valor) {
                contadorSeq = contadorSeq + 1;
                if (contadorSeq >= contadorMax) {
                    contadorMax = contadorSeq;
                }
            } else {
                contadorSeq = 1;
            }
        }
        return contadorMax;
    }
}
