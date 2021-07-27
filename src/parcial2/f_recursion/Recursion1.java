package parcial2.f_recursion;

public class Recursion1 {

    static void a(int conteo) {
        if (conteo <= 1_000) { // <- caso base
            System.out.println(conteo);
            a(conteo); // <- caso recursivo
        }
    }


    public static void main(String[] args) {
        a(1);
        /*int conteo = 1;
        while (true) {
            System.out.println(conteo++);
        }*/
    }
}


// 20048 recursion