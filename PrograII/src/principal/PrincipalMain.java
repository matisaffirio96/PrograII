package principal;
import api.ConjuntoTDA;
import api.PilaTDA;
import impl.Conjunto;
import impl.PilaTF;
import principal.Ejercicio1;

public class PrincipalMain {
    public static void main(String[] args) {
        // creo un nuevo conjunto y despues lo paso por parametro al metodo externo
        Conjunto conj = new Conjunto();
        //Agregando(conj);

        PilaTF p1 = new PilaTF();
        PilaTF p2 = new PilaTF();
        /*PasarPila(p1,p2); // Ejercicio 1-a
        PasarPilaOrdenada(p1,p2,p3); // Ejercicio 1-b
        ContarElementos(p1); // Ejercicio 1-d
        SumarElementos(p2); // Ejercicio 1-e
        SumarElementos2(p1);*/

        //Ejercicio1.SecuenciaPila(PilaTDA p1, PilaTDA p2);

        Ejercicio1 ej = new Ejercicio1();
        System.out.println(ej.SecuenciaPila(p1,p2));


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

        }

    }

    public static void PasarPila(PilaTDA p1, PilaTDA p2){

        p1.InicializarPila();
        p2.InicializarPila();

        p1.Apilar(1);
        p1.Apilar(3);
        p1.Apilar(6);
        p1.Apilar(5);

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

