/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

/**
 *
 * @author walbe
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 7;

        System.out.println("=== Tabla del " + numero + " ===");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
