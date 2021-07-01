package parcial1.d_pilas;

import parcial1.c_listas.genericas.ListaSimple;

public class PilaLista<E> {
    ListaSimple lista;

    public PilaLista(E dato) {
        lista = new ListaSimple(dato);
    }

    // push
    public void apilar(E dato) {
        lista.insertarPrimero(dato);
    }

    // pop
    public E desapilar() throws Exception {
        return (E) lista.eliminarPrimero();
    }

    public E getCima() throws Exception {
        return (E) lista.getPrimero();
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }

    public void vaciar() {
        lista.vaciar();
    }
}
