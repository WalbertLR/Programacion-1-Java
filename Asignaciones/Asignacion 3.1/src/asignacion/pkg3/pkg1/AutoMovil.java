/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion.pkg3.pkg1;

/**
 *
 * @author walbe
 */
public class AutoMovil {
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    public AutoMovil(){
        System.out.println("Constructor de AutoMovil");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void encender() {
        System.out.println("El automovil esta encendido...");
    }
    
    public void apagar() {
        System.out.println("El automovil esta apagado...");
    }
    
    public void acelerar() {
        System.out.println("El automovil esta acelerando...");
    }
    
    public void frenar() {
        System.out.println("El automovil esta acelerando...");
    }
    
}
