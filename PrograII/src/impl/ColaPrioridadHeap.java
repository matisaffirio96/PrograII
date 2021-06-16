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
        if (heap.length == 0) {
            System.out.println("Cola Vacia");
        } else if (heap.length == 1) {
            int min = heap[0];
            heap[0] = 0;//Se borra el elemento con un cero
            size--;//Se decrementa el tamanyo del heap

        }

        heap[0] = heap[size-1];//Intercambio el primero por el ultimo
        heap[size-1] = 0;// Pra borrar el ult elemento, lo igualo a cero
        size--;//decremento el tamaño del heap

        //reaordeno el heap
        ordenarHeap(0, size-1);
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

    private int HijoIzq(int pos) {
        int hijo;
        hijo = (2*pos)+1;
        return hijo;
    }
    private int HijoDer(int pos) {
        int hijo;
        hijo = (2*pos)+2;
        return hijo;
    }

    private void ordenarHeap(int x, int y) {
        //Pregunto si el hijo izquierdo es menor o igual Y
        if ((HijoIzq(x)) <= y) {
            //Z guarda la posicion del hijo que tiene que reordenarse arriba
            int z;
            //Si el hijo der de x es menor q Y significa que tiene que elegir el mayor de los dos hijos
            if ((HijoDer(x)) <= y) {
                //Se elige el que tiene el valor mayor
                if(heap[HijoDer(x)] <= heap[HijoIzq(x)]) {
                    z = HijoDer(x);
                }
                else {
                    z = HijoIzq(x);
                }
            }
            else {//en caso de que tenga solo hijo izq
                z = HijoIzq(x);
            }
            //Pregunto si es mayor, se hace el intercambio para armar nuevamente el arbol
            if (heap[x] > heap[z]) {
                cambio(x, z);
                ordenarHeap(z, y);
            }
        }
    }
}
