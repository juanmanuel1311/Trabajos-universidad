package controlador;
import vista.*;
import modelo.*;
import java.util.*;


public class Control
{
    GestorRiesgos modelGestorRiesgos;
    JVista viewGestion;
    
    public Control(){
        this.modelGestorRiesgos = new GestorRiesgos();
        this.viewGestion = new JVista();
        ArrayList<Riesgo> riesgos = modelGestorRiesgos.getRiesgos();
        
        viewGestion.getBtnAgregar().addActionListener(e -> {
            if(//viewGestion.getTxtCodigo().getText()!=null&& 
            viewGestion.getTxtDescripcion().getText()!=null
            && viewGestion.getTxtTipo().getText()!=null
            && viewGestion.getTxtRiesgo().getText()!=null){
                Riesgo nuevoRiesgo = new Riesgo(
                //String.valueOf(modelGestorRiesgos.getRiesgos().size()),
                riesgos.size()-1,
                viewGestion.getTxtDescripcion().getText(),
                viewGestion.getTxtTipo().getText(),
                Integer.parseInt(viewGestion.getTxtRiesgo().getText()));
                
                modelGestorRiesgos.agregarRiesgo(nuevoRiesgo);
                viewGestion.getTxtCodigo().setText(""+riesgos.indexOf(nuevoRiesgo));
            }
        });
        
        viewGestion.getBtnBuscar().addActionListener(e -> {
            if(Integer.parseInt(viewGestion.getTxtCodigo().getText())<=riesgos.size()){
                int codigo = Integer.parseInt(viewGestion.getTxtCodigo().getText());
                viewGestion.setTxtDescripcion(riesgos.get(codigo).getDescripcion());
                viewGestion.setTxtTipo(riesgos.get(codigo).getTipo());
                viewGestion.setTxtRiesgo(riesgos.get(codigo).getNivelPeligro()+"");
                
            }
        });
        
        viewGestion.getBtnTodos().addActionListener(e -> {
           new JTodos(riesgos); 
        });
    }
}