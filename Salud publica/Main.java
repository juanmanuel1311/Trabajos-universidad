import modelo.*;
import control.ControlSalud;
import vista.JFFormulario;

public class Main
{
    public static void main(String[] args){
        JFFormulario formulario = new JFFormulario();
        cargarDatosDePrueba(formulario.getControl());
    }
    
    // Personas de ejemplo para no tener que registrarlas a mano
    public static void cargarDatosDePrueba(ControlSalud control){
        TipoDocumento cc = TipoDocumento.CEDULA_CIUDADANIA;
        TipoDocumento ce = TipoDocumento.CEDULA_EXTRANGERIA;
        
        // Ciudadanos comunes (bono $160.000, estratos 1 y 2)
        control.guardar(new CiudadanoComun(cc, "1001", "Carlos", "Perez", "Calle 10 #5-20", "3001112233", 35, 1, "Casado", true, new Medicina(60000), new CanastaFamiliar(100000)));
        control.guardar(new CiudadanoComun(ce, "1002", "Maria", "Gomez", "Av 4 #12-08", "3012223344", 28, 2, "Soltera", false, new Medicina(80000), new CanastaFamiliar(50000)));
        
        // Profesionales de la salud (bono $350.000)
        control.guardar(new ProfesionalSalud(cc, "2001", "Laura", "Rojas", "Carrera 7 #3-15", "3023334455", 40, 3, "Casada", "Hospital Central", "Pediatria", new ElementoBioseguridad(200000), new Medicina(150000)));
        control.guardar(new ProfesionalSalud(cc, "2002", "Andres", "Mora", "Calle 22 #9-41", "3034445566", 33, 4, "Soltero", "Clinica Norte", "Cardiologia", new ElementoBioseguridad(100000), new Medicina(200000)));
        
        // Docentes (bono $100.000)
        control.guardar(new Docente(cc, "3001", "Sandra", "Diaz", "Carrera 15 #6-30", "3045556677", 45, 3, "Casada", "Colegio Municipal", NivelEducativo.PREGRADO, new ImplementoTecnologico(70000), new Servicio(30000)));
        control.guardar(new Docente(cc, "3002", "Jorge", "Ramirez", "Calle 8 #2-17", "3056667788", 50, 5, "Divorciado", "Colegio Departamental", NivelEducativo.MAESTRIA, new ImplementoTecnologico(50000), new Servicio(50000)));
    }
}
