package api;

public interface ColaLimitadaTDA {
    void InicializarCola(int capacidad);
    int Acolar (int x);
    void Desacolar();
    boolean ColaVacia();
    int Primero();
    boolean ColaLlena();

}
