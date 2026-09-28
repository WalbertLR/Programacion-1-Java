/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisistemperaturas;

/**
 *
 * @author walbe
 */
public class AnalisisTemperaturas {
    public static void main(String[] args) {
        // Temperaturas de la semana (en Celsius)
        double[] temperaturas = {22.5, 24.0, 21.8, 23.5, 25.2, 26.0, 23.8};
        String[] dias = {"Lun", "Mar", "Mié", "Jue", "Vie", "Sáb", "Dom"};

        // Calcular estadísticas
        double suma = 0;
        double max = temperaturas[0];
        double min = temperaturas[0];
        int diaMax = 0;
        int diaMin = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];

            if (temperaturas[i] > max) {
                max = temperaturas[i];
                diaMax = i;
            }

            if (temperaturas[i] < min) {
                min = temperaturas[i];
                diaMin = i;
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("=== ANÁLISIS SEMANAL DE TEMPERATURAS ===");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%s: %.1f°C %s%n", 
                              dias[i], 
                              temperaturas[i], 
                              (temperaturas[i] > promedio ? "↑ (sobre promedio)" : "↓ (bajo promedio)"));
        }

        System.out.println("\n--- ESTADÍSTICAS ---");
        System.out.printf("Temperatura promedio: %.1f°C%n", promedio);
        System.out.printf("Temperatura máxima: %.1f°C (%s)%n", max, dias[diaMax]);
        System.out.printf("Temperatura mínima: %.1f°C (%s)%n", min, dias[diaMin]);
    }
}
