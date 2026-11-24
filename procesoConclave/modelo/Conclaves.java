package modelo;


import java.util.*;

public class Conclaves
{
    private ArrayList<Cardenal> cardenales;
    private ArrayList<RondaVotacion> rondaVotacion;
    
    public Conclaves(){
        this.cardenales = new ArrayList<Cardenal>();
        this.rondaVotacion = new ArrayList<RondaVotacion>();
    }
    
    public void agregarCardenal(Cardenal cardenal){
        cardenales.add(cardenal);
    }
    
    public void removerCardenal(Cardenal cardenal){
        cardenales.remove(cardenal);
    }
    
    public void addRondaVotacion(RondaVotacion ronda){
        rondaVotacion.add(ronda);
    }
    
    public void removerRondaVotacion(RondaVotacion ronda){
        rondaVotacion.remove(ronda);
    }

    public ArrayList<Cardenal> obtenerElectores(){
        ArrayList<Cardenal> electores = new ArrayList<Cardenal>();
        for(Cardenal c : cardenales){
            if(c.esElegible()) electores.add(c);
        }
        return electores;
    }

    public int votosNecesarios(){
        return (int) Math.ceil(obtenerElectores().size() * 2.0 / 3);
    }

    public RondaVotacion nuevaRonda(){
        
        int numero = rondaVotacion.size() + 1;
        int dia = (numero - 1) / 4 + 1;
        String jornada = "Mañana";
        if((numero - 1) % 4 >= 2) jornada = "Tarde";
        RondaVotacion ronda = new RondaVotacion(jornada, numero, dia);
        addRondaVotacion(ronda);
        return ronda;
    }

    public boolean rondaCompleta(RondaVotacion ronda){
        return ronda.getVotos().size() >= obtenerElectores().size();
    }

    public boolean votar(RondaVotacion ronda, Cardenal candidato){
        if(rondaCompleta(ronda) || !cardenales.contains(candidato)) return false;
        ronda.getVotos().add(new Voto(ronda.getNumeroRonda(), candidato));
        return true;
    }

    public int contarVotos(RondaVotacion ronda, Cardenal candidato){
        int total = 0;
        for(Voto v : ronda.getVotos()){
            if(v.getVotante().equals(candidato)) total++;
        }
        return total;
    }

    public Cardenal obtenerPapa(RondaVotacion ronda){
        if(!rondaCompleta(ronda) || obtenerElectores().isEmpty()) return null;
        for(Cardenal c : cardenales){
            if(contarVotos(ronda, c) >= votosNecesarios()) return c;
        }
        return null;
    }

    public void aleatorizar(RondaVotacion ronda){
        Random random = new Random();
        while(!rondaCompleta(ronda)){
            int posicion = random.nextInt(cardenales.size());
            votar(ronda, cardenales.get(posicion));
        }
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie cardenales*/
    public java.util.ArrayList<modelo.Cardenal> getCardenales(){
        return this.cardenales;
    }//end method getCardenales

    /**SET Method Propertie cardenales*/
    public void setCardenales(java.util.ArrayList<modelo.Cardenal> cardenales){
        this.cardenales = cardenales;
    }//end method setCardenales

    /**GET Method Propertie rondaVotacion*/
    public java.util.ArrayList<modelo.RondaVotacion> getRondaVotacion(){
        return this.rondaVotacion;
    }//end method getRondaVotacion

    /**SET Method Propertie rondaVotacion*/
    public void setRondaVotacion(java.util.ArrayList<modelo.RondaVotacion> rondaVotacion){
        this.rondaVotacion = rondaVotacion;
    }//end method setRondaVotacion

//End GetterSetterExtension Source Code


}//End class