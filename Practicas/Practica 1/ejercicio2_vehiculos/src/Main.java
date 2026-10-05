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
        System.out.println("SISTEMA DE VEHÍCULOS \n");

        // 1. Probando la sobrecarga de constructores
        System.out.println("Instanciando vehículos con diferentes constructores:");

        Vehiculo auto1 = new Vehiculo(); // Constructor por defecto
        System.out.println("Auto 1: " + auto1.getMarca() + " - " + auto1.getPlaca());

        Vehiculo auto2 = new Vehiculo("ABC-123", "Toyota"); // Constructor básico
        System.out.println("Auto 2: " + auto2.getMarca() + " " + auto2.getModelo() + " - " + auto2.getPlaca());

        Vehiculo auto3 = new Vehiculo("XYZ-987", "Honda", "Civic"); // Constructor completo
        System.out.println("Auto 3: " + auto3.getMarca() + " " + auto3.getModelo() + " - " + auto3.getPlaca());


        // 2. Probando la sobrecarga de métodos con el Auto 3
        System.out.println("Calculando mantenimientos para el " + auto3.getMarca() + " " + auto3.getModelo() + ":");

        // Llamada al método 1 (Sin parámetros)
        double costoBasico = auto3.calcularMantenimiento();
        System.out.println("- Mantenimiento básico (solo revisión): $" + costoBasico);

        // Llamada al método 2 (Con kilometraje)
        double costoPorKm = auto3.calcularMantenimiento(15000.0);
        System.out.println("- Mantenimiento por 15,000 km: $" + costoPorKm);

        // Llamada al método 3 (Con kilometraje y tipo de servicio)
        double costoPremium = auto3.calcularMantenimiento(15000.0, "Premium");
        System.out.println("- Mantenimiento por 15,000 km + Servicio Premium: $" + costoPremium);
    }
}
