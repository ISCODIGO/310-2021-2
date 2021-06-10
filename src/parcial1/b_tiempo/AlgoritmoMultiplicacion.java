package parcial1.b_tiempo;

import hn.unah.is.util.Cronometro;

public class AlgoritmoMultiplicacion {
    static long multiplicarA(long a, long b) {
        System.out.println("\tInstrucciones: 1");
        return a * b;
    }

    static long multiplicarB(long a, long b) {
        long c = 0;
        long instrucciones = 1;

        while (a > 0) {
            c += b;
            a -= 1;
            instrucciones += 3;
        }

        instrucciones += 2;
        System.out.println("\tInstrucciones: " + instrucciones);
        return c;
    }

    public static void main(String[] args) {
        long x = 50;
        long y = 60;
        Cronometro c1, c2;

        c1 = new Cronometro();
        System.out.printf("Simple %d x %d = %d%n", x, y, multiplicarA(x, y));
        c1.detener();
        System.out.println(c1);

        c2 = new Cronometro();
        System.out.printf("Suma   %d x %d = %d%n", x, y, multiplicarB(x, y));
        c2.detener();
        System.out.println(c2);
    }
}
