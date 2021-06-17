package parcial1.c_listas;

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public Nodo(int dato, Nodo siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public Nodo(int dato) {
        this.setDato(dato);
        this.setSiguiente(null);
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
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
                "dato=" + dato +
                '}';
    }
}
