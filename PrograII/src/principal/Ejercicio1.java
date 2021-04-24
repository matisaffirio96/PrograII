package principal;
import api.PilaTDA;



public class Ejercicio1 {

    public boolean SecuenciaPila(PilaTDA p1, PilaTDA p2){

        p1.InicializarPila();
        p2.InicializarPila();

        //Cargo la pila 1
        p1.Apilar(0);
        p1.Apilar(1);
        p1.Apilar(2);
        p1.Apilar(3);
        p1.Apilar(4);

        //Cargo la pila 2
        p2.Apilar(1);
        p2.Apilar(2);
        p2.Apilar(1);

        /*
        Pila 1
        4
        3
        2
        1
        0

        Pila 2
        1
        2
        1
        */
        int aux;
        while (!p2.PilaVacia()){
            aux = p1.Tope();
            if(aux == p2.Tope()){
                //System.out.println("p1 " + aux +" p2 " + p2.Tope());
                p2.Desapilar();
                p1.Desapilar();
            } else  {
                p1.Desapilar();
            }


        }
        return true;
    }

}
