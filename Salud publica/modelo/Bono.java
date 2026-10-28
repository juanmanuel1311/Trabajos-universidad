package modelo;

public class Bono
{
    private double monto;

    public Bono(double monto){
        this.monto = monto;
    }

    public double getMonto(){
        return monto;
    }

    // Devuelve true si lo gastado no supera el monto del bono
    public boolean alcanza(double gastado){
        return gastado <= monto;
    }
}
