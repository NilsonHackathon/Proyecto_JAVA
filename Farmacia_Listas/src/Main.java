import Modelo.Productos;
import Servicios.InterInventario;
import Servicios.InventarioFarmacia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InventarioFarmacia inventario = new InventarioFarmacia();

        InterInventario inter = inventario;

// Agregar algunos productos al inventario
        inter.agregarProducto(new Productos(1, "Paracetamol", 100, 5.99));
        inter.agregarProducto(new Productos(2, "Ibuprofeno", 50, 7.49));
        inter.agregarProducto(new Productos(3, "Aspirina", 75, 3.99));

// Simular una venta
        System.out.println("\n");
        inter.venderProducto("Paracetamol", 10);
        inter.venderProducto("Ibuprofeno", 20);
        inter.venderProducto("Parecetamos", 91);
        inter.venderProducto("Paracetamol", 91);
        System.out.println("\n");

// Simular una compra
        inter.comprarProducto("Aspirina", 20);
        System.out.println("\n");

// Imprimir la lista actualizada de productos
        List<Productos> listaProductos = inter.consultarTodos();
        System.out.println("Inventario luego de vender y comprar:");
        for (Productos producto : listaProductos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad() + ", Precio: " + producto.getPrecio());
        }
        System.out.println("\n");

    }
}
