package model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Rol {

    private Integer id;
    private String rol;

    @ManyToMany(mappedBy = "ListRol")

    private List<Usuario> listUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Rol() {
    }
}
