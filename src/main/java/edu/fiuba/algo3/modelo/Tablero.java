package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Tablero {
    public ArrayList<Accion> accionesElegidas = new ArrayList<Accion>();
    public ArrayList<Celda> terreno = new ArrayList<Celda>();
    public Personaje personaje = new Personaje();

    public Tablero(){
        for(int i = 0; i<25; i++){
            terreno.add (new Celda());
        }
    }

    public void agregarAccion(Accion unaAccion){
        accionesElegidas.add(unaAccion);
    }

    public void procesarMovimiento(){
        for(Accion accion : accionesElegidas)
        {
            accion.aplicarAccion(personaje, terreno);

        }
    }
}
