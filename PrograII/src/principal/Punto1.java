package principal;

import api.ColaTDA;
import impl.ColaPU;
import impl.PilaTF;

public class Punto1 {
    public static void main(String[] args) {

        ColaTDA col = ColaBinaria(100);

        // demostración de funcionamiento
        while (!col.ColaVacia()){
            System.out.println(col.Primero());
            col.Desacolar();
        }

    }

    public static ColaTDA ColaBinaria(int numero) {
        int entero;
        double resultado;
        ColaPU colabina = new ColaPU();
        colabina.IncicializarCola();

        PilaTF aux = new PilaTF();
        aux.InicializarPila(); //uso una pila auxiliar

        if (numero > 0) {
            resultado = 0;
            while (numero != 0) {
                entero = numero % 2;
                resultado = resultado + entero;
                numero = numero / 2;
                aux.Apilar(entero);
            }
        }
        while (!aux.PilaVacia()){
            colabina.Acolar(aux.Tope());
            aux.Desapilar();
        }
        return colabina;
    }
}
