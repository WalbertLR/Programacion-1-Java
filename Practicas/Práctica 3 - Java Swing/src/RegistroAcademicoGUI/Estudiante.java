/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroAcademicoGUI;

/**
 *
 * @author walbe
 */
public class Estudiante {
    
    private String nombre;
    private int matricula;
    private String carrera;
    private int notaPracticas;
    private int notaParciales;
    private int notaAsignaciones;
    private int notaExamenFinal;
    

    public Estudiante(String nombre, int matricula, String carrera, int notaPracticas, int notaParciales, int notaAsignaciones, int notaExamenFinal) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.notaPracticas = notaPracticas;
        this.notaParciales = notaParciales;
        this.notaAsignaciones = notaAsignaciones;
        this.notaExamenFinal = notaExamenFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getNotaPracticas() {
        return notaPracticas;
    }

    public int getNotaParciales() {
        return notaParciales;
    }

    public int getNotaAsignaciones() {
        return notaAsignaciones;
    }

    public int getNotaExamenFinal() {
        return notaExamenFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNotaPracticas(int notaPracticas) {
        this.notaPracticas = notaPracticas;
    }

    public void setNotaParciales(int notaParciales) {
        this.notaParciales = notaParciales;
    }

    public void setNotaAsignaciones(int notaAsignaciones) {
        this.notaAsignaciones = notaAsignaciones;
    }

    public void setNotaExamenFinal(int notaExamenFinal) {
        this.notaExamenFinal = notaExamenFinal;
    }
    
    
     
    
}
