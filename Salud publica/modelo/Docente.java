package modelo;

public class Docente extends Persona
{
    public static final double MONTO_BONO = 100000;

    private String institucion;
    private NivelEducativo nivel;
    private ImplementoTecnologico it;
    private Servicio s;

    public Docente(TipoDocumento tipoDocumento, String numeroDocumento, String nombre, String apellido, String direccion, String telefono, int edad, int estrato, String estadoCivil, String institucion, NivelEducativo nivel, ImplementoTecnologico it, Servicio s){
        super(tipoDocumento, numeroDocumento, nombre, apellido, direccion, telefono, edad, estrato, estadoCivil);
        this.institucion = institucion;
        this.nivel = nivel;
        this.it = it;
        this.s = s;
        this.bono = new Bono(MONTO_BONO);
    }

    public double getTotalGastado(){
        return it.getMonto() + s.getMonto();
    }

    public String getInstitucion(){ return institucion; }
    public NivelEducativo getNivel(){ return nivel; }
    public ImplementoTecnologico getImplemento(){ return it; }
    public Servicio getServicio(){ return s; }
}
