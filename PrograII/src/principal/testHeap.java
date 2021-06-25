package principal;

import impl.ColaPrioridadDA;
import impl.ColaPrioridadHeap;

    import java.util.HashMap;
import java.util.Map;

public class testHeap {
    public static void main(String[] args) {
        ColaPrioridadHeap h1 = new ColaPrioridadHeap();
        h1.InicializarCola();
        h1.AcolarPrioridad(5,18);
        h1.AcolarPrioridad(7,15);
        h1.AcolarPrioridad(8,12);
        h1.AcolarPrioridad(2,15);
        h1.AcolarPrioridad(9,15);
        h1.AcolarPrioridad(12,15);
        h1.AcolarPrioridad(14,15);

        h1.Desacolar();
        h1.Desacolar();
        h1.Desacolar();
        h1.AcolarPrioridad(10,12);
        h1.AcolarPrioridad(2,15);

        while(!h1.ColaVacia()){
            System.out.println(h1.Primero());
            h1.Desacolar();
        }


        /*Map<Integer, String> ejemploHM = new HashMap<Integer, String>();
        ejemploHM.size(); // Devuelve el número de elementos del Map
        ejemploHM.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        ejemploHM.put(1, "v1"); // Añade un elemento al Map
        ejemploHM.put(2,"v2");
        ejemploHM.put(3,"v3");
        ejemploHM.get(1); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        //ejemploHM.remove(2); // Borra el par clave/valor de la clave que se le pasa como parámetro
        //ejemploHM.clear(); // Borra todos los componentes del Map

        ejemploHM.containsKey(3); // Devuelve true si en el map hay una clave que coincide con K
        System.out.println(ejemploHM.containsValue("v2")); // Devuelve true si en el map hay un Valor que coincide con V
        System.out.println(ejemploHM.values()); // Devuelve una "Collection" con los valores del Map
        */

    }

}
