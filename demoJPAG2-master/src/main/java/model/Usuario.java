package model;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class Usuario {

    @Id
    private Integer id;
    private String nombre;

    @ManyToMany

    @JoinTable(name="UsuarioRol", joinColumns = @JoinColumn(name="usuario_id"),
            inverseJoinColumns = @JoinColumn(name="rol_id")
    )

    private List<Rol> listRol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public Usuario(List<Rol> listRol) {
        this.listRol = listRol;
    }
}
