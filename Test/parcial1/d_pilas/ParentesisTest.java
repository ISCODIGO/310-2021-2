package parcial1.d_pilas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentesisTest {
    @Test
    void probarCadenaValida(){
        assertTrue(Parentesis.estaEquilibrado("()()()"));
        assertTrue(Parentesis.estaEquilibrado("((()))"));
        assertTrue(Parentesis.estaEquilibrado("()((()))"));
    }

    @Test
    void probarCadenaInvalida() {
        assertFalse(Parentesis.estaEquilibrado(")("));
        assertFalse(Parentesis.estaEquilibrado("(()))"));
        assertFalse(Parentesis.estaEquilibrado("("));
    }
}