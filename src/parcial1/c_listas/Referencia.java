package parcial1.c_listas;

import java.awt.*;

public class Referencia {
    public static void main(String[] args) {
        // Tipos de datos atomicos/primitivos
        int a = 10;
        int b = a;

        b = 20;
        System.out.printf("A=%d B=%d", a, b);

        // Tipos de datos compuestos/objetos
        // Inmutables
        String s1 = "hola";
        String s2 = s1;
        System.out.printf("%nHashcode al inicio S1=%d S2=%d", s1.hashCode(), s2.hashCode());

        s2 = "adios";
        System.out.printf("%nS1=%s S2=%s", s1, s2);
        System.out.printf("%nHashcode al final S1=%d S2=%d", s1.hashCode(), s2.hashCode());

        // Mutables (comportamiento defecto)
        Point punto1 = new Point(10, 20);
        Point punto2 = punto1;

        punto2.x = 100;
        punto2.y = 30;

        System.out.println("\nEl punto 1 es este: " + punto1);
        System.out.println("\nEl punto 2 es este: " + punto2);
    }
}
