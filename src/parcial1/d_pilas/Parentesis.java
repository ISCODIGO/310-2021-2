package parcial1.d_pilas;

public class Parentesis {

    public static boolean estaEquilibrado(String cadena) {
        // No esta equilibrado si se cumple 1 de las sig. condiciones
        // 1. Al final la pila no esta vacia
        // 2. Si ocurre al momento de desapilar una exception
        PilaArray<Character> pila = new PilaArray<>(cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(') {
                pila.apilar(caracter);
            } else if (caracter == ')') {
                try {
                    pila.desapilar();
                } catch (Exception ex) {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }
}
