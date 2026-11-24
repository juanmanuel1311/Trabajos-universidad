package control;
import vista.*;
import modelo.*;
import java.awt.event.*;
import javax.swing.*;

public class Controlador implements ActionListener
{
    private JFormulario vista;
    private Conclaves conclave;
    private RondaVotacion ronda;
    private Object btnVotar, btnAleatorizar, btnMostrarResultados, btnSiguienteRonda;

    public Controlador(){
        vista = new JFormulario();
        conclave = new Conclaves();
        btnVotar = vista.getBtnVotar();
        btnAleatorizar = vista.getBtnAleatorizar();
        btnMostrarResultados = vista.getBtnMostrarResultados();
        btnSiguienteRonda = vista.getBtnSiguienteRonda();
        vista.getBtnVotar().addActionListener(this);
        vista.getBtnAleatorizar().addActionListener(this);
        vista.getBtnMostrarResultados().addActionListener(this);
        vista.getBtnSiguienteRonda().addActionListener(this);
    }

    public void agregarCardenal(Cardenal cardenal){
        conclave.agregarCardenal(cardenal);
        vista.actualizarCardenales(conclave.getCardenales().toArray(new Cardenal[0]));
    }

    public void iniciar(){
        ronda = conclave.nuevaRonda();
        actualizarBotones();
        mostrarResultados();
        vista.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnVotar)){
            Object seleccion = vista.getCbCardenales().getSelectedItem();
            if(!(seleccion instanceof Cardenal)){
                JOptionPane.showMessageDialog(vista, "Seleccione un cardenal");
                return;
            }
            conclave.votar(ronda, (Cardenal) seleccion);
        }else if(e.getSource().equals(btnAleatorizar)){
            conclave.aleatorizar(ronda);
        }else if(e.getSource().equals(btnSiguienteRonda)){
            if(conclave.rondaCompleta(ronda) && conclave.obtenerPapa(ronda) == null
                && !conclave.obtenerElectores().isEmpty()){
                ronda = conclave.nuevaRonda();
                vista.getTxtRonda().setText("" + ronda.getNumeroRonda());
            }
        }
        mostrarResultados();
        actualizarBotones();
    }

    private void actualizarBotones(){
        boolean hayElectores = !conclave.obtenerElectores().isEmpty();
        boolean completa = conclave.rondaCompleta(ronda);
        vista.getBtnVotar().setEnabled(hayElectores && !completa);
        vista.getBtnAleatorizar().setEnabled(hayElectores && !completa);
        vista.getBtnSiguienteRonda().setEnabled(hayElectores && completa && conclave.obtenerPapa(ronda) == null);
    }

    private void mostrarResultados(){
        String texto = "Ronda: " + ronda.getNumeroRonda() + " | Día: " + ronda.getDiaRonda()
            + " | Jornada: " + ronda.getJornada() + "\n";
        texto += "Votos: " + ronda.getVotos().size() + "/" + conclave.obtenerElectores().size() + "\n";
        texto += "Votos necesarios: " + conclave.votosNecesarios() + "\n\n";
        for(Cardenal c : conclave.getCardenales()){
            texto += c.getNombre() + ": " + conclave.contarVotos(ronda, c) + " votos\n";
        }
        if(conclave.obtenerElectores().isEmpty()){
            texto += "\nNo hay electores registrados";
        }else if(conclave.rondaCompleta(ronda)){
            Cardenal papa = conclave.obtenerPapa(ronda);
            if(papa != null){
                texto += "\nHay nuevo papa\n" + papa.getNombre() + "\nPaís: " + papa.getPaisRepresentado()
                    + "\nEdad: " + papa.getEdad();
            }else{
                texto += "\nNo hay papa aún";
            }
        }
        vista.getTxtResultados().setText(texto);
    }
}
