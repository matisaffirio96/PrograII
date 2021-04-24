package api;

public interface DiccionarioSimpleTDA {

    void IncicializarDiccionario();
    void Agregar(int clave, int valor);
    void Eliminar(int clave);
    int Recuperar(int clave);
    ConjuntoTDA Claves();
}
