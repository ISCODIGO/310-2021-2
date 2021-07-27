package parcial2.f_recursion;

import hn.unah.is.util.Cronometro;

public class Fibonacci {
    static int instrucciones = 0;

    static long calcular(int posicion) {
        if (posicion <= 1) {
            instrucciones++;
            return posicion;
        }
        instrucciones++;
        return calcular(posicion - 1) + calcular(posicion - 2);
    }

    public static void main(String[] args) {
        final int N = 50;
        Cronometro cronometro = new Cronometro();
        long fibo = calcular(N);
        cronometro.detener();
        System.out.printf("El F(%d) = %d. %s%n", N, fibo, cronometro);
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
El F(50) = 12586269025. Cronometro{58663 ms}
 */