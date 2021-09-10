package Infordata;

import interfaces.IReseteable;

public abstract class Alquiler extends  Producto  {
    protected double precioHora;
    public  Alquiler(String codigo, String modelo, double precioHora){
        super(codigo, modelo);
        this.setPrecioHora(precioHora);

    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }


    }

