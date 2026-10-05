/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
import java.time.LocalDate;

public class Prestamo {
    // Atributos privados
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;
    
    // Constructor
    public Prestamo(Usuario usuario, Libro libro){
        this.fecha = LocalDate.now();//Registra la fecha actual
        this.usuario = usuario;
        this.libro = libro;
    }
    
    //Metodos prestarLibro y devolverLibro
    public boolean prestarLibro(){
        //primero se verifica la disponibilidad del libro
        if(libro.consultarDisponibilidad()){
            libro.setDisponible(false);//Se cambia el estado del libro
            usuario.agregarLibroPrestado(libro);// Se anade el libro al usuario
            System.out.println("Prestamo exitoso: '" + libro.getTitulo() + "' a " + usuario.getNombre());
            return true;
        }
        else {
            System.out.println("Error: El libro '" + libro.getTitulo() + "' no esta disponible.");
            return false;
        }
    }
    
    public void devolverLibro(){
        libro.setDisponible(true); // El libro vulve a estar disponible
        usuario.removerLibroPrestado(libro); //Se retira de la lista del usuario
        System.out.println("Devolucion exitosa: '"+ libro.getTitulo() + "' por " + usuario.getNombre()); 
    }
    
    // Getters
    public LocalDate getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
    public Libro getLibro() { return libro; }
}
