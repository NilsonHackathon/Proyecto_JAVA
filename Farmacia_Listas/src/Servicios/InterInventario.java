package Servicios;

import Modelo.Productos;
import java.util.List;

public interface InterInventario {
    public void agregarProducto(Productos producto);

    public List<Productos> consultarTodos();

    public Productos buscarProducto(String nombre);

    public void venderProducto(String nombre, int cantidad);

    public void comprarProducto(String nombre, int cantidad);
}
