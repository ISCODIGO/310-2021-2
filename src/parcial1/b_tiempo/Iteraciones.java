package parcial1.b_tiempo;

import hn.unah.is.util.Cronometro;

public class Iteraciones {
    static void forSimple(int N) {
        int iteraciones = 0;

        for (int i = 0; i < N; i++) {
            iteraciones++;
        }

        System.out.printf("N= %d. Iteraciones= %d%n", N, iteraciones);
    }

    static void forLogaritmico(int N) {
        int iteraciones = 0;

        for (int i = 1; i <= N; i *= 2) {
            //System.out.println("i=" + i);
            iteraciones++;
        }

        System.out.printf("N= %d. Iteraciones= %d%n", N, iteraciones);
    }

    static void forAnidado(int N) {
        long iteraciones = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                iteraciones++;
            }
        }

        System.out.printf("N= %d. Iteraciones= %d%n", N, iteraciones);
    }

    static void forIndependiente(int N) {
        int iteraciones = 0;

        for (int i = 0; i < N; i++) {
            iteraciones++;
        }

        for (int j = 0; j < N; j++) {
            iteraciones++;
        }

        System.out.printf("N= %d. Iteraciones= %d%n", N, iteraciones);
    }

    public static void main(String[] args) {
        Cronometro c1, c2, c3, c4;
        int N = 100_000;

        System.out.println("For logaritmico");
        c3 = new Cronometro();
        forLogaritmico(N);
        c3.detener();
        System.out.println(c3);

        System.out.println("For Simple");
        c1 = new Cronometro();
        forSimple(N);
        c1.detener();
        System.out.println(c1);

        System.out.println("For Independiente");
        c2 = new Cronometro();
        forIndependiente(N);
        c2.detener();
        System.out.println(c2);

        System.out.println("For anidado");
        c4 = new Cronometro();
        forAnidado(N);
        c4.detener();
        System.out.println(c4);

    }
}

/*


 */
