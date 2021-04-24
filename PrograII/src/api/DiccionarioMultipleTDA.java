package api;

public interface DiccionarioMultipleTDA {
    void IncicializarDiccionario();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    void Eliminarvalor(int clave, int valor);
    ConjuntoTDA Recuperar(int clave);
    ConjuntoTDA Claves();
}
