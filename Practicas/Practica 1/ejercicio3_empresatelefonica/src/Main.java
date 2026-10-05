/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SISTEMA DE FACTURACIÓN TELEFÓNICA \n");

        // 1. Crear un plan (Ej: 500 minutos, 10 GB, por $800 al mes)
        Plan planPostPago = new Plan(500, 10.0, 800.0);

        // 2. Crear un cliente asociado a ese plan
        Cliente cliente1 = new Cliente("María Rodríguez", "809-555-1234", planPostPago);

        // 3. Generar factura simulando un consumo que excede el plan (600 minutos y 12 GB)
        Factura factura1 = new Factura(cliente1, 600, 12.0);
        factura1.generarFactura();
    }
    
}
