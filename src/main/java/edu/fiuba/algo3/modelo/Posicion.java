package edu.fiuba.algo3.modelo;

public class Posicion {
    int x = 0;
    int y = 0;
    public void sumarEnX(int cantidad){
        x += cantidad;
    }

    public int obtenerValorEnY() {
        return y;
    }
    public int obtenerValorEnX() {
        return x;
    }
}
