package vista;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import modelo.*;

public class JFormulario extends JFrame
{
    /// Encabezado
    private JComboBox cbCardenales;
    private String[] nombresCardenales;
    private JButton btnVotar, btnAleatorizar;
    private JTextField txtRonda;
    
    /// Centro
    
    private JTextArea txtResultados;
    
    /// Inferior
    
    private JButton btnMostrarResultados, btnSiguienteRonda;
    public JFormulario(){
        setTitle("Votaciones Conclave");
        setResizable(false);
        setLayout(new BorderLayout());
        
        ((JPanel) this.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        add(encabezado(), BorderLayout.NORTH);
        add(centro(), BorderLayout.CENTER);
        add(inferior(), BorderLayout.SOUTH);
        
        pack();
        setSize(650, getHeight());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        

    }
    
    public JPanel encabezado(){
        JPanel pPrincipal = new JPanel();
        pPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        
        // Etiqueta
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel textoCardenales = new JLabel("Lista de cardenales");
        pPrincipal.add(textoCardenales, gbc);
        
        //ComboBox
        cbCardenales = new JComboBox();
        gbc.gridx = 1;
        pPrincipal.add(cbCardenales, gbc);
        
        //Boton votar
        gbc.gridx = 0;
        gbc.gridy = 1;
        btnVotar = new JButton("Votar");
        pPrincipal.add(btnVotar, gbc);
        
        
        //Etiqueta ronda
        
        gbc.gridx = 3;
        pPrincipal.add(new JLabel("Ronda No"), gbc);
        
        //Campo de texto
        
        gbc.gridx = 4;
        txtRonda = new JTextField("1", 3);
        txtRonda.setEditable(false);
        pPrincipal.add(txtRonda, gbc);
        
        return pPrincipal;
    }
    
    public JPanel centro(){
        JPanel pPrincipal = new JPanel();
        pPrincipal.setBorder(BorderFactory.createTitledBorder("Resultados"));
        pPrincipal.setLayout(new GridLayout(1,1));
        txtResultados = new JTextArea();
        txtResultados.setEditable(false);
        pPrincipal.add(new JScrollPane(txtResultados));
        pPrincipal.setPreferredSize(new Dimension(getWidth(), 300));
        
        return pPrincipal;
    }
    
    public JPanel inferior(){
        JPanel pPrincipal = new JPanel();
        
        btnMostrarResultados = new JButton("Mostrar Resultados");
        btnSiguienteRonda = new JButton("Siguiente Ronda");
        btnAleatorizar = new JButton("Aleatorizar");
        
        pPrincipal.add(btnAleatorizar);
        pPrincipal.add(btnMostrarResultados);
        pPrincipal.add(btnSiguienteRonda);
        
        return pPrincipal;
    }
    
    public void actualizarCardenales(Cardenal[] cardenales){
        cbCardenales.removeAllItems();
        cbCardenales.addItem("-");
        for(Cardenal c : cardenales){
            cbCardenales.addItem(c);
        }
    }

    

//Start GetterSetterExtension Source Code

    /**GET Method Propertie cbCardenales*/
    public JComboBox getCbCardenales(){
        return this.cbCardenales;
    }//end method getCbCardenales

    /**SET Method Propertie cbCardenales*/
    public void setCbCardenales(JComboBox cbCardenales){
        this.cbCardenales = cbCardenales;
    }//end method setCbCardenales

    /**GET Method Propertie nombresCardenales*/
    public String[] getNombresCardenales(){
        return this.nombresCardenales;
    }//end method getNombresCardenales

    /**SET Method Propertie nombresCardenales*/
    public void setNombresCardenales(String[] nombresCardenales){
        this.nombresCardenales = nombresCardenales;
    }//end method setNombresCardenales

    /**GET Method Propertie btnVotar*/
    public JButton getBtnVotar(){
        return this.btnVotar;
    }//end method getBtnVotar

    /**SET Method Propertie btnVotar*/
    public void setBtnVotar(JButton btnVotar){
        this.btnVotar = btnVotar;
    }//end method setBtnVotar

    /**GET Method Propertie btnAleatorizar*/
    public JButton getBtnAleatorizar(){
        return this.btnAleatorizar;
    }//end method getBtnAleatorizar

    /**SET Method Propertie btnAleatorizar*/
    public void setBtnAleatorizar(JButton btnAleatorizar){
        this.btnAleatorizar = btnAleatorizar;
    }//end method setBtnAleatorizar

    /**GET Method Propertie txtRonda*/
    public JTextField getTxtRonda(){
        return this.txtRonda;
    }//end method getTxtRonda

    /**SET Method Propertie txtRonda*/
    public void setTxtRonda(JTextField txtRonda){
        this.txtRonda = txtRonda;
    }//end method setTxtRonda

    /**GET Method Propertie txtResultados*/
    public JTextArea getTxtResultados(){
        return this.txtResultados;
    }//end method getTxtResultados

    /**SET Method Propertie txtResultados*/
    public void setTxtResultados(JTextArea txtResultados){
        this.txtResultados = txtResultados;
    }//end method setTxtResultados

    /**GET Method Propertie btnMostrarResultados*/
    public JButton getBtnMostrarResultados(){
        return this.btnMostrarResultados;
    }//end method getBtnMostrarResultados

    /**SET Method Propertie btnMostrarResultados*/
    public void setBtnMostrarResultados(JButton btnMostrarResultados){
        this.btnMostrarResultados = btnMostrarResultados;
    }//end method setBtnMostrarResultados

    /**GET Method Propertie btnSiguienteRonda*/
    public JButton getBtnSiguienteRonda(){
        return this.btnSiguienteRonda;
    }//end method getBtnSiguienteRonda

    /**SET Method Propertie btnSiguienteRonda*/
    public void setBtnSiguienteRonda(JButton btnSiguienteRonda){
        this.btnSiguienteRonda = btnSiguienteRonda;
    }//end method setBtnSiguienteRonda

//End GetterSetterExtension Source Code


}//End class