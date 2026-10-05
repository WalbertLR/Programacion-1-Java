/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Plan {
    
    //Atributos privados
    private int minutosIncluidos;
    private double datosIncluidosGb;
    private double precioMensual;
    
    //Constructor
    public Plan(int minutosIncluidos, double datosIncluidosGb, double precioMensual){
        this.minutosIncluidos = minutosIncluidos;
        this.datosIncluidosGb = datosIncluidosGb;
        this.precioMensual = precioMensual;
    }
    
    
    //Getters u setters
    public int getMinutosIncluidos() {return minutosIncluidos;}
    public void setMinutosIncluidos (int minutosIncluidos) {this.minutosIncluidos = minutosIncluidos;}
    
    public double getDatosIncluidosGb() { return datosIncluidosGb; }
    public void setDatosIncluidosGb(double datosIncluidosGb) { this.datosIncluidosGb = datosIncluidosGb; }

    public double getPrecioMensual() { return precioMensual; }
    public void setPrecioMensual(double precioMensual) { this.precioMensual = precioMensual; }
}
