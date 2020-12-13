package edu.fiuba.algo3.modelo;


import java.util.ArrayList;

public class Personaje {

    public Pincel pincel = new Pincel();
    public Posicion posicion = new Posicion();

    /*public int devolverCeldaActual(){
        return (posicion.devolverPosicion());
    }
    public Celda pasoCeldaOcupadaPorPersonaje(Celda celda){
        return (pincel.pasoPincelSobre(celda));
    }*/

    public Posicion getPosicion() {
        return posicion;
    }

    public void pintarEnPosicionActual(ArrayList<Celda> terreno) {
        this.pincel.pintar(terreno.get(this.posicion.devolverPosicion()));
    }
}
