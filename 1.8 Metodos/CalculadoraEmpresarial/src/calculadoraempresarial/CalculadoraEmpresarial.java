/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraempresarial;

/**
 *
 * @author walbe
 */
public class CalculadoraEmpresarial {

    // Método para calcular salario neto
    public static double calcularSalarioNeto(double salarioBruto, double porcentajeImpuestos) {
        double impuestos = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = salarioBruto - impuestos;
        return salarioNeto;
    }

    // Método para calcular bono anual
    public static double calcularBonoAnual(double salarioBase, int mesesTrabajados) {
        if (mesesTrabajados == 12) {
            return salarioBase * 2; // 2 meses de bono
        } else if (mesesTrabajados >= 6) {
            return salarioBase * 1; // 1 mes de bono
        } else {
            return 0;
        }
    }

    // Método para mostrar desglose de nómina
    public static void mostrarDesglose(String empleado, double salarioBruto, double porcentajeImpuestos, int meses) {
        double impuestos = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = calcularSalarioNeto(salarioBruto, porcentajeImpuestos);
        double bono = calcularBonoAnual(salarioBruto, meses);
        double totalAnual = (salarioNeto * 12) + bono;

        System.out.println("=== DESGLOSE DE NÓMINA ===");
        System.out.println("Empleado: " + empleado);
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Impuestos: $" + impuestos);
        System.out.println("Salario neto: $" + salarioNeto);
        System.out.println("Bono anual: $" + bono);
        System.out.println("TOTAL ANUAL: $" + totalAnual);
    }

    public static void main(String[] args) {
        String empleado = "Carlos Mendoza";
        double salarioBruto = 3500.0;
        double impuestos = 15.0;
        int meses = 12;

        // Llamada al método
        mostrarDesglose(empleado, salarioBruto, impuestos, meses);
    }
}