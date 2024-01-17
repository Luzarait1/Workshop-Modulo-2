package Ejercicio1;

import Ejercicio1.Embarcacion;

public class Yate extends Embarcacion {

    private int cantCamarotes;

    public Yate(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, int eslora, int modelo, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora, modelo);
        this.cantCamarotes = cantCamarotes;
    }

    public void comprarYate(int cantCamarotes) {
        if (cantCamarotes > 7) {
            System.out.println("El yate de modelo " + getModelo() + " es lujoso");
        } else {
            System.out.println("El yate de modelo " + getModelo() + " no es lujoso");
        }
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }
}
