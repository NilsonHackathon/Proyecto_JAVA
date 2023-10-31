package org.Model;

public class Encuesta{
    private Integer id;
    private String primerNombre;
    private String primerApellido;
    private String correoElectronico;
    private int edad;


    public Encuesta(Integer id, String primerNombre, String primerApellido, String correoElectronico, int edad) {

        if (! (primerNombre.length() > 1) || (primerNombre.length() > 30)) {
            throw new IllegalArgumentException("Primer nombre inválido");
        } else if ((primerNombre == null) || (primerNombre.trim().isEmpty())) {
            throw new IllegalArgumentException("Primer nombre inválido");
        }
        if (primerApellido == null || primerApellido.length() > 30 || primerApellido.trim().isEmpty()) {
            throw new IllegalArgumentException("Primer apellido inválido");
        }
        if (!correoElectronico.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-zA-Z]{2,})$")){
            throw new IllegalArgumentException("Correo electrónico invalido");
        }
        if (edad < 30 || edad > 50){
            throw new IllegalArgumentException("Edad Invalida");
        }

        this.id = id;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correoElectronico = correoElectronico;
        this.edad = edad;
    }

    public Encuesta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
