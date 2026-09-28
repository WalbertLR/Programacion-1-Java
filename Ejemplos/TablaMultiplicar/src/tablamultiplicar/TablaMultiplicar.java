/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicar;

/**
 *
 * @author walbe
 */
/* Programa que lea un número entero N y muestre la tabla de multiplicar de ese número. */
import java.util.*;
public class TablaMultiplicar {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n;
 System.out.print("Introduce un número entero: ");
 n = sc.nextInt();
 System.out.println("Tabla del " + n);
 for(int i = 1; i<=10; i++){
 System.out.println(n + " * " + i + " = " + n*i);
 }
 }
}
