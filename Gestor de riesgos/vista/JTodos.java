package vista;
import javax.swing.*;
import java.awt.*;
import modelo.*;
import java.util.*;

public class JTodos extends JFrame
{
    public JTodos(ArrayList<Riesgo> riesgos){
        
        setTitle("Todos los elementos");
        JPanel pScroll = new JPanel();
        pScroll.setLayout(new GridLayout(0, 2, 20, 10));
        
        JScrollPane scroll = new JScrollPane(pScroll);
        add(scroll);
        
        for(Riesgo e : riesgos){
            if(e!=null){
                JTextField txtCodigo, txtDescripcion, txtTipo, txtRiesgo;
                JPanel panelRiesgo = new JPanel();
                panelRiesgo.setLayout(new GridLayout(4,2));
                panelRiesgo.setBorder(BorderFactory.createTitledBorder("Descripcion"));
                panelRiesgo.add(new JLabel("Codigo: "));
                txtCodigo = new JTextField(e.getCodigo()+1+"");
                txtCodigo.setEditable(false);
                panelRiesgo.add(txtCodigo);
        
                panelRiesgo.add(new JLabel("Descripcion: "));
                txtDescripcion = new JTextField(e.getDescripcion());
                txtDescripcion.setEditable(false);
                panelRiesgo.add(txtDescripcion);
        
                panelRiesgo.add(new JLabel("Tipo: "));
                txtTipo = new JTextField(e.getTipo());
                txtTipo.setEditable(false);
                panelRiesgo.add(txtTipo);
        
                panelRiesgo.add(new JLabel("Nivel de peligro (1-5): "));
                txtRiesgo = new JTextField(e.getNivelPeligro()+"");
                txtRiesgo.setEditable(false);
                panelRiesgo.add(txtRiesgo);
                
                pScroll.add(panelRiesgo);
            }
        }
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(900, 600);
        setVisible(true);
    }
}
