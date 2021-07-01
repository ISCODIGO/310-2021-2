package parcial1.d_pilas;

public class PruebaMemoriaPila {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
        System.out.println("Llamado de A");
    }

    public static void b() {
        c();
        System.out.println("Llamado de B");
    }

    public static void c() {
        d();
        System.out.println("Llamado de C");
    }

    public static void d() {
        System.out.println("Llamado de D");
    }
}
