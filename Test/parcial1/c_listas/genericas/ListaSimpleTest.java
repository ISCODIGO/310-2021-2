package parcial1.c_listas.genericas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaSimpleTest {
    ListaSimple<String> ls;

    @BeforeEach
    void setUp() {
        ls = new ListaSimple("A");
    }

    @Test
    void testValoresIniciales() {
        assertFalse(ls.estaVacia());
        assertEquals("A", ls.primero.getDato());
        assertEquals("A", ls.ultimo.getDato());
    }

    @Test
    void testConteo() throws Exception {
        ls.insertarUltimo("B");
        ls.insertarPrimero("C");
        assertEquals(3, ls.getConteo());

        ls.eliminarUltimo();
        ls.eliminarPrimero();
        assertEquals(1, ls.getConteo());
    }

    @Test
    void testBuscar() {
        ls.insertarPrimero("B");
        ls.insertarPrimero("C");
        ls.insertarPrimero("D");
        assertNotNull(ls.buscar("D"));
        assertNull(ls.buscar("Z"));
    }
}