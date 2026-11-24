package modelo;

import java.util.ArrayList;

public class GestionVehiculos {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public GestionVehiculos(){}

    public int cantidad(){ 
        return vehiculos.size(); 
    }

    public Vehiculo obtener(int posicion){ 
        return vehiculos.get(posicion); 
    }

    public int buscar(String texto, boolean porMarca){
        texto = texto.trim();

        if(texto.isEmpty()) return -1;

        for(int i = 0; i < vehiculos.size(); i++){
            Vehiculo v = vehiculos.get(i);
            String dato = v.getLinea();
            if(porMarca){
                dato = v.getMarca();
            }
            if(dato.toLowerCase().contains(texto.toLowerCase())){
                return i;
            }
        }
        
        return -1;
    }

    public int masCaro(){
        int mayor = 0;

        for(int i = 1; i < vehiculos.size(); i++){
            if(obtener(i).getValor() > obtener(mayor).getValor()) 
                mayor = i;
        }

        return mayor;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie vehiculos*/
    public java.util.ArrayList<modelo.Vehiculo> getVehiculos(){
        return this.vehiculos;
    }//end method getVehiculos

    /**SET Method Propertie vehiculos*/
    public void setVehiculos(java.util.ArrayList<modelo.Vehiculo> vehiculos){
        this.vehiculos = vehiculos;
    }//end method setVehiculos

//End GetterSetterExtension Source Code


}//End class