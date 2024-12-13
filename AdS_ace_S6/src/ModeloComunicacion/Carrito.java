package ModeloComunicacion;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final int IDcliente;
    private List<ItemCarrito> listaProductos;  // Usar una clase ItemCarrito para manejar cantidad
    private int total;

    public Carrito(int IDcliente) {
        this.IDcliente = IDcliente;
        this.listaProductos = new ArrayList<>();
        this.total = 0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (cantidad > producto.getStock()) {
            throw new IllegalArgumentException("Producto agotado." + producto.getNombre());
        }
        producto.setStock(producto.getStock() - cantidad);  // Reducir el stock del producto

        // Verificar si el producto ya está en el carrito
        for (ItemCarrito item : listaProductos) {
            if (item.getProducto().equals(producto)) {
                item.setCantidad(item.getCantidad() + cantidad);  // Aumentar la cantidad en el carrito
                recalcularTotal();
                return;
            }
        }

        // Si el producto no está en el carrito, añadirlo nuevo
        listaProductos.add(new ItemCarrito(producto, cantidad));
        recalcularTotal();
    }

    private void recalcularTotal() {
        total = 0;
        for (ItemCarrito item : listaProductos) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
    }

    // Getters y setters
    public int getIDcliente() {
        return IDcliente;
    }
    
    public int getTotal() {
        return total;
    }

    public List<ItemCarrito> getListaProductos() {
        return listaProductos;
    }
}

class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}