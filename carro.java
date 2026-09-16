public class carro extends vehiculos {

    public carro(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
      
        return (getTarifaBase() + 10) * dias;
    }
}
