package modelo;
import modelo.Riesgo;

import java.util.*;


public class GestorRiesgos
{
    private ArrayList<Riesgo> riesgos;
    
    public GestorRiesgos(){
        this.riesgos = new ArrayList<>();
    }
    
    public void agregarRiesgo(Riesgo riesgo){
        this.riesgos.add(riesgo);
    }
    
    public void eliminarRiesgo(int codigo){
        this.riesgos.set(codigo, null);
    }
    
    public Riesgo obtenerRiesgo(int codigo){
        return this.riesgos.get(codigo);
    }
    
    public ArrayList<Riesgo> obtenerRiesgos(){
        return this.riesgos;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie riesgos*/
    public java.util.ArrayList<modelo.Riesgo> getRiesgos(){
        return this.riesgos;
    }//end method getRiesgos

    /**SET Method Propertie riesgos*/
    public void setRiesgos(java.util.ArrayList<modelo.Riesgo> riesgos){
        this.riesgos = riesgos;
    }//end method setRiesgos

//End GetterSetterExtension Source Code


}//End class