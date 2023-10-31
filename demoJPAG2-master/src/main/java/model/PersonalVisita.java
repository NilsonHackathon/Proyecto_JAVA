package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="PER")
public class PersonalVisita extends Visita{
    private String noCarnet;

    public PersonalVisita(Integer id, Date fecha, String nombre, String primerApellido) {
        super(id, fecha, nombre, primerApellido);
    }

    public PersonalVisita() {
    }
}
