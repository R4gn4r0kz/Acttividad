/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloComunicacion;

/**
 *
 * @author diego
 */
public class Usuario {
    private String Ingresarpagina;
    private String SeleccionarIngresarsesion;
    private String IngresarCredenciales;
    private String PrecionaIniciarsesion;
    private String ValidarCredenciales;
    private String EntraralSistema;

    public Usuario() {
    }

    public Usuario(String Ingresarpagina, String SeleccionarIngresarsesion, String IngresarCredenciales, String PrecionaIniciarsesion, String ValidarCredenciales, String EntraralSistema) {
        this.Ingresarpagina = Ingresarpagina;
        this.SeleccionarIngresarsesion = SeleccionarIngresarsesion;
        this.IngresarCredenciales = IngresarCredenciales;
        this.PrecionaIniciarsesion = PrecionaIniciarsesion;
        this.ValidarCredenciales = ValidarCredenciales;
        this.EntraralSistema = EntraralSistema;
    }

    public String getIngresarpagina() {
        return Ingresarpagina;
    }

    public void setIngresarpagina(String Ingresarpagina) {
        this.Ingresarpagina = Ingresarpagina;
    }

    public String getSeleccionarIngresarsesion() {
        return SeleccionarIngresarsesion;
    }

    public void setSeleccionarIngresarsesion(String SeleccionarIngresarsesion) {
        this.SeleccionarIngresarsesion = SeleccionarIngresarsesion;
    }

    public String getIngresarCredenciales() {
        return IngresarCredenciales;
    }

    public void setIngresarCredenciales(String IngresarCredenciales) {
        this.IngresarCredenciales = IngresarCredenciales;
    }

    public String getPrecionaIniciarsesion() {
        return PrecionaIniciarsesion;
    }

    public void setPrecionaIniciarsesion(String PrecionaIniciarsesion) {
        this.PrecionaIniciarsesion = PrecionaIniciarsesion;
    }

    public String getValidarCredenciales() {
        return ValidarCredenciales;
    }

    public void setValidarCredenciales(String ValidarCredenciales) {
        this.ValidarCredenciales = ValidarCredenciales;
    }

    public String getEntraralSistema() {
        return EntraralSistema;
    }

    public void setEntraralSistema(String EntraralSistema) {
        this.EntraralSistema = EntraralSistema;
    }
    
    
}
