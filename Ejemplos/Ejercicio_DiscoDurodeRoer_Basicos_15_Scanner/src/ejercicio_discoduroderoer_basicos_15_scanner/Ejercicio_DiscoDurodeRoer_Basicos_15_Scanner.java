/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_discoduroderoer_basicos_15_scanner;

/**
 *
 * @author walbe
 */
/* Programa que lee los números del teclado mientras sean mayor a cero */
import java.util.Scanner;
public class Ejercicio_DiscoDurodeRoer_Basicos_15_Scanner {
 public static void main(String[] args) {
 int codigo;
 Scanner sc = new Scanner(System.in);
 do{
 System.out.println("Introduce un numero mayor que 0");
 codigo=sc.nextInt();
 }while(codigo<=0);
 System.out.println(codigo);
 }
}
