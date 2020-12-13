package edu.fiuba.algo3.modelo;

public class Tablero {
    int[][] matriz;

    public Tablero() {
        matriz = crearMatriz();
    }

    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void dibujarPosicion(Posicion posicion) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == posicion.obtenerValorEnY() && j == posicion.obtenerValorEnX()) {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    public int[][] crearMatriz() {
        int[][] nuevaMatriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nuevaMatriz[i][j] = 0;

            }
        }
        return nuevaMatriz;
    }
}
