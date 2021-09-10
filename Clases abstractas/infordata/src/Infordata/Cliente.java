package Infordata;

public class Cliente {
    private String dni;
    private int telefono;
    private String domicilio;

    public Cliente(String dni, int telefono, String domicilio) {
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
