package impl;


import api.PilaTDA;

public class PilaTF implements PilaTDA {

    int[] arr;
    int inx;

    public void InicializarPila() {
        arr = new int[10];
        inx = 0;
    }

    public void Apilar(int x) {

        arr[inx] = x;
        inx++;

    }

    public void Desapilar() {
        inx--;
    }


    public boolean PilaVacia() {
        return (inx == 0);
    }


    public int Tope() {
        return (arr[inx-1]);
    }
}
