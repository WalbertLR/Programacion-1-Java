/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventarioproductos;

/**
 *
 * @author walbe
 */
public class InventarioProductos {
    public static void main(String[] args) {
        String[] productos = {
            "Laptop Dell",
            "Mouse Logitech",
            "Teclado Mecánico",
            "Monitor Samsung",
            "Webcam HD"
        };

        double[] precios = {899.99, 29.99, 89.99, 299.99, 79.99};

        System.out.println("=== CATÁLOGO DE PRODUCTOS ===");

        int contador = 0;
        double valorTotal = 0;

        for (String producto : productos) {
            double precio = precios[contador];
            valorTotal += precio;
            System.out.println((contador + 1) + ". " + producto + " - $" + precio);
            contador++;
        }

        System.out.println("\nValor total del inventario: $" + valorTotal);
        System.out.println("Cantidad de productos: " + productos.length);
    }
}