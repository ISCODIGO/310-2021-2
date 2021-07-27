package parcial1.d_pilas;

import java.util.Arrays;

public class PilaArray<E> {
    private int cima;
    private E[] arreglo;

    public PilaArray(int capacidad) {
        this.arreglo = (E[]) new Object[capacidad];
        this.cima = -1;
    }

    public boolean estaVacia() {
        return this.cima == -1;
    }

    public boolean estaLlena() {
        return this.cima >= this.arreglo.length - 1;
    }

    public void apilar(E dato) {
        if (!this.estaLlena()) {
            this.arreglo[++cima] = dato;
        }
    }

    public E desapilar() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Pila vacia");
        }
        // Quitamos la cima actual
        E cima_anterior = this.arreglo[this.cima];
        // Esto posible porque es generico
        this.arreglo[this.cima] = null;
        this.cima--;
        return cima_anterior;
    }

    public E getCima() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Pila vacia");
        } else {
            return this.arreglo[this.cima];
        }
    }

    @Override
    public String toString() {
        return "PilaArray{" +
                "datos=" + Arrays.toString(arreglo) +
                '}';
    }
}
