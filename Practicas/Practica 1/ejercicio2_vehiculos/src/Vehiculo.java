/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Vehiculo {
    // Atributos privados
    private String placa;
    private String marca;
    private String modelo;
    
    //SOBRECARGAS CONSTRUCTORES
    
    // Constructor por defecto
    public Vehiculo(){
        this.placa = "Sin asignar";
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }
    
    // Constructor Basico
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = "No especificado";
    }
    
    // Constructor Completo
    public Vehiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // SOBRECARGA DE METODOS
    
    // Metodo 1 Mantenimiento bascio sin parametros
    
    public double calcularMantenimiento(){
        return 50.0; // Costo base generico de revision
    }
    
    // Metodo 2 Basado en el kilometraje
    public double calcularMantenimiento(double kilometraje){
        double costoBase = 50.0;
        double costoPorKm = kilometraje * 0.05; //5 centavos por kilometro
        return costoBase + costoPorKm;
    }
    
    // Metodo 3 Basado en el kilometraje y tipo de servicio
    public double calcularMantenimiento(double kilometraje, String tipoServicio){
        // Reutilizacion de la logica anterior
        double costoTotal = calcularMantenimiento(kilometraje);
        
        // Anadimos cargos extra segun el servicio
        if(tipoServicio.equalsIgnoreCase("Completo")){
            costoTotal += 150.0; //Recargo por servicio completo
        }else if(tipoServicio.equalsIgnoreCase("Premium")){
            costoTotal+= 300.0; //Recargo por servicio premium
        }
        
        return costoTotal;
        
    }
    
    // GETTERS Y SETTERS
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}
