public class Velero extends Embarcacion{

    private int cantMastiles;

    public Velero(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, int eslora, int modelo, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora, modelo);
        this.cantMastiles = cantMastiles;
    }

    public String evaluarVelero(int cantMastiles) {
        if (cantMastiles > 4) {
            return "El velero es grande";
        } else {
            return "El velero es pequeño";
        }
    }

    public int getCantMastiles() {
        return cantMastiles;
    }
}
