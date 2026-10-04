/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author walbe
 */
public class OperadorTernario {
    public static void main(String[] args) {
        int edad = 17;

        // Forma tradicional
        String mensaje1;
        if (edad >= 18) {
            mensaje1 = "Mayor de edad";
        } else {
            mensaje1 = "Menor de edad";
        }

        // Forma compacta con operador ternario
        String mensaje2 = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println(mensaje2);

        // Otro ejemplo en operaciones
        int precio = 100;
        double precioFinal = (precio > 50) ? precio * 0.9 : precio;
        System.out.println("Precio final: $" + precioFinal);
    }
}