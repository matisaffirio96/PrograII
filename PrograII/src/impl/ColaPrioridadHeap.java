package impl;

import api.ColaPrioridadTDA;
import api.ColaTDA;
import java.util.*;

public class ColaPrioridadHeap implements ColaPrioridadTDA {

    int[] heap;            // Los valores de la cola
    int[] prioridades;          // Las prioridades de la cola
    int size;

    @Override
    public void InicializarCola() {
        // definimos un arbol por defecto de 15 elementos.
        // si no se ingresan 15 elementos, se rellenan con 0 (ceros)
        size = 0;
        heap = new int[15];
        prioridades = new int[15];

    }

    private int padre(int pos) {
        return ((pos - 1) / 2);
    }
    private void cambio(int i, int j) {
        // se crea un metodo privado para intercambiar los hijos
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    @Override
    public void AcolarPrioridad(int x, int prioridad) { // prioridad por default
        if(size == heap.length){
            System.out.println("Cola llena");
        }
        else{
            int posicion = size;
            heap[posicion] = x;
            size++;

            while (heap[posicion] < heap[padre(posicion)]){
                cambio(posicion, padre(posicion));
                posicion = padre(posicion);
            }
        }
    }

    @Override
    public void Desacolar() {

    }

    @Override
    public boolean ColaVacia() {
        return (size == 0);
    }

    @Override
    public int Primero() {
        return (heap[0]);
    }

    @Override
    public int Prioridad() {
        return (prioridades[size]);
    }
}
