package parcial1.e_colas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaArrayTest {
    ColaArray cola;

    @BeforeEach
    void setUp() {
        cola = new ColaArray(5);
    }

    @Test
    void cuandoNoHayDatos() {
        assertTrue(cola.estaVacia());
        assertFalse(cola.estaLlena());
        assertThrows(Exception.class, cola::getFrente);
    }

    @Test
    void cuandoSeEncola() {
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);
        assertFalse(cola.estaVacia());
        assertFalse(cola.estaLlena());
        assertEquals(10, cola.getFrente());
        cola.encolar(50);
        assertTrue(cola.estaLlena());
    }

    @Test
    void cuandoSeDesencola() {
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        assertFalse(cola.estaVacia());
        assertFalse(cola.estaLlena());
        assertEquals(10, cola.getFrente());
        cola.encolar(50);
        assertTrue(cola.estaLlena());
    }
}