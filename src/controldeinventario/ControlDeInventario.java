package controldeinventario;
import dominio.*;
import interfaz.*;

public class ControlDeInventario {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaInicial vent = new VentanaInicial(sistema);
        vent.setVisible(true);
    }
    
}
