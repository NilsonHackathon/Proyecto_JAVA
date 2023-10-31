package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="EST")
public class EstudianteVisita extends Visita {
    private String NoCif;

    public EstudianteVisita(Integer id, Date fecha, String nombre, String primerApellido) {
        super(id, fecha, nombre, primerApellido);
    }

    public EstudianteVisita() {
    }
}
