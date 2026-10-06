/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompararNumeros;

/**
 *
 * @author walbe
 */
import java.util.Scanner;
public class compararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        scanner.close();
    
}
}