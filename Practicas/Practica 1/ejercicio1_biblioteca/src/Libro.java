/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Libro {
    // Atributos pribados
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;
    
    // Constructor y inicializador
    
    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
    
    //Metodo consultar disponibilidad
    
    public boolean consultarDisponibilidad(){
        return this.disponible;
    }
    
    // Getters y Setters
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
}
