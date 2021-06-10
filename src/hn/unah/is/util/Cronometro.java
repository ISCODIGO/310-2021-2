package hn.unah.is.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jeavila
 */
public class Cronometro {
    private LocalDateTime instanteInicio;
    private LocalDateTime instanteFinal;
    private boolean terminado;

    public Cronometro() {
        this.iniciar();
    }

    /**
     * Inicio el cronometro.
     */
    public void iniciar() {
        terminado = false;
        instanteInicio = LocalDateTime.now();
    }

    /**
     * Finaliza la ejecucion del cronometro.
     */
    public void detener() {
        terminado = true;
        instanteFinal = LocalDateTime.now();
    }

    /**
     * Funcion que devuelve los milisegundos transcurridos entre el
     * {@code start()} y el {@code stop()} del cronometro.
     * @return Cantidad de milisegundos
     */
    public long getMilisegundos() {
        if (terminado) {
            return ChronoUnit.MILLIS.between(instanteInicio, instanteFinal);
        }
        return 0;
    }

    public long getNanosegundos() {
        if (terminado) {
            return ChronoUnit.NANOS.between(instanteInicio, instanteFinal);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cronometro{" + this.getMilisegundos() + " ms}";
    }
}