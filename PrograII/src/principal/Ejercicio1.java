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
        p1.Apilar(3);
        p1.Apilar(2);
        p1.Apilar(5);

        //Cargo la pila 2
        p2.Apilar(1);
        p2.Apilar(2);
        p2.Apilar(3);
        p2.Apilar(3);
        p2.Apilar(2);
        

        int aux,aux2;
        boolean resultado = false;
        while (!p1.PilaVacia()&&!p2.PilaVacia()){
            aux = p1.Tope();
            aux2 = p2.Tope();
            if (aux == aux2){
                p2.Desapilar();
                p1.Desapilar();
                resultado = true;
            }
            else {
                p1.Desapilar();
                resultado = false;
            }
        }

        return resultado;
    }

}
