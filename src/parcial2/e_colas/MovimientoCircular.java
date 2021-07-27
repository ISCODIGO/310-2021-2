package parcial2.e_colas;

public class MovimientoCircular {
    public static int otraFormaCircular(int N, int posicionPrevia) {
        if (posicionPrevia < N - 1) {
            posicionPrevia++;
        } else {
            posicionPrevia = 0;
        }
        return posicionPrevia;
    }
    public static void main(String[] args) {
        int N = 5;

        for (int i = 0; i < 25; i++) {
            int valorCircular = (i+1) % 5;
            int vc2 = otraFormaCircular(N, i);
            System.out.println(String.format("i=%d  circular=%d otro=%d",
                    i, valorCircular, vc2));
        }
    }
}
