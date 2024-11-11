/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloClases;

/**
 *
 * @author diego
 */
public class Usuario {
    private int IDusuario;
    private String Nombre;
    private String Email;
    private int Contraseña;
    private String IniciarSesion;
    private String CerrarSesion;

    public Usuario() {
    }

    public Usuario(int IDusuario, String Nombre, String Email, int Contraseña, String IniciarSesion, String CerrarSesion) {
        this.IDusuario = IDusuario;
        this.Nombre = Nombre;
        this.Email = Email;
        this.Contraseña = Contraseña;
        this.IniciarSesion = IniciarSesion;
        this.CerrarSesion = CerrarSesion;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getIniciarSesion() {
        return IniciarSesion;
    }

    public void setIniciarSesion(String IniciarSesion) {
        this.IniciarSesion = IniciarSesion;
    }

    public String getCerrarSesion() {
        return CerrarSesion;
    }

    public void setCerrarSesion(String CerrarSesion) {
        this.CerrarSesion = CerrarSesion;
    }
   
    
    
}
