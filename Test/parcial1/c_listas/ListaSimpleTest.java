package parcial1.c_listas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaSimpleTest {
    ListaSimple ls;

    @BeforeEach
    void setUp() {
        ls = new ListaSimple(10);
    }

    @Test
    void testValoresIniciales() {
        assertFalse(ls.estaVacia());
        assertEquals(10, ls.primero.getDato());
        assertEquals(10, ls.ultimo.getDato());
    }

    @Test
    void testConteo() throws Exception {
        ls.insertarUltimo(20);
        ls.insertarPrimero(30);
        assertEquals(3, ls.getConteoLineal());
        assertEquals(3, ls.getConteoConstante());

        ls.eliminarUltimo();
        ls.eliminarPrimero();
        assertEquals(1, ls.getConteoLineal());
        assertEquals(1, ls.getConteoConstante());
    }

    @Test
    void testBuscar() {
        ls.insertarPrimero(20);
        ls.insertarPrimero(30);
        ls.insertarPrimero(40);
        assertNotNull(ls.buscar(30));
        assertNull(ls.buscar(100));
    }
}