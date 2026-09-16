
public class moto extends vehiculos {

    public moto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    } // Se agregó la llave de cierre que faltaba

    @Override
    public double calcularCostoAlquiler(int dias) {
        // $5 fijos al total por el alquiler del casco
        return super.calcularCostoAlquiler(dias) + 5;
    }
}