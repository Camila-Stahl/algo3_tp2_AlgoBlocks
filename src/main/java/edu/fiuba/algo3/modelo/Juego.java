package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    List<Accion> listaAcciones = new ArrayList<>();
    Personaje personaje = new Personaje();
    public void moverDerecha() {
        MoverALaDerecha accion = new MoverALaDerecha();
        listaAcciones.add(accion);
    }
    public void ejecutar() {
        personaje.realizarAcciones(listaAcciones);
    }
}
