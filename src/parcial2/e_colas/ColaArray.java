package parcial2.e_colas;

import java.util.Arrays;

public class ColaArray<E> {
    private int frente;
    private int fin;
    private final E[] elementos;

    public ColaArray(int capacidad) {
        this.elementos = (E[]) new Object[capacidad];
        this.frente = 0;
        this.fin = -1;
    }

    public void encolar(E dato) {
        this.elementos[++this.fin] = dato;
    }

    public E desencolar() throws Exception {
        E temp = getFrente();
        this.elementos[this.frente] = null;
        this.frente++;
        return temp;
    }

    public E getFrente() throws Exception {
        if (estaVacia()) {
            throw new Exception("Cola vacia");
        }
        return this.elementos[this.frente];
    }

    public boolean estaVacia() {
        return this.fin < this.frente;
    }

    public boolean estaLlena() {
        return this.fin == elementos.length - 1;
    }

    @Override
    public String toString() {
        return "ColaArray{" +
                "frente=" + frente +
                ", fin=" + fin +
                ", datos=" + Arrays.toString(elementos) +
                '}';
    }

    public static void main(String[] args) throws Exception {
        ColaArray<Integer> cola = new ColaArray<>(6);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.desencolar();
        cola.encolar(40);
        cola.desencolar();
        cola.encolar(50);

        System.out.println(cola);
    }
}
