package Infordata;
import interfaces.IReseteable;

import java.util.Date;


public class Cpu extends Tecnologico implements IReseteable {
    private int memoriaPrincipal;

    public Cpu(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPrincipal){
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.memoriaPrincipal=memoriaPrincipal;

    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public void reset() {
        System.out.println("Reseteando cpu ..");
    }

    @Override
    public void estado() {
        System.out.println("Años de usi: " +12);
    }
}
