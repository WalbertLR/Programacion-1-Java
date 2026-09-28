/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisventas;

/**
 *
 * @author walbe
 */
public class AnalisisVentas {
    public static void main(String[] args) {
        double[] ventasMensuales = {
            15000, 18000, 12000, 22000, 19000,
            21000, 25000, 23000, 20000, 24000,
            28000, 30000
        };

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double totalVentas = 0;
        double ventaMaxima = ventasMensuales[0];
        double ventaMinima = ventasMensuales[0];
        String mesMaximo = "";
        String mesMinimo = "";

        int indice = 0;
        for (double venta : ventasMensuales) {
            totalVentas += venta;

            if (venta > ventaMaxima) {
                ventaMaxima = venta;
                mesMaximo = meses[indice];
            }

            if (venta < ventaMinima) {
                ventaMinima = venta;
                mesMinimo = meses[indice];
            }

            indice++;
        }

        double promedioMensual = totalVentas / ventasMensuales.length;

        System.out.println("=== REPORTE ANUAL DE VENTAS ===");
        System.out.println("Total ventas: $" + totalVentas);
        System.out.println("Promedio mensual: $" + promedioMensual);
        System.out.println("Mes con mayores ventas: " + mesMaximo + " ($" + ventaMaxima + ")");
        System.out.println("Mes con menores ventas: " + mesMinimo + " ($" + ventaMinima + ")");
    }
}