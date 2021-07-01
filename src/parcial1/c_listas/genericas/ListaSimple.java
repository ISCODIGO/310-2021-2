package parcial1.c_listas.genericas;

public class ListaSimple<E> {
    Nodo<E> primero;
    Nodo<E> ultimo;
    int conteo;

    public ListaSimple(E datoInicial) {
        this.insertarPrimerNodo(datoInicial);
    }

    public E getPrimero() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Lista vacia");
        }
        return this.primero.getDato();
    }

    public E getUltimo() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Lista vacia");
        }
        return this.ultimo.getDato();
    }

    private void insertarPrimerNodo(E dato) {
        Nodo nuevo = new Nodo(dato);
        this.primero = this.ultimo = nuevo;
        this.conteo = 1;
    }

    public void vaciar() {
        this.primero = null;
        this.ultimo = null;
        this.conteo = 0;
    }

    public boolean estaVacia() {
        return this.primero == null && this.ultimo == null;
    }

    public void insertarPrimero(E dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(primero);
        this.primero = nuevo;
        this.conteo++;
    }

    public void insertarUltimo(E dato) {
        Nodo nuevo = new Nodo(dato);
        this.ultimo.setSiguiente(nuevo);
        this.ultimo = nuevo;
        this.conteo++;
    }

    public E eliminarPrimero() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Lista esta vacia.");
        }

        // Almacenar el primero que esta a punto de eliminarse.
        Nodo temp = this.primero;
        this.primero = this.primero.getSiguiente();
        E valor = (E)temp.getDato();
        temp = null;

        if (this.primero == null) {
            this.ultimo = null;
        }

        this.conteo--;
        return valor;
    }

    public E eliminarUltimo() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Lista esta vacia.");
        }

        E valor;
        Nodo previo = this.primero;
        Nodo proximo = previo.getSiguiente();

        // que pasa con LE con un 1 nodo
        if (previo == ultimo) {
            valor = (E)previo.getDato();
            this.vaciar();
        } else {
            // Bucle para hallar al penultimo
            while (proximo != this.ultimo) {
                previo = proximo;
                proximo = proximo.getSiguiente();
            }

            valor = (E) proximo.getDato();
            previo.setSiguiente(null);
            this.ultimo = previo;
        }

        this.conteo--;
        proximo = null;
        return valor;
    }

    public int getConteo() {
        return this.conteo;
    }

    public Nodo buscar(E dato) {
        if (this.estaVacia()) {
            return null;
        }

        for(Nodo temp = this.primero; temp != null; temp = temp.getSiguiente()) {
            // Evaluar cuando sea generico
            if (temp.getDato() == dato) {
                return temp;
            }
        }

        return null;
    }

    public Object[] toArray() {
        if (this.estaVacia()) {
            return null;
        }

        int indice = 0;
        Object[] salida = new Object[this.conteo];

        for(Nodo temp = this.primero; temp != null; temp = temp.getSiguiente()) {
            salida[indice++] = temp.getDato();
        }

        return salida;
    }
}
