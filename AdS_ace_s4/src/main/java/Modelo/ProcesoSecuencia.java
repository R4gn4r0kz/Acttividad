/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class ProcesoSecuencia {
    private Usuario usuario;
    private Carrito carrito;
    private Pedido pedido;
    
    public ProcesoSecuencia() {
        this.carrito = new Carrito();
        this.pedido = new Pedido();
    }
    
    public boolean iniciarSesion(int idUsuario, String nombre, String email, int contraseña) {
        this.usuario = new Usuario(idUsuario, nombre, email, contraseña, "Iniciar Sesión", "Cerrar Sesión");
        return usuario.getContraseña() == contraseña;
    }
    
    public boolean validarCredenciales() {
        return usuario != null && usuario.getContraseña() > 0;
    }
    
    public void buscarProducto(int idProducto, String nombre, int precio, int stock) {
        Producto producto = new Producto(idProducto, nombre, precio, stock, 0, 0);
        System.out.println("producto encontrado: " + producto.getNombre());
    }
    
    public void agregarProductoAlCarito(int idProducto, String nombre, int precio, int stock) {
        Producto producto = new Producto (idProducto, nombre, precio, stock, 0, 0);
        carrito.agregarProducto(producto, cantidad);
        System.out.println("Producto agregado al carrito: " + producto.getNombre() + ", cantidad: " + cantidad);        
    }
    
    public void ingresarDireccion(String direccion) {
        pedido.setDireccion(direccion);
        System.out.println("Dirección de entrega: " + direccion);        
    }
    
    public boolean pagarPedido(String metodoPago) {
        return pedido.confirmarPago(metodoPago);
    }
    
    public void confirmarPedido() {
        System.out.println("Pedido confirmado exitosamente.");
    }
}
