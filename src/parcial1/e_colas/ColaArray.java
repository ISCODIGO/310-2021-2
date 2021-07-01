package parcial1.e_colas;

public class ColaArray<E> {
    // Este sirve para remover
    private int frente;
    // Este sirve para insertar
    private int fin;
    // Repositorio
    private E[] datos;

    public ColaArray(int capacidad) {
        this.datos = (E[]) new Object[capacidad];
    }

    public E getFrente() {
        return this.datos[this.frente];
    }

    public boolean estaVacia() {
        return false;
    }

    public boolean estaLlena() {
        return false;
    }

    public void encolar(E dato) {

    }

    public E desencolar() {
        return null;
    }
}
