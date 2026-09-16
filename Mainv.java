import java.util.ArrayList;
import java.util.List;

public class Mainv {
    public static void main(String[] args) {
        List<vehiculos> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new carro("Ford", "Fiesta", 50.0));
        listaVehiculos.add(new moto("AKT", "NKD", 30.0));

        int dias = 5;

        for (vehiculos v : listaVehiculos) {
            double costoTotal = v.calcularCostoAlquiler(dias);
            System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo() +
                               " | Costo total por " + dias + " dias: $" + costoTotal);
        }
    }
}

