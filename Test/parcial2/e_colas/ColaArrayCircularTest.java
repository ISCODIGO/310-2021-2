package parcial2.e_colas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaArrayCircularTest {
    ColaArrayCircular cola;

    @BeforeEach
    void setUp() {
        cola = new ColaArrayCircular(5);
    }

    @Test
    void cuandoNoHayDatos() {
        assertTrue(cola.estaVacia());
        assertFalse(cola.estaLlena());
        assertThrows(Exception.class, cola::getFrente);
    }

    @Test
    void cuandoSeEncola() {
        try {
            cola.encolar(10);
            cola.encolar(20);
            cola.encolar(30);
            cola.encolar(40);
            assertFalse(cola.estaVacia());
            assertFalse(cola.estaLlena());
            assertEquals(10, cola.getFrente());
            cola.encolar(50);
            assertTrue(cola.estaLlena());
        } catch (Exception ex) {}
    }

    @Test
    void cuandoSeDesencola() {
        try {
            cola.encolar(10);
            cola.encolar(20);
            cola.encolar(30);
            cola.encolar(40);
            assertFalse(cola.estaVacia());
            assertFalse(cola.estaLlena());
            assertEquals(10, cola.getFrente());
            cola.encolar(50);
            assertTrue(cola.estaLlena());
        } catch (Exception ex){}
    }
}