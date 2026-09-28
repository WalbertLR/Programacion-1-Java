/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionproductos;

/**
 *
 * @author walbe
 */
public class GestionProductos {

    public static double calcularPrecioConIVA(double precioBase, double porcentajeIVA) {
        return precioBase * (1 + (porcentajeIVA / 100));
    }

    public static double aplicarDescuento(double precio, double porcentajeDescuento) {
        return precio * (1 - (porcentajeDescuento / 100));
    }

    public static boolean verificarStock(int stockActual, int cantidadSolicitada) {
        return stockActual >= cantidadSolicitada;
    }

    public static double calcularTotalVenta(double precioBase, int cantidad, double porcentajeDescuento) {
        double subtotal = precioBase * cantidad;
        double totalConDescuento = aplicarDescuento(subtotal, porcentajeDescuento);
        return calcularPrecioConIVA(totalConDescuento, 18.0);
    }

    public static String generarCodigoProducto(String categoria, int id) {
        String prefijo = categoria.substring(0, 3).toUpperCase();
        return String.format("%s%05d", prefijo, id);
    }

    public static void main(String[] args) {
        String producto = "Laptop";
        String categoria = "Electrónica";
        int id = 123;
        double precioBase = 800.0;
        int stock = 15;
        double iva = 18.0;
        double descuento = 10.0;

        String codigo = generarCodigoProducto(categoria, id);
        double precioConIVA = calcularPrecioConIVA(precioBase, iva);
        boolean disponible = verificarStock(stock, 3);

        System.out.println("=== INFORMACIÓN DEL PRODUCTO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Producto: " + producto);
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Precio con IVA: $" + precioConIVA);
        System.out.println("Stock disponible: " + stock);

        System.out.println("\n=== VENTA ===");
        System.out.println("Cantidad: 3");
        System.out.println("Descuento: " + descuento + "%");

        if (disponible) {
            double total = calcularTotalVenta(precioBase, 3, descuento);
            System.out.println("TOTAL: $" + total);
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }
}