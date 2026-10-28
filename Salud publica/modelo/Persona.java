package modelo;

public abstract class Persona
{
    protected TipoDocumento tipoDocumento;
    protected String numeroDocumento;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String telefono;
    protected int edad;
    protected int estrato;
    protected String estadoCivil;
    protected Bono bono;

    public Persona(TipoDocumento tipoDocumento, String numeroDocumento, String nombre, String apellido, String direccion, String telefono, int edad, int estrato, String estadoCivil){
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.estrato = estrato;
        this.estadoCivil = estadoCivil;
    }

    // Cada tipo de persona calcula lo que gastó de su bono
    public abstract double getTotalGastado();

    // Validación de la distribución: lo gastado no puede superar el bono
    public boolean distribucionValida(){
        return bono.alcanza(getTotalGastado());
    }

    public TipoDocumento getTipoDocumento(){ return tipoDocumento; }
    public String getNumeroDocumento(){ return numeroDocumento; }
    public String getNombre(){ return nombre; }
    public String getApellido(){ return apellido; }
    public String getDireccion(){ return direccion; }
    public String getTelefono(){ return telefono; }
    public int getEdad(){ return edad; }
    public int getEstrato(){ return estrato; }
    public String getEstadoCivil(){ return estadoCivil; }
    public Bono getBono(){ return bono; }
}
