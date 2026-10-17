import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JFAlcancia extends JFrame {

    private Alcancia alcancia;
    private JLabel lblSaldo;
    private JLabel lbl50, lbl100, lbl200, lbl500, lbl1000;
    JLabel lblIcono;

    private static final Font FUENTE_TITULO = new Font("Times New Roman", Font.BOLD, 20);
    private static final Font FUENTE_SALDO  = new Font("Times New Roman", Font.BOLD, 30);
    private static final Font FUENTE_TEXTO  = new Font("Times New Roman", Font.PLAIN, 20);

    private static final int[] MONEDAS = {50, 100, 200, 500, 1000};

    public JFAlcancia() {
        alcancia = new Alcancia();

        setTitle("Mi Alcancia - POO 1");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        add(crearInterfaz());
        actualizarInterfaz();

        setVisible(true);
    }

    public JPanel crearInterfaz() {
        JPanel principal = new JPanel(new BorderLayout(15, 15));
        principal.setBorder(new EmptyBorder(20, 25, 20, 25));

        principal.add(crearEncabezado(), BorderLayout.NORTH);
        principal.add(crearPanelMonedas(), BorderLayout.CENTER);
        
        return principal;
    }

    private JPanel crearEncabezado() {
        JPanel principal = new JPanel();
        principal.setLayout(new BorderLayout());
        
        JPanel encabezado = new JPanel();
        encabezado.setLayout(new BoxLayout(encabezado, BoxLayout.Y_AXIS));

        lblIcono = new JLabel(new ImageIcon("Images/plate_1.png"));

        JLabel titulo = new JLabel("MI ALCANCIA");
        titulo.setFont(FUENTE_TITULO);

        lblSaldo = new JLabel("$0");
        lblSaldo.setFont(FUENTE_SALDO);

        JLabel lblTextoSaldo = new JLabel("Saldo disponible");
        lblTextoSaldo.setFont(FUENTE_TEXTO);

        // Centrar todo
        lblIcono.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblSaldo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTextoSaldo.setAlignmentX(Component.CENTER_ALIGNMENT);

        encabezado.add(lblIcono);
        encabezado.add(titulo);
        encabezado.add(lblSaldo);
        encabezado.add(lblTextoSaldo);

        principal.add(encabezado, BorderLayout.NORTH);
        principal.add(crearCentro(), BorderLayout.CENTER);
        return principal;
    }

    private JPanel crearCentro() {
        JPanel centro = new JPanel();
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.add(Box.createVerticalStrut(20));

        JLabel lblTituloMonedas = new JLabel("INGRESAR MONEDAS");
        lblTituloMonedas.setFont(FUENTE_TITULO);
        lblTituloMonedas.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel botones = crearBotonesMonedas();
        botones.setAlignmentX(Component.CENTER_ALIGNMENT);

        centro.add(lblTituloMonedas);
        centro.add(botones);

        return centro;
    }

    private JPanel crearBotonesMonedas() {
        JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER, 8, 12));

        for (int valor : MONEDAS) {
            JButton boton = new JButton("$" + valor);
            boton.addActionListener(e -> {
                alcancia.agregarMonedas(valor);
                actualizarInterfaz();
                lblIcono.setIcon(new ImageIcon("Images/plate_1.png"));
            });
            botones.add(boton);
        }

        return botones;
    }
    
    private JPanel crearPanelMonedas(){
        JPanel principal = new JPanel();
        principal.setLayout(new BorderLayout());
        JPanel panelMonedas = new JPanel();
        panelMonedas.setLayout(new BoxLayout(panelMonedas, BoxLayout.Y_AXIS));
        panelMonedas.setBorder(BorderFactory.createTitledBorder("Resumen de la alcancia"));
        
        lbl50 = new JLabel("Monedas de $50: "+alcancia.getMonedas(50));
        lbl100 = new JLabel("Monedas de $100: "+alcancia.getMonedas(100));
        lbl200 = new JLabel("Monedas de $200: "+alcancia.getMonedas(200));
        lbl500 = new JLabel("Monedas de $500: "+alcancia.getMonedas(500));
        lbl1000 = new JLabel("Monedas de $1000: "+alcancia.getMonedas(1000));
        
        lbl50.setAlignmentX(Component.LEFT_ALIGNMENT);
        lbl100.setAlignmentX(Component.LEFT_ALIGNMENT);
        lbl200.setAlignmentX(Component.LEFT_ALIGNMENT);
        lbl500.setAlignmentX(Component.LEFT_ALIGNMENT);
        lbl1000.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        panelMonedas.add(lbl50);
        panelMonedas.add(lbl100);
        panelMonedas.add(lbl200);
        panelMonedas.add(lbl500);
        panelMonedas.add(lbl1000);
        
        principal.add(panelMonedas, BorderLayout.NORTH);
        
        
        principal.add(crearBotonVaciar(), BorderLayout.SOUTH);
        
        return principal;
    }
    
    public JPanel crearBotonVaciar(){
        JPanel panelVaciar = new JPanel();
        panelVaciar.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JButton vaciarAlcancia = new JButton("Vaciar alcancia");
        vaciarAlcancia.addActionListener(e -> {
            alcancia.vaciar();
            actualizarInterfaz();
            lblIcono.setIcon(new ImageIcon("Images/plate_2.png"));
            
        });
        
        panelVaciar.add(vaciarAlcancia);
        
        return panelVaciar;
    }
    
    public void actualizarInterfaz() {
        lblSaldo.setText("$" + alcancia.getSaldo());
        lbl50.setText("Monedas de $50: "+alcancia.getMonedas(50));
        lbl100.setText("Monedas de $100: "+alcancia.getMonedas(100));
        lbl200.setText("Monedas de $200: "+alcancia.getMonedas(200));
        lbl500.setText("Monedas de $500: "+alcancia.getMonedas(500));
        lbl1000.setText("Monedas de $1000: "+alcancia.getMonedas(1000));
    }
    
    
}