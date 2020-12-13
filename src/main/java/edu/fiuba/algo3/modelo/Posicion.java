package edu.fiuba.algo3.modelo;

public class Posicion {
    public int fila = 1;
    public int columna = 1;

    public int devolverPosicion(){
        return (fila-1)*5 + columna;
    }

    public void sumarAColumna(){
        columna++;
    }
}
