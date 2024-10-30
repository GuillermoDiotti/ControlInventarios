package dominio;

public class Carga {
    
    private int codigo;
    private Articulo articulo;
    private int cantidad;
    private Funcionario funcionario;

    
    public void setCodigo(int c ){
        this.codigo = c;
    }
    
    public void setArticulo( Articulo a ){
        this.articulo = a;
    }
    
    public void setCantidad( int can ){
        this.cantidad = can;
    }
    
    public void setFuncionario( Funcionario f ){
        this.funcionario = f;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public Articulo getArticulo(){
        return this.articulo;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public Funcionario getFuncionario(){
        return this.funcionario;
    }
    
    public Carga(int cod, Articulo art, int cant, Funcionario func ){   
        setCodigo(cod);
        setArticulo(art);
        setCantidad(cant);
        setFuncionario(func);
    }
    

    @Override
    public String toString() {
        return "Carga{" + ", codigo=" + codigo + ", articulo=" + articulo + ", cantidad=" + cantidad + ", funcionario=" + funcionario + '}';
    }
    
}
