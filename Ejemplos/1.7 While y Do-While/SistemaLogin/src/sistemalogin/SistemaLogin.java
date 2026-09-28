/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemalogin;

/**
 *
 * @author walbe
 */
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String contraseñaCorrecta = "1234";
        int intentosMaximos = 3;
        int intentos = 0;
        boolean accesoConcedido = false;

        System.out.println("=== SISTEMA DE LOGIN ===");

        while (intentos < intentosMaximos && !accesoConcedido) {
            intentos++;
            System.out.println("\nIntento " + intentos + " de " + intentosMaximos);

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                accesoConcedido = true;
                System.out.println("\n✓ Acceso concedido. ¡Bienvenido!");
            } else {
                System.out.println("✕ Credenciales incorrectas.");
                if (intentos < intentosMaximos) {
                    System.out.println("Intente nuevamente.");
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("\n✕ Cuenta bloqueada por exceso de intentos.");
        }

        scanner.close();
    }
}