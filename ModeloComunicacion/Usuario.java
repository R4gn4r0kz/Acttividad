/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloComunicacion;

/**
 *
 * @author diego - mod Santiago
 */
public class Usuario {
    private int IDusuario;
    private String nombre;
    private String email;
    private int contraseña;
    
    public Usuario() {
    }

    public Usuario(int IDusuario, String nombre, String email, int contraseña) {
        this.IDusuario = IDusuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }
    
    public boolean Validarcredenciales(int contraseñaIngresada) {
        return this.contraseña == contraseñaIngresada;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    
}
