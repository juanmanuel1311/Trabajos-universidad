package modelo;

public class Voto
{
    private int ronda;
    private Cardenal votante;
    
    public Voto(int ronda, Cardenal votante){
        this.ronda = ronda;
        this.votante = votante;
    
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie ronda*/
    public int getRonda(){
        return this.ronda;
    }//end method getRonda

    /**SET Method Propertie ronda*/
    public void setRonda(int ronda){
        this.ronda = ronda;
    }//end method setRonda

    /**GET Method Propertie votante*/
    public Cardenal getVotante(){
        return this.votante;
    }//end method getVotante

    /**SET Method Propertie votante*/
    public void setVotante(Cardenal votante){
        this.votante = votante;
    }//end method setVotante

//End GetterSetterExtension Source Code


}//End class