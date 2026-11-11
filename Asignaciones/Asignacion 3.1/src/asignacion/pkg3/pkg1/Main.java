/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion.pkg3.pkg1;

/**
 *
 * @author walbe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAño(2023);
        auto.setColor("Blanco");

        System.out.println("Marca: " + auto.getMarca());
        auto.encender();
        auto.acelerar();

        System.out.println("\n--- Honda Civic ---");
      
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAño(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        honda.encender(); 
        honda.acelerar();
    }
}
    

