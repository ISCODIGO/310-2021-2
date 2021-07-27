/*
Para este caso se omitio la implementacion de si la cola esta vacia o llena
con respecto a la posicion de frente y fin ya que se corroboró que estas
posiciones se tiene el mismo resultado cuando la estructura esta vacia y esta
llena:

ColaArrayCircular{cantidad=0, frente=0, fin=4, datos=[null, null, null, null, null]}
ColaArrayCircular{cantidad=5, frente=0, fin=4, datos=[10, 20, 30, 40, 50]}

 */

package parcial2.e_colas;

import java.util.Arrays;

public class ColaArrayCircular<E> {
    // Este sirve para remover
    private int frente;
    // Este sirve para insertar
    private int fin;
    // Repositorio
    private E[] elementos;
    private int cantidad;

    public ColaArrayCircular(int capacidad) {
        // Arreglo que contiene todos los elementos de la cola
        this.elementos = (E[]) new Object[capacidad];
        // La posicion del nodo que debe eliminarse
        this.frente = 0;
        // La posicion donde esta el nodo insertado
        this.fin = elementos.length - 1;
        // Cantidad de elementos
        this.cantidad = 0;
    }

    private int moverSiguiente(int posicionPrevia) {
        return (posicionPrevia + 1) % this.elementos.length;
    }

    public E getFrente() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Cola Vacia");
        }
        return this.elementos[this.frente];
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public boolean estaLlena() {
        return cantidad == elementos.length;
    }

    public void encolar(E dato) throws Exception {
        if (this.estaLlena()) {
            throw new Exception("Cola Llena");
        }
        fin = moverSiguiente(fin);
        elementos[fin] = dato;
        cantidad++;
    }

    public E desencolar() throws Exception {
        // Obtener previamente el valor a eliminar
        E temp = this.getFrente();
        // (OPCIONAL) Dado que es generico puede apuntar a NULL ese nodo
        elementos[frente] = null;
        // Mover hacia el siguiente (el ahora mas antiguo)
        frente = moverSiguiente(frente);
        cantidad--;
        return temp;
    }

    public void vaciar() {
        // Si revisa en realidad no se vacia la estructura solamente los indices
        // conocidos se modifican a la posicion original.
        frente = 0;
        fin = elementos.length - 1;
        cantidad = 0;
    }

    @Override
    public String toString() {
        return "ColaArrayCircular{" +
                "cantidad=" + cantidad +
                ", frente=" + frente +
                ", fin=" + fin +
                ", datos=" + Arrays.toString(elementos) +
                '}';
    }

    public static void main(String[] args) {
        ColaArrayCircular<Integer> cc = new ColaArrayCircular<>(5);
        try {
            System.out.println(cc);
            cc.encolar(10);
            System.out.println(cc);
            cc.encolar(20);
            cc.encolar(30);
            cc.encolar(40);
            cc.encolar(50);
            System.out.println(cc);
            //cc.encolar(60);   // Genera overflow
            System.out.println(cc);
            cc.desencolar(); // 10
            System.out.println("20 == " + cc.desencolar());
            System.out.println(cc);
            cc.encolar(60);
            System.out.println(cc);
            cc.encolar(70);
            System.out.println("X => " + cc);
            cc.desencolar();
            cc.desencolar();
            cc.desencolar();
            cc.desencolar();
            cc.desencolar();
            cc.encolar(100);
            cc.desencolar();
            System.out.println(cc);
            cc.encolar(100);
            cc.encolar(200);
            System.out.println(cc);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}