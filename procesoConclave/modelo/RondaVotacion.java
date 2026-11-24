package modelo;
import java.util.*;

public class RondaVotacion
{
    private String jornada;
    private int numeroRonda;
    private int diaRonda;
    private ArrayList<Voto> votos;
    
    public RondaVotacion(String jornada, int numeroRonda, int diaRonda){
        this.jornada = jornada;
        this.numeroRonda = numeroRonda;
        this.diaRonda = diaRonda;
        this.votos = new ArrayList<Voto>();
    }
//Start GetterSetterExtension Source Code

    /**GET Method Propertie jornada*/
    public String getJornada(){
        return this.jornada;
    }//end method getJornada

    /**SET Method Propertie jornada*/
    public void setJornada(String jornada){
        this.jornada = jornada;
    }//end method setJornada

    /**GET Method Propertie numeroRonda*/
    public int getNumeroRonda(){
        return this.numeroRonda;
    }//end method getNumeroRonda

    /**SET Method Propertie numeroRonda*/
    public void setNumeroRonda(int numeroRonda){
        this.numeroRonda = numeroRonda;
    }//end method setNumeroRonda

    /**GET Method Propertie diaRonda*/
    public int getDiaRonda(){
        return this.diaRonda;
    }//end method getDiaRonda

    /**SET Method Propertie diaRonda*/
    public void setDiaRonda(int diaRonda){
        this.diaRonda = diaRonda;
    }//end method setDiaRonda

    /**GET Method Propertie votos*/
    public java.util.ArrayList<modelo.Voto> getVotos(){
        return this.votos;
    }//end method getVotos

    /**SET Method Propertie votos*/
    public void setVotos(java.util.ArrayList<modelo.Voto> votos){
        this.votos = votos;
    }//end method setVotos

//End GetterSetterExtension Source Code


}//End class