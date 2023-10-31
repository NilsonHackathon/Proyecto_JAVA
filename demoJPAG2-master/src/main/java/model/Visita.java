package model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoVisita")
import java.util.Date;

public abstract class Visita {
    @Id
    private Integer id;
    private Date fecha;
    private String nombre;


    public Visita(Integer id, Date fecha, String nombre, String primerApellido) {
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }

    public Visita() {
    }

    @Column(name="primer_apellido")
    private String primerApellido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
}
