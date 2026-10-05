/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Calculadora calc = new Calculadora();

        // Pruebas con 2 parámetros
        System.out.println("Suma (2 params): " + calc.sumar(5, 3));
        System.out.println("Resta (2 params): " + calc.restar(10, 4));
        System.out.println("Multiplicación (2 params): " + calc.multiplicar(6, 7));
        System.out.println("División (2 params): " + calc.dividir(20, 4));

        // Pruebas con 3 parámetros
        System.out.println("Suma (3 params): " + calc.sumar(5, 3, 2));
        System.out.println("Resta (3 params): " + calc.restar(10, 4, 2));
        System.out.println("Multiplicación (3 params): " + calc.multiplicar(2, 3, 4));

        // Pruebas con 4 parámetros
        System.out.println("Suma (4 params): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4 params): " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicación (4 params): " + calc.multiplicar(2, 2, 2, 2));
    }
    
}
