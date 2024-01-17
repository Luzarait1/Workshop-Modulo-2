package Ejercicio1;

import Ejercicio1.Embarcacion;

public class Velero extends Embarcacion {

    private int cantMastiles;

    public Velero(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, int eslora, int modelo, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora, modelo);
        this.cantMastiles = cantMastiles;
    }

    public void evaluarVelero(int cantMastiles) {
        if (cantMastiles > 4) {
            System.out.println("El velero de modelo " + this.getModelo() + " es grande");
        } else {
            System.out.println("El velero de modelo " + this.getModelo() + " es pequeño");
        }
    }

    public int getCantMastiles() {
        return cantMastiles;
    }
}
