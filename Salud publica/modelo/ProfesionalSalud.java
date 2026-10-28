package modelo;

public class ProfesionalSalud extends Persona
{
    public static final double MONTO_BONO = 350000;

    private String institucion;
    private String especialidad;
    private ElementoBioseguridad eb;
    private Medicina m;

    public ProfesionalSalud(TipoDocumento tipoDocumento, String numeroDocumento, String nombre, String apellido, String direccion, String telefono, int edad, int estrato, String estadoCivil, String institucion, String especialidad, ElementoBioseguridad eb, Medicina m){
        super(tipoDocumento, numeroDocumento, nombre, apellido, direccion, telefono, edad, estrato, estadoCivil);
        this.institucion = institucion;
        this.especialidad = especialidad;
        this.eb = eb;
        this.m = m;
        this.bono = new Bono(MONTO_BONO);
    }

    public double getTotalGastado(){
        return eb.getMonto() + m.getMonto();
    }

    public String getInstitucion(){ return institucion; }
    public String getEspecialidad(){ return especialidad; }
    public ElementoBioseguridad getElementoBioseguridad(){ return eb; }
    public Medicina getMedicina(){ return m; }
}
