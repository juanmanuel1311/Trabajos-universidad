package modelo;

public class CiudadanoComun extends Persona
{
    public static final double MONTO_BONO = 160000;

    private boolean cabezaHogar;
    private Medicina m;
    private CanastaFamiliar cf;

    public CiudadanoComun(TipoDocumento tipoDocumento, String numeroDocumento, String nombre, String apellido, String direccion, String telefono, int edad, int estrato, String estadoCivil, boolean cabezaHogar, Medicina m, CanastaFamiliar cf){
        super(tipoDocumento, numeroDocumento, nombre, apellido, direccion, telefono, edad, estrato, estadoCivil);
        this.cabezaHogar = cabezaHogar;
        this.m = m;
        this.cf = cf;
        this.bono = new Bono(MONTO_BONO);
    }

    public double getTotalGastado(){
        return m.getMonto() + cf.getMonto();
    }

    public boolean isCabezaHogar(){ return cabezaHogar; }
    public Medicina getMedicina(){ return m; }
    public CanastaFamiliar getCanasta(){ return cf; }
}
