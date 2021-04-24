package api;

public interface ColaPrioridadTDA {
    void InicializarCola(); // sin precondiciones
    void AcolarPrioridad(int x, int prioridad); // cola inicializada
    void Desacolar(); // cola inicializada y no vac´ıa
    boolean ColaVacia(); // cola inicializada
    int Primero(); // cola inicializada y no vac´ıa
    int Prioridad();
}
