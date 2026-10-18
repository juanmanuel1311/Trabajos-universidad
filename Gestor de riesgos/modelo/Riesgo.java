package modelo;

public class Riesgo
{
    private int codigo;
    private String descripcion;
    private String tipo;
    private int nivelPeligro;
    
    public Riesgo(int codigo, String descripcion, String tipo, int nivelPeligro){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nivelPeligro = nivelPeligro;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie codigo*/
    public int getCodigo(){
        return this.codigo;
    }//end method getCodigo

    /**SET Method Propertie codigo*/
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }//end method setCodigo

    /**GET Method Propertie descripcion*/
    public String getDescripcion(){
        return this.descripcion;
    }//end method getDescripcion

    /**SET Method Propertie descripcion*/
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }//end method setDescripcion

    /**GET Method Propertie tipo*/
    public String getTipo(){
        return this.tipo;
    }//end method getTipo

    /**SET Method Propertie tipo*/
    public void setTipo(String tipo){
        this.tipo = tipo;
    }//end method setTipo

    /**GET Method Propertie nivelPeligro*/
    public int getNivelPeligro(){
        return this.nivelPeligro;
    }//end method getNivelPeligro

    /**SET Method Propertie nivelPeligro*/
    public void setNivelPeligro(int nivelPeligro){
        this.nivelPeligro = nivelPeligro;
    }//end method setNivelPeligro

//End GetterSetterExtension Source Code


}//End class