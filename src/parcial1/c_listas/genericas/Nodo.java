package parcial1.c_listas.genericas;

public class Nodo<E> {
    private E dato;
    private Nodo siguiente;

    public Nodo(E dato, Nodo siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public Nodo(E dato) {
        this.setDato(dato);
        this.setSiguiente(null);
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato.toString() +
                '}';
    }
}
