package modelo;


/**
 * Write a description of class Cardenal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cardenal
{
    private String paisRepresentado;
    private TipoCardenal tipoCardenal;
    
    private String cedula;
    private String nombre;
    private int edad;
    
    public Cardenal(){}
    
    public Cardenal(String pais, TipoCardenal tipo, String cedula, String nombre, int edad){
        this.paisRepresentado = pais;
        this.tipoCardenal = tipo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public boolean esElegible(){
        if(this.edad<80){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return nombre + " (" + paisRepresentado + ", " + edad + " años)";
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie paisRepresentado*/
    public String getPaisRepresentado(){
        return this.paisRepresentado;
    }//end method getPaisRepresentado

    /**SET Method Propertie paisRepresentado*/
    public void setPaisRepresentado(String paisRepresentado){
        this.paisRepresentado = paisRepresentado;
    }//end method setPaisRepresentado

    /**GET Method Propertie tipoCardenal*/
    public TipoCardenal getTipoCardenal(){
        return this.tipoCardenal;
    }//end method getTipoCardenal

    /**SET Method Propertie tipoCardenal*/
    public void setTipoCardenal(TipoCardenal tipoCardenal){
        this.tipoCardenal = tipoCardenal;
    }//end method setTipoCardenal

    /**GET Method Propertie cedula*/
    public String getCedula(){
        return this.cedula;
    }//end method getCedula

    /**SET Method Propertie cedula*/
    public void setCedula(String cedula){
        this.cedula = cedula;
    }//end method setCedula

    /**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie edad*/
    public int getEdad(){
        return this.edad;
    }//end method getEdad

    /**SET Method Propertie edad*/
    public void setEdad(int edad){
        this.edad = edad;
    }//end method setEdad

//End GetterSetterExtension Source Code


}//End class