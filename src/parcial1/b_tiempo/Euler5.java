package parcial1.b_tiempo;

/**
 * projecteuler.net
 * 2520 es el número más pequeño que se puede dividir por cada uno de
 * los números del 1 al 10 sin ningún residuo.
 *
 * ¿Cuál es el número positivo más pequeño que es divisible
 * uniformemente por todos los números del 1 al 20?
 */

public class Euler5 {
    static void version1(int n) {
        boolean continuar = true;
        int valorMinimo = 1;
        int candidato = valorMinimo;
        int iteraciones = 0;

        while (continuar) {
            // Evaluar al candidato para ver si es divisible por todos los digitos
            boolean esRespuesta = true;
            for (int i = 2; i <= n; i++) {
                // Si el candidato falla, no tengo que seguir evaluandolo.
                iteraciones++;

                if (candidato % i != 0) {
                    esRespuesta = false;
                    break;
                }
            }

            if (esRespuesta) {
                continuar = false;
            } else {
                candidato += valorMinimo;
            }
        }

        System.out.printf("Candidato es: %d con %d iteraciones.%n", candidato, iteraciones);
    }

    static void version2(int n) {
        boolean continuar = true;
        int valorMinimo = 1;
        int candidato = valorMinimo;
        int iteraciones = 0;

        while (continuar) {
            // Evaluar al candidato para ver si es divisible por todos los digitos
            boolean esRespuesta = true;
            for (int i = n; i >= 2; i--) {
                iteraciones++;
                // Si el candidato falla, no tengo que seguir evaluandolo.
                if (candidato % i != 0) {
                    esRespuesta = false;
                    break;
                }
            }

            if (esRespuesta) {
                continuar = false;
            } else {
                candidato += valorMinimo;
            }
        }

        System.out.printf("Candidato es: %d con %d iteraciones.%n", candidato, iteraciones);
    }

    static void version3(int n) {
        boolean continuar = true;
        int valorMinimo = n * (n - 1);
        int candidato = valorMinimo;
        int k = 1;
        int iteraciones = 0;

        while (continuar) {
            // Evaluar al candidato para ver si es divisible por todos los digitos
            boolean esRespuesta = true;
            for (int i = n; i >= 2; i--) {
                iteraciones++;
                // Si el candidato falla, no tengo que seguir evaluandolo.
                if (candidato % i != 0) {
                    esRespuesta = false;
                    break;
                }
            }

            if (esRespuesta) {
                continuar = false;
            } else {
                candidato = valorMinimo * k;
                k++;
            }
        }

        System.out.printf("Candidato es: %d con %d iteraciones.%n", candidato, iteraciones);
    }

    public static void main(String[] args) {
        int N = 20;
        version1(N);
        // v1.1= 416181987
        // v1.2= 183389427
        // v2.1= 245119048
        // v3.1= 1912087
        version2(N);
        version3(N);
    }
}