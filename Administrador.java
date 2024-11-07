/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Administrador {
     private String tipo;
     private int GestionarUsuario;
     private int GestionarCuenta;
     private int GestionarProducto;
     private int GestionarCompra;

    public Administrador() {
    }

    public Administrador(String tipo, int GestionarUsuario, int GestionarCuenta, int GestionarProducto, int GestionarCompra) {
        this.tipo = tipo;
        this.GestionarUsuario = GestionarUsuario;
        this.GestionarCuenta = GestionarCuenta;
        this.GestionarProducto = GestionarProducto;
        this.GestionarCompra = GestionarCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getGestionarUsuario() {
        return GestionarUsuario;
    }

    public void setGestionarUsuario(int GestionarUsuario) {
        this.GestionarUsuario = GestionarUsuario;
    }

    public int getGestionarCuenta() {
        return GestionarCuenta;
    }

    public void setGestionarCuenta(int GestionarCuenta) {
        this.GestionarCuenta = GestionarCuenta;
    }

    public int getGestionarProducto() {
        return GestionarProducto;
    }

    public void setGestionarProducto(int GestionarProducto) {
        this.GestionarProducto = GestionarProducto;
    }

    public int getGestionarCompra() {
        return GestionarCompra;
    }

    public void setGestionarCompra(int GestionarCompra) {
        this.GestionarCompra = GestionarCompra;
    }
     
     

}
