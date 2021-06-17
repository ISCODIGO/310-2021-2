package parcial1.c_listas;

public class ListaSimple {
    Nodo primero;
    Nodo ultimo;

    public ListaSimple(int datoInicial) {
        this.insertarPrimero(datoInicial);
        System.out.println(this.primero);
        System.out.println(this.ultimo);
    }

    private void insertarPrimero(int dato) {
        Nodo nuevo = new Nodo(dato);
        this.primero = this.ultimo = nuevo;
    }

    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
    }
}
