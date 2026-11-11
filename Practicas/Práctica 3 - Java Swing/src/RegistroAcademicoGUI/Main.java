/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegistroAcademicoGUI;
import javax.swing.SwingUtilities;

/**
 *
 * @author walbe
 */
public class Main {
    /**
     * Método principal que lanza la interfaz en el hilo de eventos de Swing.
     * 
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroAcademicoGUI ventana = new RegistroAcademicoGUI();
            ventana.setLocationRelativeTo(null); // Centra la ventana en la pantalla
            ventana.setVisible(true);
        });
    }
    
}
