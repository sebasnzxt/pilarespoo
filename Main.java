import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
           List<vehiculos> vehiculos = new ArrayList<>();
           
           
           vehiculos.add(new carro("ford", "fiesta", (int) 50.0));
           vehiculos.add(new moto("akt", "nkd", (int) 30.0));
           
           
           int dias = 5;

       
        for (vehiculos v : vehiculos) {
            double costoTotal = v.calcularCostoAlquiler(dias);
            System.out.println("Vehículo: " + v.getMarca() + " " + v.getModelo() +
                               " | Costo total por " + dias + " días: $" + costoTotal);
        }
    }
}
    
    

