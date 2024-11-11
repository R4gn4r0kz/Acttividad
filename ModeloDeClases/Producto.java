/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloClases;

/**
 *
 * @author diego
 */
public class Producto {
     private int IDproducto;
     private String Nombre;
     private int Precio;
     private int Stock;
     private int ActualizarStock;
     private int ObtenerPrecio;

    public Producto() {
    }

    public Producto(int IDproducto, String Nombre, int Precio, int Stock, int ActualizarStock, int ObtenerPrecio) {
        this.IDproducto = IDproducto;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
        this.ActualizarStock = ActualizarStock;
        this.ObtenerPrecio = ObtenerPrecio;
    }

    public int getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(int IDproducto) {
        this.IDproducto = IDproducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
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
