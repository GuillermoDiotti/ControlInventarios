package dominio;

import java.io.Serializable;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Sistema implements Serializable{
    
    private ElementoObservable obs;
    private ArrayList<Articulo> listaArticulos;//lista de articulos
    private ArrayList<Funcionario> listaFuncionarios;//lista de funcionarios
    private ArrayList<Dron> listaDrones;//lista de drones
    private ArrayList<Carga[][]> listaCargas;//lista de matrices tomando como largo la cantidad de areas. En cada posicion de la lista se encuentra una martiz de objetos carga
    private ArrayList<Dron> listaDronesConVuelos = new ArrayList<>();//lista de drones con vuelos
    private ArrayList<Dron> listaDronesSinVuelos = new ArrayList<>();//lista de drones sin vuelos
    private ArrayList<Vuelos> listaVueloDron = new ArrayList();//lista de vuelos
    
    public ArrayList<Vuelos> getListaVueloDron(){
        return this.listaVueloDron;
    }
    
    public void agregarVueloNuevo(Vuelos vuelo){
        this.listaVueloDron.add(vuelo);
    }
    
    public void agregarVueloExistente(Vuelos vuelo){
        //si el dron ya existe en la lista de vuelos, en la posicion de dicho dron, se agrega un detalle en la lista de detalles de esa posicion
        //la lista del vuelo a ingresar, siempre viene de a 1 detalle, por eso .get(0)
        for (int i = 0; i < listaVueloDron.size(); i++) {
            if (listaVueloDron.get(i).getDron().equals(vuelo.getDron()) ){
                listaVueloDron.get(i).agregarDetalleVuelo(vuelo.getListaDetalles().get(0));
            }
        }
    }
    
    public void limpiarTabla(JTable tabla){
        //saca la cantidad de filas que tenga la tabla
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas = tabla.getRowCount();
            for (int i = 0; i < filas; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    public void agregarDronConVuelos(Dron d){
        //agrega el dron a la lista de drones con vuelos, y lo saca de la de drones sin vuelos
        listaDronesConVuelos.add(d);
        listaDronesSinVuelos.remove(d);
        obs.notificar();
    }
    
    public void agregarDronSinVuelos(Dron d){
        listaDronesSinVuelos.add(d);
        obs.notificar();
    }
    
    public ArrayList<Dron> getListaDronesConVuelos(){
        return this.listaDronesConVuelos;
    }
    
    public ArrayList<Dron> getListaDronesSinVuelos(){
        return this.listaDronesSinVuelos;
    }
    
    public ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public ArrayList<Dron> getListaDrones() {
        return listaDrones;
    }

    public ArrayList<Carga[][]> getListaCargas() {
        return this.listaCargas;
    }

    public ArrayList<Carga[][]> prepararCargas() {
        //dimensionar las martices de la lista segun las dimensiones de los botones (12 x 10)
        //cada posicion de la lista corresponde a un area
        ArrayList<Carga[][]> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lista.add(new Carga[12][10]);

        }
        return lista;
    }

    public Sistema() {
        this.listaArticulos = new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
        this.listaDrones = new ArrayList<>();
        this.listaCargas = prepararCargas();
        obs = new ElementoObservable();
        
        listaFuncionarios.add( new Funcionario("Mario", 22, 400) );
        listaFuncionarios.add( new Funcionario("Paolo", 42, 666) );
        listaFuncionarios.add( new Funcionario("Melina", 18, 777) );
        listaArticulos.add( new Articulo( "Lapiz", "Japones" ) );
        listaArticulos.add( new Articulo( "Bufanda", "Roja" ) );
        listaArticulos.add( new Articulo( "Remera", "Negra" ) );
        listaDrones.add(new Dron("125","ddddd",6));
        listaDronesSinVuelos.add(listaDrones.get(0));

    }
    
    public void agregarCargas(ArrayList<Carga[][]> listaCargas) {
        this.listaCargas = listaCargas;
        obs.notificar();
    }

    public void agregarArticulo(Articulo unArticulo) {
        this.listaArticulos.add(unArticulo);
        obs.notificar();
    }

    public void agregarFuncionario(Funcionario unFuncionario) {
        this.listaFuncionarios.add(unFuncionario);
        obs.notificar();
    }

    public void agregarDron(Dron unDron) {
        this.listaDrones.add(unDron);
        obs.notificar();
    }

    public boolean nombreArticuloRepetido(String nombre) {
        //verificar si el nombre se repite
        boolean res = false;
        for (int i = 0; i < getListaArticulos().size(); i++) {
            if (getListaArticulos().get(i).getNombreArticulo().equals(nombre)) {
                res = true;
            }
        }
        return res;
    }

    public boolean identificacionDronRepetido(String id) {
        //verificar si la descripcion se repite
        boolean res = false;
        for (int i = 0; i < getListaDrones().size(); i++) {
            if (getListaDrones().get(i).getIdentificacionDron().equals(id)) {
                res = true;
            }
        }
        return res;
    }

    public boolean numFuncionarioRepetido(int num) {
        //verificar si el numero se repite
        boolean res = false;
        for (int i = 0; i < getListaFuncionarios().size(); i++) {
            if (getListaFuncionarios().get(i).getNumFuncionario() == num) {
                res = true;
            }
        }
        return res;
    }

    public boolean esEntero(String var, String elem) {
        //verificar si la variable es un entero
        boolean res = true;
        try {
            int dato = Integer.parseInt(var);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + elem + " debe ser un entero",
                    "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            res = false;
        }
        return res;
    }

    public boolean codCargaRepetido(int pos, int cod) {
        //verificar si el codigo se repite
        boolean res = false;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                if ((getListaCargas().get(pos)[i][j] != null)) {
                    if ((getListaCargas().get(pos)[i][j] != null) && getListaCargas().get(pos)[i][j].getCodigo() == cod) {
                        res = true;
                    }
                }
            }
        }
        return res;
    }
    
    public void addObserver(Object obj){
        obs.addObserver((Observer)obj);
    }
}
