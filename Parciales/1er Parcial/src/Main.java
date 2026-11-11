/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calculadora = new CalculadoraMatematica();

        int opcionMenu;

        do {

            System.out.println("===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Ingresar números");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.println("Seleccione una opción: ");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingresa el primer numero");
                    double num1 = sc.nextDouble();
                    System.out.println("Ingresa el primer numero");
                    double num2 = sc.nextDouble();

                    calculadora.asignarNumeros(num1, num2);
                    System.out.println("Numeros guardados correctamente");
                    break;
                case 2:
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;

                case 3:
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;
                case 4:
                    System.out.println("Resultado de la multiplicacion: " + calculadora.multiplicar());
                    break;

                case 5:
                    double resultadoDivision = calculadora.division();
                    if(resultadoDivision != 0.0 || calculadora.getNumero1() == 0){
                        System.out.println("Resultado de la division: " + resultadoDivision);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa.....");

                    break;

                default:
                    System.out.println("Ingresa una opcion valida");
            }

        } while (opcionMenu != 0);
        sc.close();
    }

}
