package dominio;

public class Dron {
    private String identificacionDron;
    private String modeloDron;
    private int tipoCamaraDron;

    public String getIdentificacionDron() {
        return this.identificacionDron;
    }

    public void setIdentificacionDron(String identificacionDron) {
        this.identificacionDron = identificacionDron;
    }

    public String getModeloDron() {
        return this.modeloDron;
    }

    public void setModeloDron(String modeloDron) {
        this.modeloDron = modeloDron;
    }

    public int getTipoCamaraDron() {
        return this.tipoCamaraDron;
    }

    public void setTipoCamaraDron(int tipoCamaraDron) {
        this.tipoCamaraDron = tipoCamaraDron;
    }

    public Dron(String identificacionDron, String modeloDron, int tipoCamaraDron) {
        this.identificacionDron = identificacionDron;
        this.modeloDron = modeloDron;
        this.tipoCamaraDron = tipoCamaraDron;
    }

    @Override
    public String toString() {
        return getIdentificacionDron();
    }
    
    
}
