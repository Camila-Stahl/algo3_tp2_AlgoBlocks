package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTest {
    @Test
    public void prueba() {
        Juego juego = new Juego();
        juego.moverDerecha();
        juego.moverDerecha();
        juego.ejecutar();
    }
}