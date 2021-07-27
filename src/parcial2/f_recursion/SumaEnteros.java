package parcial2.f_recursion;

public class SumaEnteros {
    // O(N)
    static int calcularIterativo(int N) {
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        return suma;
    }

    // O(N)
    static int calcularRecursivo(int N) {
        // Caso Base
        if (N == 1) {
            return 1;
        }
        // Caso recursivo
        else {
            return calcularRecursivo(N - 1) + N;
        }
    }

    // O(1)
    static int calcularConstante(int N) {
        return N * (N + 1) / 2;
    }

    public static void main(String[] args) {
        int N = 100;
        int sumaIterativo = calcularIterativo(N);
        System.out.println("Iterativo= " + sumaIterativo);
        int sumaConstante = calcularConstante(N);
        System.out.println("Constante= " + sumaConstante);
        int sumaRecursivo = calcularRecursivo(N);
        System.out.println("Recursivo= " + sumaRecursivo);
    }
}

// 1 784 293 664