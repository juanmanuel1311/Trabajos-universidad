import vista.*;
import modelo.*;
import modelo.GestionVehiculos;
import controlador.Controlador;

public class Main {
    public static void main(String[] args){
        JFormulario vista = new JFormulario();
        GestionVehiculos modelo = new GestionVehiculos();
        
        modelo.getVehiculos().add(new Vehiculo("Ford", "Taurus", 2016, 136340000));
        modelo.getVehiculos().add(new Vehiculo("Chevrolet", "Spark", 2018, 28000000));
        modelo.getVehiculos().add(new Vehiculo("Renault", "Logan", 2020, 45000000));
        modelo.getVehiculos().add(new Vehiculo("Toyota", "Corolla", 2023, 110000000));
        
        
        Controlador controlador = new Controlador(vista, modelo);
        vista.setVisible(true);
        
        
    }
}
