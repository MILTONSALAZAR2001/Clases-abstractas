package Infordata;

import interfaces.IReseteable;

import java.util.Date;

public abstract class Tecnologico extends Producto implements IReseteable {
    protected String paisOrigen;
    protected Date fechaFabricacion;
    protected Empresa fabricante;
   public  Tecnologico(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante){
       super(codigo, modelo);
       this.paisOrigen = paisOrigen;
       this.setFechaFabricacion(fechaFabricacion);
       this.setFabricante(fabricante);

   }
   public String getPaisOrigen(){
       return paisOrigen;
   }
   public void setPaisOrigen(String peloOrigen){
       this.paisOrigen = peloOrigen;
   }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public void reset() {
        System.out.println("reseteando producto...");
    }
}