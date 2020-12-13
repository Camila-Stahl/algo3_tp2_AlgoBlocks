package edu.fiuba.algo3.modelo;

import java.util.List;

public class Personaje {

    Posicion posicion = new Posicion();
    Tablero tablero = new Tablero();
    public void realizarAcciones(List<Accion> listaAcciones) {
        for (Accion accion : listaAcciones) {
            accion.realizar(posicion);
            tablero.dibujarPosicion(posicion);
            tablero.imprimir();
        }

    }

}
