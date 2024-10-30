package dominio;
import java.util.ArrayList;

public class Vuelos {

    private Dron dron;
    private ArrayList<String> listaDetalles = new ArrayList<>();//lista de detalles de los vuelos
    
    public Vuelos( Dron d, String txt ){
        setDron( d );
        listaDetalles.add(txt);
    }
    
    public void setDron ( Dron d ){
        this.dron = d;
    }
    
    public Dron getDron(){
        return this.dron;
    }
    
    public ArrayList<String> getListaDetalles(){
        return this.listaDetalles;
    }
    
    public void agregarDetalleVuelo( String dato ){
        this.listaDetalles.add(dato);
    }
    
}
