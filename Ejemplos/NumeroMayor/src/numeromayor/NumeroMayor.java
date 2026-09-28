/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;

/**
 *
 * @author walbe
 */
/* El mayor de dos numeros*/
public class NumeroMayor{
 public static void main(String[] args) {
 //Declaramos las variables
 int num1=30;
 int num2=15;
 //Hacemos la comprobación
 if (num1 == num2){
 //If anidado
 if(num1==num2){
 System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
 }else if (num1 > num2){
 System.out.println("El número "+num1+" es mayor que el número "+num2);
 }
 }else{
 System.out.println("El número "+num2+" es mayor que el número "+num1);
 }
 }
}
