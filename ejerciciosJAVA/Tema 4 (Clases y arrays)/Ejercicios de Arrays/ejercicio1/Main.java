package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(Marca.FORD, null, 50);
        Vehiculo v2 = new Vehiculo(Marca.SEAT, "BCD2222");
        Vehiculo v3 = new Vehiculo(Marca.TOYOTA, "BCD3333", 100);

        Vehiculo[] vector = new Vehiculo[3];
        vector[0] = v1;
        vector[1] = v2;
        vector[2] = v3;

        v1.recorrer(100);
        v2.recorrer(50);
        v3.recorrer(100);

        Vehiculo vehiculo;
        for(int i = 0; i < vector.length; i++){
            vehiculo = vector[i];
            System.out.println(vehiculo.mostrarInfo());
        }

        System.out.println("\nNúmero total de vehículos creados: "+Vehiculo.getTotalVehiculos());
    }
}
