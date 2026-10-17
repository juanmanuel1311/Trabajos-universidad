import javax.swing.*;
import java.awt.*;

public class awed extends JFrame
{
    public awed(){
        JPanel p1 = new JPanel();
        setSize(300, 300);
        setResizable(false);
        
        JButton boton = new JButton("Iniciador de la wea");
        
        boton.addActionListener(e -> {
            new JFAlcancia();
        });
        
        add(boton);
        setVisible(true);
    }
}