/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloComunicacion;

/**
 *
 * @author diego - mod Santiago
 */
public class cliente {
     private int IDcliente;
     private String nombre;
     private String Email;
     private int Contraseña;
     private int IDusuario;

    public cliente() {
    }

    public cliente(int IDcliente, String nombre, String Email, int Contraseña, int IDusuario) {
        this.IDcliente = IDcliente;
        this.nombre = nombre;
        this.Email = Email;
        this.Contraseña = Contraseña;
        this.IDusuario = IDusuario;
    }

    public int getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }
    
}