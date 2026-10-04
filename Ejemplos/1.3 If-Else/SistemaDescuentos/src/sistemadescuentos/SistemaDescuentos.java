/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadescuentos;

/**
 *
 * @author walbe
 */
public class SistemaDescuentos {
    public static void main(String[] args) {
        double totalCompra = 1500.00;
        String tipoCliente = "VIP"; // "Regular", "Premium", "VIP"
        double descuento = 0;

        // Descuento por monto
        if (totalCompra >= 2000) {
            descuento = 0.20; // 20%
        } else if (totalCompra >= 1000) {
            descuento = 0.15; // 15%
        } else if (totalCompra >= 500) {
            descuento = 0.10; // 10%
        }

        // Descuento adicional por tipo de cliente
        if (tipoCliente.equalsIgnoreCase("VIP")) {
            descuento += 0.05; // 5% adicional
        } else if (tipoCliente.equalsIgnoreCase("Premium")) {
            descuento += 0.03; // 3% adicional
        }

        double montoDescuento = totalCompra * descuento;
        double totalAPagar = totalCompra - montoDescuento;

        System.out.println("=== DETALLE DE COMPRA ===");
        System.out.println("Subtotal: $" + totalCompra);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto descontado: $" + montoDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalAPagar);
    }
}
