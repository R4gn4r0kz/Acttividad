/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Carrito {
    private int IDcarrito;
    private String ListadeProductos;
    private int Total;
    private int ActualizarStock;
    private int ObtenerPrecio;

    public Carrito() {
    }
    
    

    public Carrito(int IDcarrito, String ListadeProductos, int Total, int ActualizarStock, int ObtenerPrecio) {
        this.IDcarrito = IDcarrito;
        this.ListadeProductos = ListadeProductos;
        this.Total = Total;
        this.ActualizarStock = ActualizarStock;
        this.ObtenerPrecio = ObtenerPrecio;
    }

    public int getIDcarrito() {
        return IDcarrito;
    }

    public void setIDcarrito(int IDcarrito) {
        this.IDcarrito = IDcarrito;
    }

    public String getListadeProductos() {
        return ListadeProductos;
    }

    public void setListadeProductos(String ListadeProductos) {
        this.ListadeProductos = ListadeProductos;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public int getActualizarStock() {
        return ActualizarStock;
    }

    public void setActualizarStock(int ActualizarStock) {
        this.ActualizarStock = ActualizarStock;
    }

    public int getObtenerPrecio() {
        return ObtenerPrecio;
    }

    public void setObtenerPrecio(int ObtenerPrecio) {
        this.ObtenerPrecio = ObtenerPrecio;
    }
    
    
      
}
