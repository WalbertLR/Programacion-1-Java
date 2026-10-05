/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE GESTIÓN DE BIBLIOTECA ---\n");

        // 1. Instanciación de objetos (Libros y Usuario)
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-0156012195");

        Usuario usuario1 = new Usuario("Ana Pérez", "USR-001");

        // 2. Comprobar disponibilidad inicial
        System.out.println("¿Está disponible '" + libro1.getTitulo() + "'? " + libro1.consultarDisponibilidad());

        // 3. Registrar un préstamo
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        prestamo1.prestarLibro(); // Ejecuta el préstamo
        

        // 4. Intentar prestar el mismo libro a otro usuario (debería fallar)
        Usuario usuario2 = new Usuario("Carlos Gómez", "USR-002");
        Prestamo prestamoFallido = new Prestamo(usuario2, libro1);
        prestamoFallido.prestarLibro();
        
        Prestamo prestamo2 = new Prestamo(usuario2, libro2);
        prestamo2.prestarLibro(); // Ejecuta el préstamo

        // 5. Verificar los libros que tiene el usuario actualmente
        System.out.println("\nLibros en poder de " + usuario2.getNombre() + ":");
        for (Libro l : usuario2.getLibrosPrestados()) {
            System.out.println("- " + l.getTitulo());
        }

        // 6. Realizar la devolución
        System.out.println("\nProcesando devolución...");
        prestamo1.devolverLibro();

        // 7. Comprobar disponibilidad final
        System.out.println("¿Está disponible '" + libro1.getTitulo() + "' ahora? " + libro1.consultarDisponibilidad());
        
        //8. Verificacion final
        Prestamo prestamo3 = new Prestamo(usuario2, libro1);
        prestamo3.prestarLibro();
        System.out.println("\nLibros en poder de " + usuario2.getNombre() + ":");
        for (Libro l : usuario2.getLibrosPrestados()) {
            System.out.println("- " + l.getTitulo());
        }
        
    }

}
