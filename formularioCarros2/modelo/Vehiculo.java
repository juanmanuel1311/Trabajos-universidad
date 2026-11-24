package modelo;

public class Vehiculo {
    private String marca, linea;
    private int modelo;
    private double valor;

    public Vehiculo(String marca, String linea, int modelo, double valor){
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.valor = valor;
    }
    public String getMarca(){ return marca; }
    public String getLinea(){ return linea; }
    public int getModelo(){ return modelo; }
    public double getValor(){ return valor; }

    public double calcularImpuesto(boolean pronto, boolean traslado, boolean servicio){
        double impuesto = valor * 0.025;
        double descuento = 0;
        if(pronto) descuento += 0.10;
        if(traslado) descuento += 0.15;
        if(servicio) descuento += 0.05;
        return impuesto * (1 - descuento);
    }
}
