package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //Instancias de la clase Parqueadero
        Parqueadero parqueadero1 = new Parqueadero(3, 3, 5.0);

        //Instancias de la clase Carro
        Carro carro1 = new Carro("FJS773", "Ford", "Modelo 1");
        Carro carro2 = new Carro("MBO921", "Hyundai", "Modelo 5");
        Carro carro3 = new Carro("ADE534", "Ford", "Modelo 2");
        Carro carro4 = new Carro("LCX867", "Chevrolet", "Modelo 6");
        Carro carro5 = new Carro("HJO436", "Nissan", "Modelo 3");
        Carro carro6 = new Carro("JOT598", "Mercedes", "Modelo 2");
        Carro carro7 = new Carro("KER615", "Honda", "Modelo 3");

        //METODO parquearCarro()
        //Parqueados exitosos
        System.out.println("Parqueados exitosos");
        System.out.println("Se parqueo el carro con placa " + carro3.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro3, 2, 0));
        System.out.println("Se parqueo el carro con placa " + carro4.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro4, 0, 1));
        System.out.println("Se parqueo el carro con placa " + carro1.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro1, 1, 2));
        System.out.println("Se parqueo el carro con placa " + carro7.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro7, 0, 0));
        System.out.println("Se parqueo el carro con placa " + carro5.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro5, 2, 2));
        System.out.println();

        //Parqueado no exitosos porque el paqueadero esta ocupado
        System.out.println("Parqueados no exitosos porque el espacio esta ocupado");
        System.out.println("Se parqueo el carro con placa " + carro6.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro6, 1, 2));
        System.out.println("Se parqueo el carro con placa " + carro2.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro2, 2, 2));
        System.out.println();

        //Parqueado no exitosos porque el paqueadero esta fuera de los limites de la matriz
        System.out.println("Parqueados no exitosos porque no esta dentro del limite");
        System.out.println("Se parqueo el carro con placa " + carro6.getPlaca() + " de manera exitosa: " + parqueadero1.parquearCarro(carro6, 0, 4));
        System.out.println();

        //METODO cobroPorTiempo()
        System.out.println("Metodo Cobro por Tiempo");
        System.out.println("La tarifa a pagar del carro " + carro1.getPlaca() + " es de: $" + parqueadero1.cobrarPorTiempo(carro1, 4));
        System.out.println("La tarifa a pagar del carro " + carro3.getPlaca() + " es de: $" + parqueadero1.cobrarPorTiempo(carro3, 1));
        System.out.println("La tarifa a pagar del carro " + carro5.getPlaca() + " es de: $" + parqueadero1.cobrarPorTiempo(carro5, 7));
        System.out.println("La tarifa a pagar del carro " + carro7.getPlaca() + " es de: $" + parqueadero1.cobrarPorTiempo(carro7, 2));
        System.out.println("La tarifa a pagar del carro " + carro6.getPlaca() + " es de: $" + parqueadero1.cobrarPorTiempo(carro6, 0));
        System.out.println("La tarifa a pagar del carro " + carro4.getPlaca() + " es de: $" + parqueadero1.cobrarPorTiempo(carro4, 4));
        System.out.println();

        //METODO mostrarEstadoParqueadero
        System.out.println("Metodo Mostrar Estado Parqueadero");
        System.out.println("Matriz del parqueadero:");
        parqueadero1.mostrarEstadoParqueadero();
    }
}
