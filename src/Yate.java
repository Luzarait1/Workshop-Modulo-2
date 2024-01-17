public class Yate extends Embarcacion{

    private int cantCamarotes;

    public Yate(Capitan capitan, int precioBase, int valorAdicional, int anioFabricacion, int eslora, int modelo, int cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora, modelo);
        this.cantCamarotes = cantCamarotes;
    }

    public String comprarYate(int cantCamarotes) {
        if (cantCamarotes > 7) {
            return "El yate es lujoso";
        } else {
            return "El yate no es lujoso";
        }
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }
}
