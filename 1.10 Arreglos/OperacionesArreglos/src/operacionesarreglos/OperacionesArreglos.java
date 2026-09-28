/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesarreglos;

/**
 *
 * @author walbe
 */
import java.util.Arrays;

public class OperacionesArreglos {

    public static void invertirArreglo(int[] arr) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {15, 8, 23, 42, 7, 16, 31};

        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        // Copiar arreglo
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        System.out.println("Copia del arreglo: " + Arrays.toString(copia));

        // Ordenar
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // Invertir
        invertirArreglo(numeros);
        System.out.println("Arreglo invertido: " + Arrays.toString(numeros));

        // Buscar elementos (debe estar ordenado previamente)
        Arrays.sort(numeros);
        int posicion = Arrays.binarySearch(numeros, 23);
        System.out.println("\nElemento 23 encontrado en posición " + posicion);

        // Llenar arreglo
        int[] llenado = new int[5];
        Arrays.fill(llenado, 10);
        System.out.println("\nArreglo llenado: " + Arrays.toString(llenado));

        // Comparar arreglos
        boolean iguales = Arrays.equals(copia, copia);
        System.out.println("\n¿Los arreglos son iguales? " + iguales);
    }
}
