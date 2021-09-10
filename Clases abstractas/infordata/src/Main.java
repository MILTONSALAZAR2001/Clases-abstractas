import Infordata.Impresora;
import Infordata.Monitor;
import Infordata.Producto;

public class Main {
    public static void main(String[] args) {
        //Polimorfismo
        Producto s4150 = new Impresora("333","4150",30);
        Impresora impresora =(Impresora) s4150;
        //System.out.println(impresora);
        Monitor samsung24 = new Monitor("s24","Samsung",20,"1080p");
        samsung24.estado();
        //System.out.println(samsung24);
        //System.out.println(s4150);

        Monitor monitor = (Monitor) samsung24;
        //System.out.println(monitor);
        samsung24.reset();

    }
}
