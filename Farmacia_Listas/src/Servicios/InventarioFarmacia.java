package Servicios;

import Modelo.Productos;
import DataBase.datosInvent;

import java.util.List;

public class InventarioFarmacia implements InterInventario {
    @Override
    public void agregarProducto(Productos producto) {
        datosInvent.Listado.add(producto);
    }

    @Override
    public List<Productos> consultarTodos() {
        return datosInvent.Listado;
    }

    @Override
    public Productos buscarProducto(String nombre) {
        for (Productos producto : datosInvent.Listado) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public void venderProducto(String nombre, int cantidad) {
        for (Productos producto : datosInvent.Listado) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto.getCantidad() >= cantidad) {
                    producto.setCantidad(producto.getCantidad() - cantidad);
                    System.out.println("Venta exitosa. Se vendieron " + cantidad + " unidades de " + nombre);
                } else {
                    System.out.println("No hay suficientes unidades de " + nombre + " en el inventario.");
                }
                return;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
    }

    @Override
    public void comprarProducto(String nombre, int cantidad) {
        for (Productos producto : datosInvent.Listado) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setCantidad(producto.getCantidad() + cantidad);
                System.out.println("Compra exitosa. Se compraron " + cantidad + " unidades de " + nombre);
                return;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
    }

}
