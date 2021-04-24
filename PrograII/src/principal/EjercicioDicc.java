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
        d2.Agregar(2,34);
        d2.Agregar(3,21);
        d2.Agregar(4,11);
        d2.Agregar(2,35);


        resultado = d2.Recuperar(2);
        while (!resultado.Conjuntovacio()){
            System.out.println(resultado.Elegir());
            resultado.Sacar(resultado.Elegir());
        }

    }
}
