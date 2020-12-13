package edu.fiuba.algo3.modelo;

public class MoverALaDerecha implements Accion{
    public void realizar(Posicion posicion){
        posicion.sumarEnX(1);
    }
}
