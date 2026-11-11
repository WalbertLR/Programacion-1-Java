/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
/**
 * Clase encargada de las conversiones de unidades de temperatura con redondeo a 2 decimales.
 */
public class ConversorTemperatura {
    
    public double FahrenheitaCelsius(double temperatura){
        
        double resultado = (temperatura - 32) * (5.0/9.0);
        return Math.round(resultado * 100.0) / 100.0;
        
    }
    
    public double CelsiusaFahrenheit(double temperatura){
        double resultado = (temperatura * (9.0/5.0)) + 32;
        return Math.round(resultado * 100.0) / 100.0;
    }
    
}
