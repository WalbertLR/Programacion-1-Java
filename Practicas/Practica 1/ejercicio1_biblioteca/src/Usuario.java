/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String idUnico;
    private List<Libro> librosPrestados; // Coleccion de libros asociados al usuario
         
    // Constructor
    public Usuario(String nombre, String idUnico){
        this.nombre = nombre;
        this.idUnico = idUnico;
        this.librosPrestados = new ArrayList<>();
    }
    
    //Metodos para gestionar los librios de los usuarios
    public void agregarLibroPrestado(Libro libro){
        this.librosPrestados.add(libro);
    }
    
    public void removerLibroPrestado(Libro libro){
        this.librosPrestados.remove(libro);
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdUnico() { return idUnico; }
    public void setIdUnico(String idUnico) { this.idUnico = idUnico; }

    public List<Libro> getLibrosPrestados() { return librosPrestados; }
    
}
