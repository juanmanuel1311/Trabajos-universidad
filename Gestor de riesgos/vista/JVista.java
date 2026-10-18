package vista;
import javax.swing.*;
import java.awt.*;

public class JVista extends JFrame
{
    JButton btnAgregar, btnBuscar, btnEliminar, btnTodos;
    JTextField txtCodigo, txtDescripcion, txtTipo, txtRiesgo;
    
    public JVista(){
        setTitle("Gestor de Riesgos - Mina");
        setLayout(new BorderLayout());
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        
        add(PanelEntrada(), BorderLayout.NORTH);
        add(PanelSur(), BorderLayout.SOUTH);
        setVisible(true);
    }
    
    public JPanel PanelEntrada(){
        JPanel pEntrada = new JPanel();
        pEntrada.setBorder(BorderFactory.createTitledBorder("Descripcion"));
        pEntrada.setLayout(new GridLayout(5, 2));
        pEntrada.add(new JLabel("Codigo: "));
        txtCodigo = new JTextField();
        txtCodigo.setEditable(true);
        pEntrada.add(txtCodigo);
        
        pEntrada.add(new JLabel("Descripcion: "));
        txtDescripcion = new JTextField();
        txtDescripcion.setEditable(true);
        pEntrada.add(txtDescripcion);
        
        pEntrada.add(new JLabel("Tipo: "));
        txtTipo = new JTextField();
        txtTipo.setEditable(true);
        pEntrada.add(txtTipo);
        
        pEntrada.add(new JLabel("Nivel de peligro (1-5): "));
        txtRiesgo = new JTextField();
        txtRiesgo.setEditable(true);
        pEntrada.add(txtRiesgo);
        
        
        btnAgregar = new JButton("Agregar");
        pEntrada.add(btnAgregar);
        
        btnBuscar = new JButton("Buscar");
        pEntrada.add(btnBuscar);
        
        
        return pEntrada;
    }
    
    public JPanel PanelSur(){
        JPanel pSur = new JPanel();
        pSur.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        
        btnEliminar = new JButton("Eliminar");
        btnTodos = new JButton("Mostrar todos");
        pSur.add(btnEliminar);
        pSur.add(btnTodos);
        return pSur;
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie btnAgregar*/
    public JButton getBtnAgregar(){
        return this.btnAgregar;
    }//end method getBtnAgregar

    /**SET Method Propertie btnAgregar*/
    public void setBtnAgregar(JButton btnAgregar){
        this.btnAgregar = btnAgregar;
    }//end method setBtnAgregar

    /**GET Method Propertie btnBuscar*/
    public JButton getBtnBuscar(){
        return this.btnBuscar;
    }//end method getBtnBuscar

    /**SET Method Propertie btnBuscar*/
    public void setBtnBuscar(JButton btnBuscar){
        this.btnBuscar = btnBuscar;
    }//end method setBtnBuscar

    /**GET Method Propertie btnEliminar*/
    public JButton getBtnEliminar(){
        return this.btnEliminar;
    }//end method getBtnEliminar

    /**SET Method Propertie btnEliminar*/
    public void setBtnEliminar(JButton btnEliminar){
        this.btnEliminar = btnEliminar;
    }//end method setBtnEliminar

    /**GET Method Propertie btnTodos*/
    public JButton getBtnTodos(){
        return this.btnTodos;
    }//end method getBtnTodos

    /**SET Method Propertie btnTodos*/
    public void setBtnTodos(JButton btnTodos){
        this.btnTodos = btnTodos;
    }//end method setBtnTodos

    /**GET Method Propertie txtCodigo*/
    public JTextField getTxtCodigo(){
        return this.txtCodigo;
    }//end method getTxtCodigo

    /**SET Method Propertie txtCodigo*/
    public void setTxtCodigo(JTextField txtCodigo){
        this.txtCodigo = txtCodigo;
    }//end method setTxtCodigo

    /**GET Method Propertie txtDescripcion*/
    public JTextField getTxtDescripcion(){
        return this.txtDescripcion;
    }//end method getTxtDescripcion

    /**SET Method Propertie txtDescripcion*/
    public void setTxtDescripcion(String txtDescripcion){
        this.txtDescripcion.setText(txtDescripcion);
    }//end method setTxtDescripcion

    /**GET Method Propertie txtTipo*/
    public JTextField getTxtTipo(){
        return this.txtTipo;
    }//end method getTxtTipo

    /**SET Method Propertie txtTipo*/
    public void setTxtTipo(String txtTipo){
        this.txtTipo.setText(txtTipo);
    }//end method setTxtTipo

    /**GET Method Propertie txtRiesgo*/
    public JTextField getTxtRiesgo(){
        return this.txtRiesgo;
    }//end method getTxtRiesgo

    /**SET Method Propertie txtRiesgo*/
    public void setTxtRiesgo(String txtRiesgo){
        this.txtRiesgo.setText(txtRiesgo);
    }//end method setTxtRiesgo

//End GetterSetterExtension Source Code


}//End class