package parcial1.d_pilas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilaListaTest {
    PilaLista<Integer> pila;

    @BeforeEach
    void setUp() {
        pila = new PilaLista<>(5);
    }

    @Test
    void cuandoNoHayDatos() throws Exception {
        pila.desapilar();
        assertThrows(Exception.class, pila::getCima);
        assertTrue(pila.estaVacia());
    }

    @Test
    void cuandoSeApila() throws Exception {
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40); // cima actual

        assertFalse(pila.estaVacia());
        assertEquals(40, pila.getCima());
    }

    @Test
    void cuandoSeDesapila() throws Exception {
        pila.apilar(10);
        pila.apilar(20);
        assertEquals(20, pila.desapilar());
        assertFalse(pila.estaVacia());
        assertEquals(10, pila.desapilar());
        pila.desapilar();
        assertTrue(pila.estaVacia());
    }
}