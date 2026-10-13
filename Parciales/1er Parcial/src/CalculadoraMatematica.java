/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class CalculadoraMatematica {

    //Atributos privados
    private double numero1;
    private double numero2;

    //getters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    //Construsctor por defecto
    public void CalculadoraMatematica() {
        this.numero1 = 0.0;
        this.numero2 = 0.0;
    }

    /**
     * Asigna los numeros con lo que se trabajara
     *
     * @param num1 primer numero
     * @param num2 segundo numero
     */
    public void asignarNumeros(double num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    /**
     * Este metodo suma los dos numero
     *
     * @return los numeros sumados
     */
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    /**
     * Este metodo resta el segundo numero al primer numero
     *
     * @return el resultado de la resta
     */
    public double restar() {
        return this.numero1 - this.numero2;
    }

    /**
     * Este metodo multipla el primer numero por el segundo
     *
     * @return Devuelve el resultado de la multiplicacion
     */
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }

    /**
     * Este metodo calcula la division del primer numero entre el segundo
     *
     * @return El resultado de esta division
     */
    public double division() {
        //Validacion para que no se divida entre 0
        if (this.numero2 == 0) {
            System.out.println("Error: El divisor no puede ser 0");
            return 0.0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

}
