package vista;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JFormulario extends JFrame
{
    
    
    private JLabel lblMarca, lblLinea, lblModelo, lblValor;
    private JButton btn1, btn2, btn3, btn4;
    private JTextField txtBuscaLinea, txtBuscaMarca;
    private JButton btnBuscaLinea, btnBuscaMarca, btnBuscaCaro;
    private JCheckBox boxProntoPago, boxTrasladoCuenta, boxServicioPublico;
    private JButton pCalcular, pOpcion1, pOpcion2;
    private JLabel lblCarro;

    public JFormulario(){
        
        JPanel pEncabezado, pCentro, pBotones, pBusqueda, pDescuentos, pOpciones;
        
        setTitle("Calculador de impuestos");
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(600,800);
        /*setLayout(new GridLayout(5,1));*/
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        // ------Panel encabezado
        JLabel lblEncabezado = new JLabel(new ImageIcon("Imagenes/encabezado.png"));
        add(lblEncabezado);
        
        // ------Panel datos del vehiculo
        
        pCentro = new JPanel();
        pCentro.setLayout(new BorderLayout());
        pCentro.setBorder(BorderFactory.createTitledBorder("Datos del vehiculo"));
        
        ImageIcon icono = new ImageIcon("Imagenes/carroFord.png");
        lblCarro = new JLabel(icono);
        pCentro.add(lblCarro, BorderLayout.WEST);
        
        JPanel centroDerecho = new JPanel();
        centroDerecho.setLayout(new GridLayout(4,2));
        centroDerecho.setBorder(new EmptyBorder(4, 4, 4, 4));
        pCentro.add(centroDerecho, BorderLayout.CENTER);
        
        JLabel lblTextoMarca, lblTextoLinea, lblTextoModelo, lblTextoValor;
        
        lblTextoMarca = new JLabel("Marca");
        lblMarca = new JLabel("Ford");
        lblTextoLinea = new JLabel("Linea");
        lblLinea = new JLabel("Taurus");
        lblTextoModelo = new JLabel("Modelo");
        lblModelo = new JLabel("2016");
        lblTextoValor = new JLabel("Valor");
        lblValor = new JLabel("$136,340,000");
        
        
        centroDerecho.add(lblTextoMarca);
        centroDerecho.add(lblMarca);
        centroDerecho.add(lblTextoLinea);
        centroDerecho.add(lblLinea);
        centroDerecho.add(lblTextoModelo);
        centroDerecho.add(lblModelo);
        centroDerecho.add(lblTextoValor);
        centroDerecho.add(lblValor);
        
        add(pCentro);
        

        
        btn1 = new JButton("<<");
        btn2 = new JButton("<");
        btn3 = new JButton(">");
        btn4 = new JButton(">>");
        
        pBotones = new JPanel();
        pBotones.setLayout(new GridLayout(1,4));
        pBotones.add(btn1);
        pBotones.add(btn2);
        pBotones.add(btn3);
        pBotones.add(btn4);
        pBotones.setBorder(new EmptyBorder(4, 4, 4, 4));
        
        pCentro.add(pBotones, BorderLayout.SOUTH);
        
        // ----- Panel Busquedas
        pBusqueda = new JPanel();
        pBusqueda.setLayout(new BorderLayout());
        pBusqueda.setBorder(BorderFactory.createTitledBorder("Busquedas"));
        JPanel pSubBusqueda = new JPanel();
        pSubBusqueda.setLayout(new GridLayout(3,2, 4, 4));
        pBusqueda.add(pSubBusqueda, BorderLayout.CENTER);
        


        txtBuscaLinea = new JTextField();
        txtBuscaMarca = new JTextField();
        btnBuscaLinea = new JButton("Buscar por linea");
        btnBuscaMarca = new JButton("Buscar por marca");
        btnBuscaCaro = new JButton("Buscar vehiculo mas caro");
        
        pSubBusqueda.add(txtBuscaLinea);
        pSubBusqueda.add(btnBuscaLinea);
        pSubBusqueda.add(txtBuscaMarca);
        pSubBusqueda.add(btnBuscaMarca);
        pSubBusqueda.add(new JLabel(""));
        pSubBusqueda.add(btnBuscaCaro);
        
        add(pBusqueda);
        
        // ----- Descuentos
        
        pDescuentos = new JPanel();
        pDescuentos.setLayout(new GridLayout(1,3));
        pDescuentos.setBorder(BorderFactory.createTitledBorder("Descuentos"));
        

        boxProntoPago = new JCheckBox("Pronto pago");
        boxTrasladoCuenta = new JCheckBox("Traslado cuenta");
        boxServicioPublico = new JCheckBox("Servicio publico");
        
        pDescuentos.add(boxProntoPago);
        pDescuentos.add(boxTrasladoCuenta);
        pDescuentos.add(boxServicioPublico);
        
        add(pDescuentos);
        
        
        
        
        // ----- Opciones
        
        pOpciones = new JPanel();
        pOpciones.setLayout(new GridLayout(1,3));
        pOpciones.setBorder(BorderFactory.createTitledBorder("Opciones"));
        

        pCalcular = new JButton("Calcular");
        pOpcion1 = new JButton("Limpiar");
        pOpcion2 = new JButton("Salir");
        
        pOpciones.add(pCalcular);
        pOpciones.add(pOpcion1);
        pOpciones.add(pOpcion2);
        
        add(pOpciones);
        // ----- Cierre del codigo
        lblEncabezado.setAlignmentX(Component.LEFT_ALIGNMENT);   // el panel, no solo el label
        pCentro.setAlignmentX(Component.LEFT_ALIGNMENT);
        pBusqueda.setAlignmentX(Component.LEFT_ALIGNMENT);
        pDescuentos.setAlignmentX(Component.LEFT_ALIGNMENT);
        pOpciones.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        pack();
        setSize(560, getHeight());

    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie lblMarca*/
    public JLabel getLblMarca(){
        return this.lblMarca;
    }//end method getLblMarca

    /**SET Method Propertie lblMarca*/
    public void setLblMarca(JLabel lblMarca){
        this.lblMarca = lblMarca;
    }//end method setLblMarca

    /**GET Method Propertie lblLinea*/
    public JLabel getLblLinea(){
        return this.lblLinea;
    }//end method getLblLinea

    /**SET Method Propertie lblLinea*/
    public void setLblLinea(JLabel lblLinea){
        this.lblLinea = lblLinea;
    }//end method setLblLinea

    /**GET Method Propertie lblModelo*/
    public JLabel getLblModelo(){
        return this.lblModelo;
    }//end method getLblModelo

    /**SET Method Propertie lblModelo*/
    public void setLblModelo(JLabel lblModelo){
        this.lblModelo = lblModelo;
    }//end method setLblModelo

    /**GET Method Propertie lblValor*/
    public JLabel getLblValor(){
        return this.lblValor;
    }//end method getLblValor

    /**SET Method Propertie lblValor*/
    public void setLblValor(JLabel lblValor){
        this.lblValor = lblValor;
    }//end method setLblValor

    /**GET Method Propertie btn1*/
    public JButton getBtn1(){
        return this.btn1;
    }//end method getBtn1

    /**SET Method Propertie btn1*/
    public void setBtn1(JButton btn1){
        this.btn1 = btn1;
    }//end method setBtn1

    /**GET Method Propertie btn2*/
    public JButton getBtn2(){
        return this.btn2;
    }//end method getBtn2

    /**SET Method Propertie btn2*/
    public void setBtn2(JButton btn2){
        this.btn2 = btn2;
    }//end method setBtn2

    /**GET Method Propertie btn3*/
    public JButton getBtn3(){
        return this.btn3;
    }//end method getBtn3

    /**SET Method Propertie btn3*/
    public void setBtn3(JButton btn3){
        this.btn3 = btn3;
    }//end method setBtn3

    /**GET Method Propertie btn4*/
    public JButton getBtn4(){
        return this.btn4;
    }//end method getBtn4

    /**SET Method Propertie btn4*/
    public void setBtn4(JButton btn4){
        this.btn4 = btn4;
    }//end method setBtn4

    /**GET Method Propertie txtBuscaLinea*/
    public JTextField getTxtBuscaLinea(){
        return this.txtBuscaLinea;
    }//end method getTxtBuscaLinea

    /**SET Method Propertie txtBuscaLinea*/
    public void setTxtBuscaLinea(JTextField txtBuscaLinea){
        this.txtBuscaLinea = txtBuscaLinea;
    }//end method setTxtBuscaLinea

    /**GET Method Propertie txtBuscaMarca*/
    public JTextField getTxtBuscaMarca(){
        return this.txtBuscaMarca;
    }//end method getTxtBuscaMarca

    /**SET Method Propertie txtBuscaMarca*/
    public void setTxtBuscaMarca(JTextField txtBuscaMarca){
        this.txtBuscaMarca = txtBuscaMarca;
    }//end method setTxtBuscaMarca

    /**GET Method Propertie btnBuscaLinea*/
    public JButton getBtnBuscaLinea(){
        return this.btnBuscaLinea;
    }//end method getBtnBuscaLinea

    /**SET Method Propertie btnBuscaLinea*/
    public void setBtnBuscaLinea(JButton btnBuscaLinea){
        this.btnBuscaLinea = btnBuscaLinea;
    }//end method setBtnBuscaLinea

    /**GET Method Propertie btnBuscaMarca*/
    public JButton getBtnBuscaMarca(){
        return this.btnBuscaMarca;
    }//end method getBtnBuscaMarca

    /**SET Method Propertie btnBuscaMarca*/
    public void setBtnBuscaMarca(JButton btnBuscaMarca){
        this.btnBuscaMarca = btnBuscaMarca;
    }//end method setBtnBuscaMarca

    /**GET Method Propertie btnBuscaCaro*/
    public JButton getBtnBuscaCaro(){
        return this.btnBuscaCaro;
    }//end method getBtnBuscaCaro

    /**SET Method Propertie btnBuscaCaro*/
    public void setBtnBuscaCaro(JButton btnBuscaCaro){
        this.btnBuscaCaro = btnBuscaCaro;
    }//end method setBtnBuscaCaro

    /**GET Method Propertie boxProntoPago*/
    public JCheckBox getBoxProntoPago(){
        return this.boxProntoPago;
    }//end method getBoxProntoPago

    /**SET Method Propertie boxProntoPago*/
    public void setBoxProntoPago(JCheckBox boxProntoPago){
        this.boxProntoPago = boxProntoPago;
    }//end method setBoxProntoPago

    /**GET Method Propertie boxTrasladoCuenta*/
    public JCheckBox getBoxTrasladoCuenta(){
        return this.boxTrasladoCuenta;
    }//end method getBoxTrasladoCuenta

    /**SET Method Propertie boxTrasladoCuenta*/
    public void setBoxTrasladoCuenta(JCheckBox boxTrasladoCuenta){
        this.boxTrasladoCuenta = boxTrasladoCuenta;
    }//end method setBoxTrasladoCuenta

    /**GET Method Propertie boxServicioPublico*/
    public JCheckBox getBoxServicioPublico(){
        return this.boxServicioPublico;
    }//end method getBoxServicioPublico

    /**SET Method Propertie boxServicioPublico*/
    public void setBoxServicioPublico(JCheckBox boxServicioPublico){
        this.boxServicioPublico = boxServicioPublico;
    }//end method setBoxServicioPublico

    /**GET Method Propertie pCalcular*/
    public JButton getPCalcular(){
        return this.pCalcular;
    }//end method getPCalcular

    /**SET Method Propertie pCalcular*/
    public void setPCalcular(JButton pCalcular){
        this.pCalcular = pCalcular;
    }//end method setPCalcular

    /**GET Method Propertie pOpcion1*/
    public JButton getPOpcion1(){
        return this.pOpcion1;
    }//end method getPOpcion1

    /**SET Method Propertie pOpcion1*/
    public void setPOpcion1(JButton pOpcion1){
        this.pOpcion1 = pOpcion1;
    }//end method setPOpcion1

    /**GET Method Propertie pOpcion2*/
    public JButton getPOpcion2(){
        return this.pOpcion2;
    }//end method getPOpcion2

    /**SET Method Propertie pOpcion2*/
    public void setPOpcion2(JButton pOpcion2){
        this.pOpcion2 = pOpcion2;
    }//end method setPOpcion2

    /**GET Method Propertie lblCarro*/
    public JLabel getLblCarro(){
        return this.lblCarro;
    }//end method getLblCarro

    /**SET Method Propertie lblCarro*/
    public void setLblCarro(JLabel lblCarro){
        this.lblCarro = lblCarro;
    }//end method setLblCarro

//End GetterSetterExtension Source Code


}//End class