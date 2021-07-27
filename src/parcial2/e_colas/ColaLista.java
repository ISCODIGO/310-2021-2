package parcial2.e_colas;

import parcial1.c_listas.genericas.ListaSimple;

public class ColaLista<E> {
    private ListaSimple datos;

    public ColaLista(E dato) {
        datos = new ListaSimple(dato);
    }

    public void encolar(E dato) {
        datos.insertarUltimo(dato);
    }

    public E desencolar() throws Exception {
        return (E) datos.eliminarPrimero();
    }

    public boolean estaVacia() {
        return datos.estaVacia();
    }

    @Override
    public String toString() {
        return "ColaLista{" +
                "datos=" + datos +
                '}';
    }
}
