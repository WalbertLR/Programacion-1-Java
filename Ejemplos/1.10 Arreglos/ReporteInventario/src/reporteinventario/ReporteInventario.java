/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reporteinventario;

/**
 *
 * @author walbe
 */
public class ReporteInventario {
    public static void main(String[] args) {
        // Arreglos paralelos para productos
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Impresora"};
        int[] stock = {10, 50, 30, 15, 8};
        double[] precios = {899.99, 19.90, 49.99, 299.99, 199.99};

        // Calcular valor total del inventario
        double valorTotal = 0;
        int totalProductos = 0;

        System.out.println("=== REPORTE DE INVENTARIO ===");
        System.out.printf("%-15s %-10s %-10s %-12s%n", "Producto", "Stock", "Precio", "Valor Total");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < productos.length; i++) {
            double valorSubtotal = stock[i] * precios[i];
            valorTotal += valorSubtotal;
            totalProductos += stock[i];

            System.out.printf("%-15s %-10d $%-9.2f $%-11.2f%n", 
                              productos[i], stock[i], precios[i], valorSubtotal);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Total de productos: " + totalProductos);
        System.out.printf("Valor total del inventario: $%.2f%n", valorTotal);
    }
}
