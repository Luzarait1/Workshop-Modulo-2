package Ejercicio1;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Juan", "Lopez", 123);
        Embarcacion embarcacion1 = new Embarcacion(capitan1, 100000, 20000, 2023, 15, 3);
        Velero velero1 = new Velero(capitan1, 100000, 20000, 2023, 15, 3, 10);
        Yate yate1 = new Yate(capitan1, 100000, 20000, 2023, 15, 3, 12);

        Capitan capitan2 = new Capitan("Camilo", "Gutierrez", 321);
        Embarcacion embarcacion2 = new Embarcacion(capitan1, 500000, 20000, 2018, 7, 8);
        Velero velero2 = new Velero(capitan1, 500000, 20000, 2018, 7, 8, 2);
        Yate yate2 = new Yate(capitan1, 500000, 20000, 2018, 7, 8, 1);

        capitan1.mostrarInfo();
        String resultado1 = embarcacion1.calcularMonto(100000, 20000, 2023);
        System.out.println(resultado1);
        velero1.evaluarVelero(10);
        yate1.comprarYate(12);
        System.out.println();

        capitan2.mostrarInfo();
        String resultado2 = embarcacion2.calcularMonto(500000, 20000, 2018);
        System.out.println(resultado2);
        velero2.evaluarVelero(2);
        yate2.comprarYate(1);
    }
}