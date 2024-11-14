/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3;

/**
 *
 * @author diego
 */
public class FlujoActividad {
    private String IngresarCredenciales;
    private Boolean ValidarCredenciales;
    private Boolean OtorgarAcceso;
    private String MensajedeError;
    private String BuscarProducto;
    private int ModificarCarrito;
    private String IngresarDireccion;
    private int Pagar;
    private String ConfirmarPedido; 

    public FlujoActividad() {
    }

    public FlujoActividad(String IngresarCredenciales, Boolean ValidarCredenciales, Boolean OtorgarAcceso, String MensajedeError, String BuscarProducto, int ModificarCarrito, String IngresarDireccion, int Pagar, String ConfirmarPedido) {
        this.IngresarCredenciales = IngresarCredenciales;
        this.ValidarCredenciales = ValidarCredenciales;
        this.OtorgarAcceso = OtorgarAcceso;
        this.MensajedeError = MensajedeError;
        this.BuscarProducto = BuscarProducto;
        this.ModificarCarrito = ModificarCarrito;
        this.IngresarDireccion = IngresarDireccion;
        this.Pagar = Pagar;
        this.ConfirmarPedido = ConfirmarPedido;
    }

    public String getIngresarCredenciales() {
        return IngresarCredenciales;
    }

    public void setIngresarCredenciales(String IngresarCredenciales) {
        this.IngresarCredenciales = IngresarCredenciales;
    }

    public Boolean getValidarCredenciales() {
        return ValidarCredenciales;
    }

    public void setValidarCredenciales(Boolean ValidarCredenciales) {
        this.ValidarCredenciales = ValidarCredenciales;
    }

    public Boolean getOtorgarAcceso() {
        return OtorgarAcceso;
    }

    public void setOtorgarAcceso(Boolean OtorgarAcceso) {
        this.OtorgarAcceso = OtorgarAcceso;
    }

    public String getMensajedeError() {
        return MensajedeError;
    }

    public void setMensajedeError(String MensajedeError) {
        this.MensajedeError = MensajedeError;
    }

    public String getBuscarProducto() {
        return BuscarProducto;
    }

    public void setBuscarProducto(String BuscarProducto) {
        this.BuscarProducto = BuscarProducto;
    }

    public int getModificarCarrito() {
        return ModificarCarrito;
    }

    public void setModificarCarrito(int ModificarCarrito) {
        this.ModificarCarrito = ModificarCarrito;
    }

    public String getIngresarDireccion() {
        return IngresarDireccion;
    }

    public void setIngresarDireccion(String IngresarDireccion) {
        this.IngresarDireccion = IngresarDireccion;
    }

    public int getPagar() {
        return Pagar;
    }

    public void setPagar(int Pagar) {
        this.Pagar = Pagar;
    }

    public String getConfirmarPedido() {
        return ConfirmarPedido;
    }

    public void setConfirmarPedido(String ConfirmarPedido) {
        this.ConfirmarPedido = ConfirmarPedido;
    }
    
    
    
}
