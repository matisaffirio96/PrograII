package principal;
import api.ConjuntoTDA;
import impl.Conjunto;
import impl.ConjuntoLD;
import impl.DicMultipleA;
import impl.DicSimpleA;

public class EjercicioDicc {

    public void Practica(DicSimpleA d1, DicMultipleA d2){


        ConjuntoTDA resultado;

        d1.IncicializarDiccionario();
        d2.IncicializarDiccionario();

        d2.Agregar(1,1);
        d2.Agregar(2,3);
        d2.Agregar(2,5);
        d2.Agregar(3,-3);
        d2.Agregar(3,2);
        d2.Agregar(5,1);



        /*resultado = d2.Recuperar(2);
        while (!resultado.Conjuntovacio()){
            System.out.println(resultado.Elegir());
            resultado.Sacar(resultado.Elegir());
        }*/
        ConjuntoTDA clavesDic = new ConjuntoLD();
        clavesDic.InicializarConjunto();
        clavesDic = d2.Claves();
        int suma;
        while(!clavesDic.Conjuntovacio()){
            suma = 0;
            int clave = clavesDic.Elegir();
            resultado = d2.Recuperar(clave);
            while (!resultado.Conjuntovacio()){
                suma = suma+resultado.Elegir();
                resultado.Sacar(resultado.Elegir());
            }
            if (suma<0){
                d1.Agregar(clave,-1);
            } else {
                d1.Agregar(clave,1);
            }

            clavesDic.Sacar(clave);
        }



    }
}
