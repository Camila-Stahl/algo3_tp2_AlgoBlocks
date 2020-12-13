package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MessageTest {
    @Test
    public void main() {
        Tablero tablero = new Tablero();
        tablero.agregarAccion(new MoverALaDerecha());
        tablero.procesarMovimiento();
        assertTrue(tablero.terreno.get(1).modalidad instanceof CeldaPintada);
        assertTrue(tablero.terreno.get(2).modalidad instanceof CeldaPintada);
    }
}