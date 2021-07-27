package parcial1.d_pilas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilaArrayTest {
    PilaArray<Integer> pila;

    @BeforeEach
    void setUp() {
        pila = new PilaArray<>(5);
    }

    @Test
    void cuandoNoHayDatos() {
        assertThrows(Exception.class, pila::getCima);
        assertTrue(pila.estaVacia());
        assertFalse(pila.estaLlena());
    }

    @Test
    void cuandoSeApila() throws Exception {
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40); // cima actual

        assertFalse(pila.estaVacia());
        assertEquals(40, pila.getCima());
        assertFalse(pila.estaLlena());

        pila.apilar(50); // nueva cima
        assertEquals(50, pila.getCima());
        assertTrue(pila.estaLlena());
    }

    @Test
    void cuandoSeDesapila() throws Exception {
        pila.apilar(10);
        pila.apilar(20);
        assertEquals(20, pila.desapilar());
        assertFalse(pila.estaVacia());
        assertEquals(10, pila.desapilar());
        assertTrue(pila.estaVacia());
    }
}