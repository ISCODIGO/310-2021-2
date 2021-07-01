package parcial1.c_listas;

import java.util.Arrays;

public class ListaSimpleMain {
    public static void main(String[] args) {
        ListaSimple ls = new ListaSimple(10);

        // Prueba 1: Modificar los valores de uno de los punteros
        //ls.primero.setDato(20);
        //System.out.println(ls.ultimo);

        // Prueba 2: Probar que 'vaciar' funciona
        //ls.vaciar();
        //System.out.println(ls.ultimo);

        // Prueba 3: Probar que 'insertar al primero' funciona.
        //ls.insertarPrimero(20);
        //System.out.println("Primero debe ser 20: " + ls.primero);
        //System.out.println("Ultimo debe ser 10: " + ls.ultimo);

        // Prueba 4: Probar que 'insertar al ultimo' funciona.
        //ls.insertarUltimo(20);
        //System.out.println("Primero debe ser 10: " + ls.primero);
        //System.out.println("Ultimo debe ser 20: " + ls.ultimo);

        // Prueba 5: Probar que 'eliminar primero con 2 nodos' funciona
        /*ls.insertarUltimo(20);
        int valor;

        try {
            valor = ls.eliminarPrimero();
            System.out.println("Eliminado 10: " + valor);
            System.out.println("Nuevo primero es 20: " + ls.primero);
        } catch (Exception ex) {
            System.err.println(ex);
        }*/

        // Prueba 6: Probar que 'eliminar primero con 1 nodos' funciona
        /*int valor;

        try {
            valor = ls.eliminarPrimero();
            System.out.println("Eliminado 10: " + valor);
            System.out.println("Lista debe estar vacia: " + ls.estaVacia());
            System.out.println(ls.primero);
            System.out.println(ls.ultimo);
        } catch (Exception ex) {
            System.err.println(ex);
        }*/

        // Prueba 7: Probar que 'eliminar ultimo con 1 nodos' funciona
        /*try {
            int valor = ls.eliminarUltimo();
            System.out.println("Eliminado 10: " + valor);
            System.out.println("Lista debe estar vacia: " + ls.estaVacia());
            System.out.println("Primero debe ser null=" + ls.primero);
            System.out.println("Ultimo debe ser null=" + ls.ultimo);
        } catch (Exception ex) {
            System.err.println(ex);
        }*/

        // Prueba 8: Probar que 'eliminar ultimo con +1 nodo' funciona
        /*ls.insertarUltimo(20);
        try {
            int valor = ls.eliminarUltimo();
            System.out.println("El valor eliminado es 20=" + valor);
            System.out.println("El nuevo nodo ultimo debe tener 10=" + ls.ultimo);
        } catch (Exception ex) {
            System.err.println(ex);
        }*/

        // Prueba 9: Probar el conteo
        /*System.out.println("Aqui debe haber un nodo: " + ls.getConteoLineal());
        ls.insertarUltimo(20);
        ls.insertarPrimero(30);
        System.out.println("Aqui debo tener 3 nodos: " + ls.getConteoLineal());

        try {
            ls.eliminarUltimo();
            ls.eliminarPrimero();
            System.out.println("Debo tener 1 nodo: " + ls.getConteoLineal());
        } catch (Exception ex) {

        }

        for (int i = 0; i < 100_000_000; i++) {
            ls.insertarPrimero(i);
        }
        System.out.println("Insercion terminada");
        System.out.println("Conteo: " + ls.getConteoLineal());*/

        ls.insertarPrimero(20);
        ls.insertarPrimero(30);
        System.out.println(Arrays.toString(ls.toArray()));
    }

}
