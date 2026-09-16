
public class moto extends vehiculos {

    public moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    } 

    @Override
    public double calcularCostoAlquiler(int dias) {
        
        return super.calcularCostoAlquiler(dias) + 5;
    }
}