package principal;
import api.*;
import impl.*;


public class PrincipalMain {
    public static void main(String[] args) {
        // creo un nuevo conjunto y despues lo paso por parametro al metodo externo
        //Conjunto conj = new Conjunto();
        //Agregando(conj);
        PilaTF p1 = new PilaTF();
        PilaTF p2 = new PilaTF();
        PasarPila(p1,p2);
        /*PasarPila(p1,p2); // Ejercicio 1-a
        PasarPilaOrdenada(p1,p2,p3); // Ejercicio 1-b
        ContarElementos(p1); // Ejercicio 1-d
        SumarElementos(p2); // Ejercicio 1-e
        SumarElementos2(p1);*/

        /*PilaTF p1 = new PilaTF();
        PilaTF p2 = new PilaTF();
        DicSimpleA d1 = new DicSimpleA();
        DicMultipleA d2 = new DicMultipleA();

        Ejercicio1 ej = new Ejercicio1();
        System.out.println(ej.SecuenciaPila(p1,p2));

        EjercicioDicc ejd = new EjercicioDicc();
        ejd.Practica(d1,d2);

        ColaLim cola1 = new ColaLim();

        cola1.InicializarCola(2);
        cola1.Acolar(1);
        cola1.Acolar(2);
        System.out.println(cola1.ColaLlena());


        Nodo n1 = new Nodo();

        ListaEnlazada l1 = new ListaEnlazada();
        l1.AgregarI(n1,4);
        l1.AgregarI(n1,5);
        l1.MostrarLista(n1);
        */


    }


    // creo un metodo externo
    public static void Agregando(ConjuntoTDA conju){
        int x= 0;
        conju.InicializarConjunto();
        while (conju.Conjuntovacio()){
            conju.Agregar(x);
            System.out.println(conju);
            /*for(int i=0; i<=5; i++){
                conju.Agregar(x);
                System.out.println(conju.Elegir());
                x++;
            }*/
            //nuevo comentario

        }

    }

    public static void PasarPila(PilaTDA p1, PilaTDA p2){

        p1.InicializarPila();
        p2.InicializarPila();

        p1.Apilar(1);
        //System.out.println(p1.Tope());
        p1.Apilar(3);
        //System.out.println(p1.Tope());
        p1.Apilar(6);
        //System.out.println(p1.Tope());
        p1.Apilar(5);
        System.out.println(p1.Tope());

        while (!p1.PilaVacia()){
            p2.Apilar(p1.Tope());
            p1.Desapilar();
        }

        /*while (!p1.PilaVacia()){
            System.out.println(p1.Tope());
            p1.Desapilar();
        }*/

    }

    public static void PasarPilaOrdenada(PilaTDA p1, PilaTDA p2, PilaTDA p3){
        p1.InicializarPila();
        p2.InicializarPila();
        p3.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(3);
        p1.Apilar(6);
        p1.Apilar(5);

        while(!p1.PilaVacia()){
            p2.Apilar(p1.Tope());
            p1.Desapilar();
            p3.Apilar(p2.Tope());
            p2.Desapilar();
        }

        while (!p3.PilaVacia()){
            System.out.println("Pila 3= " + p3.Tope());
            p3.Desapilar();
        }

    }

    public static void ContarElementos(PilaTDA p1){

        p1.InicializarPila();
        p1.Apilar(1);
        p1.Apilar(3);
        p1.Apilar(6);
        p1.Apilar(5);

        int contador = 0;

        while(!p1.PilaVacia()){
            contador = contador + 1;
            p1.Desapilar();
        }

        System.out.println("La pila tiene: " + contador + " elementos");

    }

    public static void SumarElementos(PilaTDA p1){

        int sumador = 0;

        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(3);
        p1.Apilar(6);
        p1.Apilar(5);

        while (!p1.PilaVacia()){
            sumador = sumador + p1.Tope();
            p1.Desapilar();
        }

        System.out.println("La suma de los elementos es: " + sumador);

    }

    public static void SumarElementos2(PilaTDA p1){
        int sumador2 = 0;

        p1.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(3);
        p1.Apilar(6);
        p1.Apilar(5);
        System.out.println("El tope final es:" + p1.Tope());

        while (!p1.PilaVacia()){
            sumador2 = sumador2 + p1.Tope();
            p1.Desapilar();
        }

        System.out.println("La suma de los elementos es: " + sumador2);

    }



}

