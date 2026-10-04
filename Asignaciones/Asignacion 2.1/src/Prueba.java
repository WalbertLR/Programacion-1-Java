
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.setMarca("Samsung");
        tv1.setPulgadas(55);
        tv1.setVolumen(20);
        
        Tv tv2 = new Tv();
        tv2.setMarca("LG");
        tv2.setPulgadas(43);
        tv2.setVolumen(15);
        
        Tv tv3 = new Tv();
        tv3.setMarca("Roku");
        tv3.setPulgadas(50);
        tv3.setVolumen(25);
        
        System.out.println("=== TV 1 ===");
        
        tv1.getMarca();
        tv1.getPulgadas();
        tv1.getVolumen();
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        
        System.out.println("=== TV 2 ===");
        
        tv2.getMarca();
        tv2.getPulgadas();
        tv2.getVolumen();
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        
        System.out.println("=== TV 3 ===");
        
        tv3.getMarca();
        tv3.getPulgadas();
        tv3.getVolumen();
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
        
        
        
        
        
        
        
    }
    
}
