/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaciondatos;

/**
 *
 * @author walbe
 */
public class ValidacionDatos {

    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 18) {
            throw new IllegalArgumentException("El empleado debe ser mayor de 18 años");
        }
        if (edad > 65) {
            throw new IllegalArgumentException("El empleado supera la edad de retiro");
        }
    }

    public static void validarSalario(double salario) throws IllegalArgumentException {
        if (salario <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor que cero");
        }
        if (salario < 1000) {
            throw new IllegalArgumentException("El salario es inferior al mínimo legal");
        }
    }

    public static void validarEmail(String email) throws IllegalArgumentException {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El correo electrónico no es válido");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("=== REGISTRO DE EMPLEADO ===");

            String nombre = "Juan Pérez";
            String edadTexto = "30";
            int edad = Integer.parseInt(edadTexto);
            String email = "juan@empresa.com";
            double salario = 2500.0;

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Email: " + email);
            System.out.println("Salario mensual: " + salario);

            validarEdad(edad);
            validarEmail(email);
            validarSalario(salario);

            System.out.println("\n✓ Empleado registrado exitosamente");

        } catch (NumberFormatException e) {
            System.out.println("\nError de formato: La edad debe ser un número entero");
        } catch (IllegalArgumentException e) {
            System.out.println("\nError de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nError inesperado: " + e.getMessage());
        }
    }
}
