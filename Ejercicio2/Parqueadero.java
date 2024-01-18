package Ejercicio2;

public class Parqueadero {
    private Carro[][] matriz;
    private double tarifaHora;

    public Parqueadero(int filas, int columnas, double tarifaHora) {
        this.matriz = new Carro[filas][columnas];
        this.tarifaHora = tarifaHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            // Fuera de los límites de la matriz
            return false;
        }

        if (matriz[fila][columna] == null) {
            matriz[fila][columna] = carro;
            return true;
        } else {
            // Espacio ocupado
            return false;
        }
    }

    public double cobrarPorTiempo(Carro carro, int hora) {
        return hora * tarifaHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != null) {
                    System.out.print("X "); // Espacio ocupado
                } else {
                    System.out.print("  "); // Espacio vacío
                }
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }
    }

    public Carro[][] getMatriz() {
        return matriz;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
}
