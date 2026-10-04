/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Tv {
    
    private String Marca;
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    
    public void getMarca(){
        System.out.println("Marca: "+Marca);
    }
    
    private int Pulgadas;
    
    public void setPulgadas(int Pulgadas){
        this.Pulgadas = Pulgadas;
    }
    
    public void getPulgadas(){
        System.out.println("Pulgadas: " + Pulgadas);
    }
    
    private boolean Encendido;
    
    
    public void getEncendido(){
        System.out.println(Encendido);
    }
    
    private int Volumen;
    
    public void setVolumen(int Volumen){
        this.Volumen = Volumen;
    }
    
    public void getVolumen(){
        System.out.println("Volumen: " + Volumen);
    }
    
    public void encender(){
        System.out.println("La TV se está encendiendo...");
        Encendido = true;
    }
    
    public void apagar(){
        System.out.println("La TV se está apagando...");
        Encendido = false;
    }
    
    public void subirVolumen(){
        System.out.println("Subiendo el volumen...");
    }
    
    public void bajarVolumen(){
        System.out.println("Bajando el volumen...");
    }
}
