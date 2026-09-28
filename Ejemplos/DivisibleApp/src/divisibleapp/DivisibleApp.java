/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisibleapp;

/**
 *
 * @author walbe
 */
import java.util.Scanner;
public class DivisibleApp {

 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Introduce un numero");
 int numero=sc.nextInt();
 //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
 if (numero%2==0){
 System.out.println("El numero "+numero+" es divisible entre 2");
 }else{
 System.out.println("El numero "+numero+" no es divisible entre 2");
 }
 }
}
