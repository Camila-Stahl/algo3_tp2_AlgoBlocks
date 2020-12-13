package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;


public class TableroTest {
    @Test
    public void prueba(){
        Tablero tablero = new Tablero();
        Posicion posicion = new Posicion();
        posicion.sumarEnX(2);
        tablero.dibujarPosicion(posicion);

    }
}