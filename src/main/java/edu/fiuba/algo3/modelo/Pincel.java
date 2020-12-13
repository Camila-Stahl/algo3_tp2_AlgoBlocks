package edu.fiuba.algo3.modelo;

public class Pincel {
    private PosicionPincel posicionPincel = new PincelAbajo();

    public void pintar(Celda celdaActual) {
        this.posicionPincel.pintar(celdaActual);
    }
}
