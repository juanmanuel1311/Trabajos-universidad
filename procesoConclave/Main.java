import modelo.*;
import vista.*;
import control.*;


public class Main
{
    public static void main(String[] args){
        Controlador controlador = new Controlador();
        // Electores (menos de 80 años)
        controlador.agregarCardenal(new Cardenal("Colombia",  TipoCardenal.OBISPO,     "1001", "Andrés Molina",   68));
        controlador.agregarCardenal(new Cardenal("Italia",    TipoCardenal.PRESBITERO, "1002", "Marco Bellini",   72));
        controlador.agregarCardenal(new Cardenal("Brasil",    TipoCardenal.OBISPO,     "1003", "João Ferreira",   59));
        controlador.agregarCardenal(new Cardenal("Filipinas", TipoCardenal.DIACONO,    "1004", "Ramón Dela Cruz", 64));
        controlador.agregarCardenal(new Cardenal("México",    TipoCardenal.PRESBITERO, "1005", "Luis Hernández",  77));
        controlador.agregarCardenal(new Cardenal("Argentina", TipoCardenal.OBISPO,     "1006", "Tomás Quiroga",   70));
        controlador.agregarCardenal(new Cardenal("Espana",    TipoCardenal.DIACONO,    "1007", "Javier Ortega",   55));
        controlador.agregarCardenal(new Cardenal("Francia",   TipoCardenal.PRESBITERO, "1008", "Henri Lacroix",   66));

        // No electores (80 años o más)
        controlador.agregarCardenal(new Cardenal("Polonia",   TipoCardenal.OBISPO,     "1009", "Piotr Nowak",     83));
        controlador.agregarCardenal(new Cardenal("Alemania",  TipoCardenal.PRESBITERO, "1010", "Klaus Weber",     86));
        controlador.agregarCardenal(new Cardenal("India",     TipoCardenal.DIACONO,    "1011", "Anil Thomas",     81));
        controlador.agregarCardenal(new Cardenal("Nigeria",   TipoCardenal.OBISPO,     "1012", "Emeka Obi",       80));
        controlador.iniciar();
    }
}