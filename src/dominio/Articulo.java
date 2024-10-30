package dominio;

import java.util.*;

public class Articulo{
    private String nombreArticulo;
    private String descripcionArticulo;

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public Articulo(String nombreArticulo, String descripcionArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.descripcionArticulo = descripcionArticulo;
    }

    @Override
    public String toString() {
        return nombreArticulo;
    }
    
    
}
