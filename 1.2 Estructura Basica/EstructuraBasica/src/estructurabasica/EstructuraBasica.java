/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurabasica;

/**
 *
 * @author walbe
 */
public class EstructuraBasica {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre = "María";
        int edad = 28;
        double salarioMensual = 45000.50;
        boolean esEmpleadoActivo = true;

        // Operaciones
        double salarioAnual = salarioMensual * 12;
        int edadProximoAño = edad + 1;

        // Salida de datos
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad actual: " + edad);
        System.out.println("Edad próximo año: " + edadProximoAño);
        System.out.println("Salario mensual: $" + salarioMensual);
        System.out.println("Salario anual: $" + salarioAnual);
        System.out.println("¿Es empleado activo? " + esEmpleadoActivo);
    }
}
