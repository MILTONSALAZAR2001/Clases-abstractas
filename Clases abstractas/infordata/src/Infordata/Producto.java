package Infordata;

public abstract class Producto {
    protected String codigo;
    protected String modelo;
    public Producto(String codigo, String modelo){
        this.codigo = codigo;
        this.modelo = modelo;
    }

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo){this.codigo= codigo;}
    public String getModelo(){return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    @Override
    public String toString() {
        return "Producto :" +
                "Codigo='" + codigo + '\'' +
                ", Modelo='" + modelo + '\'';
    }
    public abstract void estado();
}
