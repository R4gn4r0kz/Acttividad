/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloComunicacion;

import java.time.LocalDate;

/**
 *
 * @author diego - mod Santiago
 */
public class Pedido {
   private static int ultimoID = 100788; // Podría haber sido cualquier número, escogí éste al azar.
   private int IDpedido;
   private String estado;
   private LocalDate fecha;
   private int total;
   private String direccion;
   
   private static int generarNuevoID() { // Creamos esta variable para asignar automáticamente un ID a cada pedido.
       ultimoID++;
       return ultimoID;
   }
   
    public Pedido() {
        this.IDpedido = generarNuevoID();
        this.fecha = LocalDate.now();
        this.estado = "Pendiente";
    }
    
    public void setDireccion(String direccion) throws IllegalArgumentException {
        if (direccion == null) {
            throw new IllegalArgumentException("La dirección es obligatoria. No podemos enviarte un pedido si no nos proporcionas una dirección.");
        }
        this.direccion = direccion;
    }
    
    public boolean confirmarPago(String metodoPago) {
        if (metodoPago != null && !metodoPago.isEmpty()) {
            this.estado = "Pagado";
            return true;
        }
        return false;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }

    public int getIDpedido() {
        return IDpedido;
    }

}