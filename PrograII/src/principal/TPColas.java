package principal;

import api.ColaTDA;
import impl.ColaPI;
import impl.ColaPU;
import impl.PilaTF;

public class TPColas {
    public static void main(String[] args) {
        ColaPU c1 = new ColaPU();
        ColaPU c2 = new ColaPU();
        c1.IncicializarCola();
        c2.IncicializarCola();

        c1.Acolar(3);
        c1.Acolar(4);
        c1.Acolar(5);
        c1.Acolar(7);
        c1.Acolar(8);

        c2.Acolar(3);
        c2.Acolar(5);
        c2.Acolar(9);
        c2.Acolar(4);
        c2.Acolar(9);


        //PasarCola(c1,c2);
        //FinalColaIguales(c1,c2);
        InvertirColaConPila(c1,c2);
        //FinalColaIguales(c1,c2);

        /*
        int prim = c1.Primero();
        int prim2 = c2.Primero();
        if (prim == prim2){
            System.out.println("El ultimo elemento de C1 es " + prim + " Igual a al ultimo de c2 " + prim2);
        } else {
            System.out.println("El ultimo elemento de C1 es " + prim + " No es Igual a al ultimo de c2 " + prim2);
        }*/

    }

    public static void PasarCola(ColaTDA c1, ColaTDA c2){

        c1.Acolar(3);
        c1.Acolar(4);
        c1.Acolar(5);
        c1.Acolar(7);

        while (!c1.ColaVacia()){
            c2.Acolar(c1.Primero());
            c1.Desacolar();
        }

        while (!c2.ColaVacia()){
            System.out.println(c2.Primero());
            c2.Desacolar();
        }
    }
    // Invertir colas con pilas y determinar si el ultimo elemento es igual o no
    public static void InvertirColaConPila(ColaTDA c1, ColaTDA c3){
        ColaPU c2 = new ColaPU();
        ColaPU c4 = new ColaPU();
        c2.IncicializarCola();
        c4.IncicializarCola();

        PilaTF p1 = new PilaTF();
        p1.InicializarPila();
        PilaTF p2 = new PilaTF();
        p2.InicializarPila();


        while (!c1.ColaVacia()){
            p1.Apilar(c1.Primero());
            c1.Desacolar();
        }

        while (!p1.PilaVacia()){
            c2.Acolar(p1.Tope());
            p1.Desapilar();
        }

        while (!c3.ColaVacia()){
            p2.Apilar(c3.Primero());
            c3.Desacolar();
        }

        while (!p2.PilaVacia()){
            c4.Acolar(p2.Tope());
            p2.Desapilar();
        }

        if (c2.Primero() == c4.Primero()){
            System.out.println("El ultimo elemento de C1 es " + c2.Primero() + " Igual a al ultimo de c2 " + c4.Primero());
        } else {
            System.out.println("El ultimo elemento de C1 es " + c2.Primero() + " No es Igual a al ultimo de c2 " + c4.Primero());
        }

        /*while (!c2.ColaVacia()){
            System.out.println(c2.Primero());
            c2.Desacolar();
        }*/
    }
}
