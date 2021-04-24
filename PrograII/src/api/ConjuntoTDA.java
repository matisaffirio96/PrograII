package api;

public interface ConjuntoTDA {
    void InicializarConjunto();
    void Agregar(int x);
    int Elegir();
    boolean Conjuntovacio();
    void Sacar(int x);
    boolean Pertenece(int x);
}
