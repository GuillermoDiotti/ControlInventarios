package dominio;

public class Funcionario {
    private String nombreFuncionario;
    private int edadFuncionario;
    private int numFuncionario;

    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    public void setNombreFuncionario(String nombreFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
    }

    public int getEdadFuncionario() {
        return edadFuncionario;
    }

    public void setEdadFuncionario(int edadFuncionario) {
        this.edadFuncionario = edadFuncionario;
    }

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    public Funcionario(String nombreFuncionario, int edadFuncionario, int numFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
        this.edadFuncionario = edadFuncionario;
        this.numFuncionario = numFuncionario;
    }

    @Override
    public String toString() {
        return nombreFuncionario;
    }
    
}
