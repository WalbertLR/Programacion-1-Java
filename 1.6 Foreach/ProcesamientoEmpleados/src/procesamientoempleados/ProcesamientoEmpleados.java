/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesamientoempleados;

/**
 *
 * @author walbe
 */
public class ProcesamientoEmpleados {
    public static void main(String[] args) {
        String[] empleados = {
            "Ana García",
            "Carlos Ruiz",
            "María López",
            "Pedro Gomez",
            "Lucy Fernandez"
        };

        System.out.println("=== LISTA DE EMPLEADOS ACTIVOS ===");

        int id = 1;
        for (String empleado : empleados) {
            String[] partes = empleado.split(" ");
            String iniciales = "" + partes[0].charAt(0) + 
                                (partes.length > 1 ? partes[1].charAt(0) : "");

            String codigo = String.format("EMP-%03d", id);
            System.out.println("ID: " + codigo);
            System.out.println("Nombre: " + empleado);
            System.out.println("Iniciales: " + iniciales);
            System.out.println("---");

            id++;
        }

        System.out.println("Total de empleados: " + empleados.length);
    }
}