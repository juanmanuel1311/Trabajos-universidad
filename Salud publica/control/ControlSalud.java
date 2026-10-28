package control;

import modelo.*;
import java.util.ArrayList;

public class ControlSalud
{
    // ArrayList de la clase padre: guarda ciudadanos, profesionales y docentes (polimorfismo)
    private ArrayList<Persona> personas;

    public ControlSalud(){
        personas = new ArrayList<Persona>();
    }

    // Guarda la persona si pasa todas las validaciones; si no, lanza un error con el motivo
    public void guardar(Persona p){
        if (buscar(p.getNumeroDocumento()) != null) {
            throw new IllegalArgumentException("Ya existe una persona con ese documento");
        }
        if (p.getEstrato() < 1 || p.getEstrato() > 6) {
            throw new IllegalArgumentException("El estrato debe estar entre 1 y 6");
        }
        if (p instanceof CiudadanoComun && p.getEstrato() > 2) {
            throw new IllegalArgumentException("El bono de ciudadano solo aplica para estratos 1 y 2");
        }
        if (!p.distribucionValida()) {
            throw new IllegalArgumentException("La suma de los gastos ($" + (long) p.getTotalGastado()
                + ") supera el monto del bono ($" + (long) p.getBono().getMonto() + ")");
        }
        personas.add(p);
    }

    // Devuelve la persona con ese documento, o null si no existe
    public Persona buscar(String documento){
        for (Persona p : personas) {
            if (p.getNumeroDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }
}
