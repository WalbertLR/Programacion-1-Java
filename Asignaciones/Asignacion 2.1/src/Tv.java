/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Tv {
    
    private String marca;
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void getMarca(){
        System.out.println("Marca: "+marca);
    }
    
    private int pulgadas;
    
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }
    
    public void getPulgadas(){
        System.out.println("Pulgadas: " + pulgadas);
    }
    
    private boolean encendido;
    
    
    public void getEncendido(){
        System.out.println(encendido);
    }
    
    private int volumen;
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
    public void getVolumen(){
        System.out.println("Volumen: " + volumen);
    }
    
    public void encender(){
        System.out.println("La TV se está encendiendo...");
        encendido = true;
    }
    
    public void apagar(){
        System.out.println("La TV se está apagando...");
        encendido = false;
    }
    
    public void subirVolumen(){
        System.out.println("Subiendo el volumen...");
        this.volumen ++;
    }
    
    public void bajarVolumen(){
        System.out.println("Bajando el volumen...");
        this.volumen --;
    }
}
