package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class MoverALaDerecha implements Accion{

    public void aplicarAccion(Personaje personaje, ArrayList<Celda> terreno){
        /*int PosicionActual = personaje.devolverCeldaActual();
        Celda celdaAux = personaje.pasoCeldaOcupadaPorPersonaje((terreno.get(PosicionActual)));
        terreno.add(PosicionActual, celdaAux);

        personaje.moverALaDerecha();

        PosicionActual = personaje.devolverCeldaActual();
        celdaAux  = personaje.pasoCeldaOcupadaPorPersonaje(terreno.get(PosicionActual));
        terreno.add(PosicionActual, celdaAux);*/

        Posicion posicionActual = personaje.getPosicion();
        personaje.pintarEnPosicionActual(terreno);
        posicionActual.sumarAColumna();
        personaje.pintarEnPosicionActual(terreno);

    }

}
