package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public interface Accion {

    public void aplicarAccion(Personaje personaje,  ArrayList<Celda> terreno);
}
