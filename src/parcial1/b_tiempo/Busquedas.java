package parcial1.b_tiempo;

import hn.unah.is.util.Cronometro;

import java.util.Random;

public class Busquedas {
    static int linearSearch(int[] conjunto, int valor) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Esta funcion necesita que el conjunto este ordenado
     */
    static int binarySearch(int[] conjunto, int valor)
    {
        int izquierda = 0;
        int derecha = conjunto.length - 1;

        while (izquierda <= derecha) {
            int mitad = izquierda + (derecha - izquierda) / 2;

            if (conjunto[mitad] == valor) {
                return mitad;
            }

            if (conjunto[mitad] < valor) {
                izquierda = mitad + 1;
            }
            else {
                derecha = mitad - 1;
            }
        }

        return -1;
    }

    static int[] crearArray(int valor) {
        int[] valores = new int[valor + 1];
        for (int i = 0; i <= valor; i++) {
            valores[i] = i;
        }
        return valores;
    }

    public static void main(String[] args) {
        int N = 100_000_000;
        int[] valores = crearArray(N);
        Random rnd = new Random();
        int x = rnd.nextInt(N + 1);
        System.out.println("El valor a encontrar es " + x);

        Cronometro c1 = new Cronometro();
        System.out.println("Lineal: " + linearSearch(valores, x));
        c1.detener();
        System.out.println(c1);

        Cronometro c2 = new Cronometro();
        System.out.println("Binario: " + binarySearch(valores, x));
        c2.detener();
        System.out.println(c2);
    }
}
