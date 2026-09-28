/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diaslaborales;

/**
 *
 * @author walbe
 */
public class DiasLaborales {
    public static void main(String[] args) {
        String dia = "Lunes";
        String tipoJornada;
        int horasTrabajo;

        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                tipoJornada = "Día laboral";
                horasTrabajo = 8;
                break;
            case "Sábado":
                tipoJornada = "Medio día";
                horasTrabajo = 4;
                break;
            case "Domingo":
                tipoJornada = "Descanso";
                horasTrabajo = 0;
                break;
            default:
                tipoJornada = "Día no válido";
                horasTrabajo = 0;
        }

        System.out.println("Día: " + dia);
        System.out.println("Tipo: " + tipoJornada);
        System.out.println("Horas de trabajo: " + horasTrabajo);
    }
}
