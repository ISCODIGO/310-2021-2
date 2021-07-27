package parcial2.f_recursion;

import hn.unah.is.util.Cronometro;

public class FibonacciMejorado {
    static int instrucciones = 0;

    static long calcular(int posicion, long[] memoria) {
        if (posicion <= 1) {
            instrucciones++;
            return posicion;
        }

        // si no hay memoria
        if (memoria == null) {
            memoria = new long[posicion + 1];
            memoria[0] = 0;
            memoria[1] = 1;
        }

        // si el resultado ya esta almacenado se devuelve
        if (posicion > 1 && memoria[posicion] != 0) {
            return memoria[posicion];
        }

        instrucciones++;

        // la progresion normal
        memoria[posicion] = calcular(posicion - 1, memoria)
                + calcular(posicion - 2, memoria);

        return memoria[posicion];
    }

    public static void main(String[] args) {
        final int N = 10;
        Cronometro cronometro = new Cronometro();
        long fibo = calcular(N, null);
        cronometro.detener();
        System.out.printf("El F-mejor(%d) = %d. %s%n", N, fibo, cronometro);
        System.out.println("Instrucciones: " + instrucciones);
    }
}
/*
El F(34) = 5702887. Cronometro{27 ms}
El F(36) = 14930352. Cronometro{76 ms}
El F(38) = 39088169. Cronometro{202 ms}
El F(40) = 102334155. Cronometro{513 ms}
El F(42) = 267914296. Cronometro{1344 ms}
El F(44) = 701408733. Cronometro{3380 ms}
El F(46) = 1836311903. Cronometro{8455 ms}
El F(48) = 512559680. Cronometro{21988 ms}
El F(50) = -298632863. Cronometro{58663 ms}
 */