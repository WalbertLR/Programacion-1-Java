/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walbe
 */
public class Factura {
    // Atributos privados
    private Cliente cliente;
    private int minutosUsadosReales;
    private double datosUsadosRealesGb;
    
    // COnstructor
    public Factura(Cliente cliente, int minutosUsadosReales, double datosUsadosRealesGb) {
        this.cliente = cliente;
        this.minutosUsadosReales = minutosUsadosReales;
        this.datosUsadosRealesGb = datosUsadosRealesGb;
    }
    
    //Metodo para calcular el monto total
    public double calcularMontoTotal(){
        Plan plan = cliente.getPlan();
        double total = plan.getPrecioMensual();
        
        //Calcular excendete de minutos $1.5 por minuto extra
        if(minutosUsadosReales > plan.getMinutosIncluidos()){
            int minutosExtra = minutosUsadosReales - plan.getMinutosIncluidos();
            total += minutosExtra * 1.5;
        }
        
        // Calcular exceso de datos $50 por gb extra
        if (datosUsadosRealesGb > plan.getDatosIncluidosGb()){
            double datosExtra = datosUsadosRealesGb - plan.getDatosIncluidosGb();
            total += datosExtra * 50.0;
        }
        return total;
    }
    
    public void generarFactura(){
        Plan plan = cliente.getPlan();
        System.out.println("========================================");
        System.out.println("         FACTURA DE TELEFONÍA           ");
        System.out.println("========================================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getNumeroTelefonico());
        System.out.println("----------------------------------------");
        System.out.println("Plan Base: $" + plan.getPrecioMensual() + " (" + plan.getMinutosIncluidos() + " mins, " + plan.getDatosIncluidosGb() + " GB)");
        System.out.println("Consumo Real: " + minutosUsadosReales + " mins, " + datosUsadosRealesGb + " GB");
        System.out.println("----------------------------------------");
        System.out.println("MONTO TOTAL A PAGAR: $" + calcularMontoTotal());
        System.out.println("========================================\n");
    }
    
}
