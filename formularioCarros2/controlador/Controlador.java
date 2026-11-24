package controlador;

import vista.*;
import modelo.*;
import java.awt.event.*;
import javax.swing.*;

public class Controlador implements ActionListener {
    private JFormulario vista;
    private GestionVehiculos modelo;
    private int posicion = 0;

    public Controlador(JFormulario vista, GestionVehiculos modelo){
        this.vista = vista;
        this.modelo = modelo;
        vista.getBtn1().addActionListener(this);
        vista.getBtn2().addActionListener(this);
        vista.getBtn3().addActionListener(this);
        vista.getBtn4().addActionListener(this);
        vista.getBtnBuscaLinea().addActionListener(this);
        vista.getBtnBuscaMarca().addActionListener(this);
        vista.getBtnBuscaCaro().addActionListener(this);
        vista.getPCalcular().addActionListener(this);
        vista.getPOpcion1().addActionListener(this);
        vista.getPOpcion2().addActionListener(this);
        mostrar();
    }

    private void mostrar(){

        Vehiculo v = modelo.obtener(posicion);
        vista.getLblMarca().setText(v.getMarca());
        vista.getLblLinea().setText(v.getLinea());
        vista.getLblModelo().setText("" + v.getModelo());
        vista.getLblValor().setText(String.format("$%,.0f", v.getValor()));

        if(posicion == 0){
            vista.getLblCarro().setIcon(new ImageIcon("Imagenes/carroFord.png"));
            vista.getLblCarro().setText("");
        } else {
            vista.getLblCarro().setIcon(null);
            vista.getLblCarro().setText("Sin imagen");
        }

        vista.getBtn1().setEnabled(posicion > 0);
        vista.getBtn2().setEnabled(posicion > 0);
        vista.getBtn3().setEnabled(posicion < modelo.cantidad()-1);
        vista.getBtn4().setEnabled(posicion < modelo.cantidad()-1);

    }

    private void buscar(String texto, boolean marca){
        int resultado = modelo.buscar(texto, marca);
        if(resultado == -1) JOptionPane.showMessageDialog(vista, "No se encontro el vehiculo");
        else posicion = resultado;
    }

    public void actionPerformed(ActionEvent e){
        Object boton = e.getSource();

        if(boton == vista.getBtn1()){
            posicion = 0;
        } else if(boton == vista.getBtn2() && posicion > 0){
            posicion--;
        }
        else if(boton == vista.getBtn3() && posicion < modelo.cantidad()-1){
            posicion++;
        }
        else if(boton == vista.getBtn4()) {
            posicion = modelo.cantidad()-1;
        }
        else if(boton == vista.getBtnBuscaLinea()){
            buscar(vista.getTxtBuscaLinea().getText(), false);
        }
        else if(boton == vista.getBtnBuscaMarca()) {
            buscar(vista.getTxtBuscaMarca().getText(), true);
        }
        else if(boton == vista.getBtnBuscaCaro()) {
            posicion = modelo.masCaro();}
        else if(boton == vista.getPCalcular()){
            double impuesto = modelo.obtener(posicion).calcularImpuesto(
                    vista.getBoxProntoPago().isSelected(), 
                    vista.getBoxTrasladoCuenta().isSelected(),
                    vista.getBoxServicioPublico().isSelected());
            JOptionPane.showMessageDialog(vista, String.format("Impuesto: $%,.0f", impuesto));
        
        }else if(boton == vista.getPOpcion1()){
            vista.getTxtBuscaLinea().setText("");
            vista.getTxtBuscaMarca().setText("");
            vista.getBoxProntoPago().setSelected(false);
            vista.getBoxTrasladoCuenta().setSelected(false);
            vista.getBoxServicioPublico().setSelected(false);
        } else if(boton == vista.getPOpcion2()) vista.dispose();
        mostrar();
    }
}
