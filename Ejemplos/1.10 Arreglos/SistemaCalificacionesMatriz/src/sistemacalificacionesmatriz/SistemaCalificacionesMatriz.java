/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacalificacionesmatriz;

/**
 *
 * @author walbe
 */
public class SistemaCalificacionesMatriz {
    public static void main(String[] args) {
        String[] estudiantes = {"Ana", "Carlos", "Marta", "Juan"};
        String[] materias = {"Matemáticas", "Física", "Química"};

        double[][] notas = {
            {85.5, 90.0, 88.5}, // Ana
            {78.0, 82.5, 80.0}, // Carlos
            {92.0, 95.5, 93.0}, // Marta
            {88.5, 86.0, 87.5}  // Juan
        };

        System.out.println("=== REPORTE DE CALIFICACIONES ===");

        // Encabezados
        System.out.printf("%-12s", "Estudiante");
        for (String materia : materias) {
            System.out.printf("%-15s", materia);
        }
        System.out.printf("%-10s%n", "Promedio");

        // Notas por estudiante
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%-12s", estudiantes[i]);
            double suma = 0;

            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%-15.1f", notas[i][j]);
                suma += notas[i][j];
            }

            double promedio = suma / notas[i].length;
            System.out.printf("%-10.1f%n", promedio);
        }

        // Promedio por materia
        System.out.println("\n" + "-".repeat(57));
        System.out.printf("%-12s", "Promedio");

        for (int j = 0; j < materias.length; j++) {
            double sumaMateria = 0;
            for (int i = 0; i < notas.length; i++) {
                sumaMateria += notas[i][j];
            }
            double promedioMateria = sumaMateria / notas.length;
            System.out.printf("%-15.1f", promedioMateria);
        }
        System.out.println();
    }
}
