package Ejercicio1;

public class Embarcacion {

    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int anioFabricacion;
    private int eslora;
    private int modelo;


    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, int eslora, int modelo) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.modelo = modelo;
    }

    public String calcularMonto(int precioBase, int valorAdicional, int anioFabricacion) {
        if (anioFabricacion > 2020) {
            valorAdicional = 20000;
            return "El monto total es " + (precioBase + valorAdicional);
        } else {
            return "El monto total es " + (precioBase);
        }
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public int getModelo() {
        return modelo;
    }
}

