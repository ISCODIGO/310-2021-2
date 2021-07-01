package parcial1.c_listas.genericas;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple(10);
        lista.insertarPrimero(20);
        lista.insertarPrimero(30);
        try {
            lista.eliminarPrimero();
            lista.eliminarPrimero();
        } catch (Exception ex) {}

        System.out.println(Arrays.toString(lista.toArray()));
    }
}
