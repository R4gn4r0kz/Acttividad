/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Pedido {
   private int IDpedido;
   private String Estado;
   private int Fecha;
   private int Total;
   private int Calculartotal;
   private String ConfirmaPedido; 

    public Pedido() {
    }

    public Pedido(int IDpedido, String Estado, int Fecha, int Total, int Calculartotal, String ConfirmaPedido) {
        this.IDpedido = IDpedido;
        this.Estado = Estado;
        this.Fecha = Fecha;
        this.Total = Total;
        this.Calculartotal = Calculartotal;
        this.ConfirmaPedido = ConfirmaPedido;
    }

    public int getIDpedido() {
        return IDpedido;
    }

    public void setIDpedido(int IDpedido) {
        this.IDpedido = IDpedido;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int Fecha) {
        this.Fecha = Fecha;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getCalculartotal() {
        return Calculartotal;
    }

    public void setCalculartotal(int Calculartotal) {
        this.Calculartotal = Calculartotal;
    }

    public String getConfirmaPedido() {
        return ConfirmaPedido;
    }

    public void setConfirmaPedido(String ConfirmaPedido) {
        this.ConfirmaPedido = ConfirmaPedido;
    }
  
   
}
