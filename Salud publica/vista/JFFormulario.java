package vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import modelo.*;
import control.ControlSalud;

public class JFFormulario extends JFrame implements ActionListener
{
    private ControlSalud control;

    // Panel Izquierdo
    private JTextField txtDocumento, txtNombre, txtApellido, txtDireccion, txtTelefono, txtEdad, txtEstrato, txtEstadoCivil, txtInstitucion, txtEspecialidad;
    private JCheckBox boxCabezaHogar;
    private JComboBox tipoDocumento, tipoPersona, nivelEducativo;
    // Panel derecho
    private JTextField 
    txtElemBioseguridad, 
    txtMedicinaProf, 
    txtImplementoTec, 
    txtServicio, 
    txtCanasta, 
    txtMedicina;
    private JButton btnGuardar, btnLimpiar, btnBuscar;
    
    public JFFormulario(){
        control = new ControlSalud();
        setResizable(false);
        setLayout(new GridLayout(1, 2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(panelIzquierdo());
        add(panelDerecho());
        pack();
        setSize(1000, getHeight());
        setVisible(true);
    }
    
    public JPanel panelIzquierdo(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(15,2));
        panel1.setBorder(BorderFactory.createTitledBorder("Registro datos basico"));
        
        panel1.add(new JLabel("Tipo de documento"));
        String[] tiposDocumentos = { "","Cedula de ciudadania", "Cedula de extrangeria"};
        tipoDocumento = new JComboBox(tiposDocumentos);
        panel1.add(tipoDocumento);
        
        panel1.add(new JLabel("Documento"));
        txtDocumento = new JTextField();
        panel1.add(txtDocumento);
        
        panel1.add(new JLabel("Nombre"));
        txtNombre = new JTextField();
        panel1.add(txtNombre);
        
        panel1.add(new JLabel("Apellido"));
        txtApellido = new JTextField();
        panel1.add(txtApellido);
        
        panel1.add(new JLabel("Direccion"));
        txtDireccion = new JTextField();
        panel1.add(txtDireccion);
        
        panel1.add(new JLabel("Telefono"));
        txtTelefono = new JTextField();
        panel1.add(txtTelefono);
        
        panel1.add(new JLabel("Edad"));
        txtEdad = new JTextField();
        panel1.add(txtEdad);
        
        panel1.add(new JLabel("Estrato"));
        txtEstrato = new JTextField();
        panel1.add(txtEstrato);
        
        panel1.add(new JLabel("Estado civil"));
        txtEstadoCivil = new JTextField();
        panel1.add(txtEstadoCivil);
        
        //Tipo
        panel1.add(new JLabel("Tipo"));
        String[] tiposPersona = {"", "Ciudadano comun", "Profesional de la salud", "Docente"};
        tipoPersona = new JComboBox(tiposPersona);
        tipoPersona.addActionListener(this);
        panel1.add(tipoPersona);
        
        panel1.add(new JLabel("Institucion"));
        txtInstitucion = new JTextField();
        txtInstitucion.setEditable(false);
        panel1.add(txtInstitucion);
        
        panel1.add(new JLabel("Especialidad"));
        txtEspecialidad = new JTextField();
        txtEspecialidad.setEditable(false);
        panel1.add(txtEspecialidad);
        
        //Nivel
        panel1.add(new JLabel("Nivel"));
        String[] nivelesEducativo = {"", "Tecnico", "Tecnologo", "Pregrado", "Maestria", "Doctorado"};
        nivelEducativo = new JComboBox(nivelesEducativo);
        nivelEducativo.setEnabled(false);
        panel1.add(nivelEducativo);
        
        boxCabezaHogar = new JCheckBox("Cabeza de hogar");
        boxCabezaHogar.setEnabled(false);
        panel1.add(boxCabezaHogar);
        return panel1;
    }
    
    public JPanel panelDerecho(){
        JPanel panel1 = new JPanel();
        JPanel pBotones, pBonoSalud, pBonoDocente, pBonoPersona;
        panel1.setLayout(new GridLayout(4,1));
        
        //Botones
        pBotones = new JPanel();
        pBotones.setBorder(BorderFactory.createTitledBorder("Panel botones"));
        pBotones.setLayout(new GridLayout(1,3));
        btnGuardar = new JButton("Guardar");
        btnLimpiar = new JButton("Limpiar");
        btnBuscar = new JButton("Buscar");
        btnGuardar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnBuscar.addActionListener(this);
        
        pBotones.add(btnGuardar);
        pBotones.add(btnLimpiar);
        pBotones.add(btnBuscar);
        
        // Distribucion bono prof salud
        pBonoSalud = new JPanel();
        pBonoSalud.setBorder(BorderFactory.createTitledBorder("Distribucion bono Prof Salud"));
        pBonoSalud.setLayout(new GridLayout(2,2));
        
        pBonoSalud.add(new JLabel("Elemento bioseguridad"));
        txtElemBioseguridad = new JTextField();
        txtElemBioseguridad.setEditable(false);
        pBonoSalud.add(txtElemBioseguridad);
        
        pBonoSalud.add(new JLabel("Medicina"));
        txtMedicinaProf = new JTextField();
        txtMedicinaProf.setEditable(false);
        pBonoSalud.add(txtMedicinaProf);
        
        // Distribucion bono docente
        pBonoDocente = new JPanel();
        pBonoDocente.setBorder(BorderFactory.createTitledBorder("Distribucion bono Docente"));
        pBonoDocente.setLayout(new GridLayout(2,2));
        
        pBonoDocente.add(new JLabel("Implementos tecnológicos"));
        txtImplementoTec = new JTextField();
        txtImplementoTec.setEditable(false);
        pBonoDocente.add(txtImplementoTec);
        
        pBonoDocente.add(new JLabel("Servicio"));
        txtServicio = new JTextField();
        txtServicio.setEditable(false);
        pBonoDocente.add(txtServicio);
        
        // Distribucion bono persona
        pBonoPersona = new JPanel();
        pBonoPersona.setBorder(BorderFactory.createTitledBorder("Distribucion bono Persona independiente"));
        pBonoPersona.setLayout(new GridLayout(2,2));
        
        pBonoPersona.add(new JLabel("Canasta familiar"));
        txtCanasta = new JTextField();
        txtCanasta.setEditable(false);
        pBonoPersona.add(txtCanasta);
        
        pBonoPersona.add(new JLabel("Medicina"));
        txtMedicina = new JTextField();
        txtMedicina.setEditable(false);
        pBonoPersona.add(txtMedicina);
        
        panel1.add(pBotones);
        panel1.add(pBonoSalud);
        panel1.add(pBonoDocente);
        panel1.add(pBonoPersona);
        
        return panel1;
    }
    
    public ControlSalud getControl(){
        return control;
    }
    
    // ---------------- Eventos ----------------
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == tipoPersona) {
            cambiarTipo();
        } else if (e.getSource() == btnGuardar) {
            guardar();
        } else if (e.getSource() == btnBuscar) {
            buscar();
        } else if (e.getSource() == btnLimpiar) {
            limpiar();
        }
    }
    
    // Habilita solo los campos y el panel que corresponden al tipo seleccionado
    private void cambiarTipo(){
        int tipo = tipoPersona.getSelectedIndex(); // 0 vacio, 1 ciudadano, 2 profesional, 3 docente
        
        boolean esCiudadano = (tipo == 1);
        boolean esProfesional = (tipo == 2);
        boolean esDocente = (tipo == 3);
        
        // Datos propios de cada tipo
        boxCabezaHogar.setEnabled(esCiudadano);
        txtInstitucion.setEditable(esProfesional || esDocente);
        txtEspecialidad.setEditable(esProfesional);
        nivelEducativo.setEnabled(esDocente);
        
        // Paneles de distribucion del bono
        txtElemBioseguridad.setEditable(esProfesional);
        txtMedicinaProf.setEditable(esProfesional);
        txtImplementoTec.setEditable(esDocente);
        txtServicio.setEditable(esDocente);
        txtCanasta.setEditable(esCiudadano);
        txtMedicina.setEditable(esCiudadano);
        
        // Lo que se deshabilita se borra, para no guardar datos de otro tipo
        if (!esCiudadano) {
            boxCabezaHogar.setSelected(false);
            txtCanasta.setText("");
            txtMedicina.setText("");
        }
        if (!esProfesional) {
            txtEspecialidad.setText("");
            txtElemBioseguridad.setText("");
            txtMedicinaProf.setText("");
        }
        if (!esDocente) {
            nivelEducativo.setSelectedIndex(0);
            txtImplementoTec.setText("");
            txtServicio.setText("");
        }
        if (!esProfesional && !esDocente) {
            txtInstitucion.setText("");
        }
    }
    
    private void guardar(){
        try {
            Persona p = crearPersona();
            control.guardar(p);
            JOptionPane.showMessageDialog(this, "Persona guardada correctamente");
            limpiar();
        } catch (NumberFormatException ex) {
            mostrarError("Edad, estrato y montos deben ser numeros");
        } catch (IllegalArgumentException ex) {
            mostrarError(ex.getMessage());
        }
    }
    
    // Lee el formulario y crea el objeto segun el tipo (lanza IllegalArgumentException si falta algo)
    private Persona crearPersona(){
        if (tipoDocumento.getSelectedIndex() == 0) {
            throw new IllegalArgumentException("Seleccione el tipo de documento");
        }
        if (tipoPersona.getSelectedIndex() == 0) {
            throw new IllegalArgumentException("Seleccione el tipo de persona");
        }
        String documento = txtDocumento.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String estadoCivil = txtEstadoCivil.getText().trim();
        if (documento.equals("") || nombre.equals("") || apellido.equals("") || estadoCivil.equals("")) {
            throw new IllegalArgumentException("Complete documento, nombre, apellido y estado civil");
        }
        
        TipoDocumento tipoDoc = TipoDocumento.values()[tipoDocumento.getSelectedIndex() - 1];
        String direccion = txtDireccion.getText().trim();
        String telefono = txtTelefono.getText().trim();
        int edad = Integer.parseInt(txtEdad.getText().trim());
        int estrato = Integer.parseInt(txtEstrato.getText().trim());
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        
        int tipo = tipoPersona.getSelectedIndex();
        if (tipo == 1) {
            Medicina med = new Medicina(leerMonto(txtMedicina));
            CanastaFamiliar canasta = new CanastaFamiliar(leerMonto(txtCanasta));
            return new CiudadanoComun(tipoDoc, documento, nombre, apellido, direccion, telefono, edad, estrato, estadoCivil, boxCabezaHogar.isSelected(), med, canasta);
        } else if (tipo == 2) {
            String institucion = txtInstitucion.getText().trim();
            String especialidad = txtEspecialidad.getText().trim();
            if (institucion.equals("") || especialidad.equals("")) {
                throw new IllegalArgumentException("Complete institucion y especialidad");
            }
            ElementoBioseguridad eb = new ElementoBioseguridad(leerMonto(txtElemBioseguridad));
            Medicina med = new Medicina(leerMonto(txtMedicinaProf));
            return new ProfesionalSalud(tipoDoc, documento, nombre, apellido, direccion, telefono, edad, estrato, estadoCivil, institucion, especialidad, eb, med);
        } else {
            String institucion = txtInstitucion.getText().trim();
            if (institucion.equals("") || nivelEducativo.getSelectedIndex() == 0) {
                throw new IllegalArgumentException("Complete institucion y nivel educativo");
            }
            NivelEducativo nivel = NivelEducativo.values()[nivelEducativo.getSelectedIndex() - 1];
            ImplementoTecnologico it = new ImplementoTecnologico(leerMonto(txtImplementoTec));
            Servicio serv = new Servicio(leerMonto(txtServicio));
            return new Docente(tipoDoc, documento, nombre, apellido, direccion, telefono, edad, estrato, estadoCivil, institucion, nivel, it, serv);
        }
    }
    
    // Un monto vacio cuenta como 0
    private double leerMonto(JTextField campo){
        String texto = campo.getText().trim();
        if (texto.equals("")) {
            return 0;
        }
        double monto = Double.parseDouble(texto);
        if (monto < 0) {
            throw new IllegalArgumentException("Los montos no pueden ser negativos");
        }
        return monto;
    }
    
    private void buscar(){
        String documento = txtDocumento.getText().trim();
        if (documento.equals("")) {
            mostrarError("Escriba el documento que desea buscar");
            return;
        }
        Persona p = control.buscar(documento);
        if (p == null) {
            limpiar(); // para no dejar en pantalla los datos de otra persona
            txtDocumento.setText(documento);
            mostrarError("No se encontro ninguna persona con ese documento");
            return;
        }
        
        limpiar();
        tipoDocumento.setSelectedIndex(p.getTipoDocumento().ordinal() + 1);
        txtDocumento.setText(p.getNumeroDocumento());
        txtNombre.setText(p.getNombre());
        txtApellido.setText(p.getApellido());
        txtDireccion.setText(p.getDireccion());
        txtTelefono.setText(p.getTelefono());
        txtEdad.setText(String.valueOf(p.getEdad()));
        txtEstrato.setText(String.valueOf(p.getEstrato()));
        txtEstadoCivil.setText(p.getEstadoCivil());
        
        // Al elegir el tipo se habilitan solo los campos de esa clasificacion
        if (p instanceof CiudadanoComun) {
            CiudadanoComun c = (CiudadanoComun) p;
            tipoPersona.setSelectedIndex(1);
            boxCabezaHogar.setSelected(c.isCabezaHogar());
            txtCanasta.setText(mostrar(c.getCanasta().getMonto()));
            txtMedicina.setText(mostrar(c.getMedicina().getMonto()));
        } else if (p instanceof ProfesionalSalud) {
            ProfesionalSalud ps = (ProfesionalSalud) p;
            tipoPersona.setSelectedIndex(2);
            txtInstitucion.setText(ps.getInstitucion());
            txtEspecialidad.setText(ps.getEspecialidad());
            txtElemBioseguridad.setText(mostrar(ps.getElementoBioseguridad().getMonto()));
            txtMedicinaProf.setText(mostrar(ps.getMedicina().getMonto()));
        } else if (p instanceof Docente) {
            Docente d = (Docente) p;
            tipoPersona.setSelectedIndex(3);
            txtInstitucion.setText(d.getInstitucion());
            nivelEducativo.setSelectedIndex(d.getNivel().ordinal() + 1);
            txtImplementoTec.setText(mostrar(d.getImplemento().getMonto()));
            txtServicio.setText(mostrar(d.getServicio().getMonto()));
        }
    }
    
    private void limpiar(){
        tipoDocumento.setSelectedIndex(0);
        txtDocumento.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEdad.setText("");
        txtEstrato.setText("");
        txtEstadoCivil.setText("");
        tipoPersona.setSelectedIndex(0); // esto tambien deshabilita y borra los campos dependientes
    }
    
    // Muestra 50000 en vez de 50000.0
    private String mostrar(double valor){
        if (valor == (long) valor) {
            return String.valueOf((long) valor);
        }
        return String.valueOf(valor);
    }
    
    private void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);
    }
}
