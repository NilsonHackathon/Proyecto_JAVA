package Syncro;
public class Registro_Colegios {

    //Atributos
    private Integer colegios_ID;
    private String nombreCole;
    private String director;
    private ubicacion Ubicacion;
    private tipos categoria;
    private citas cita_ID;

    //Contructores.
    //Contruc. Vacio.
    public Registro_Colegios() {}
    //1. constructor.
    public Registro_Colegios(Integer colegios_ID,
                             String nombreCole,
                             String director,
                             ubicacion Ubicacion,
                             tipos categoria,
                             citas cita_ID) {

        this.colegios_ID = colegios_ID;
        this.nombreCole = nombreCole;
        this.director = director;
        this.Ubicacion = Ubicacion;
        this.categoria = categoria;
        this.cita_ID = cita_ID;
    }

    //Getter and setter.
    public Integer getColegios_ID() {return colegios_ID;}

    public void setColegios_ID(Integer colegios_ID) {
        this.colegios_ID = colegios_ID;
    }

    public String getNombreCole() {
        return nombreCole;
    }

    public void setNombreCole(String nombreCole) {
        this.nombreCole = nombreCole;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ubicacion getUbicacion() {return Ubicacion;}

    public void setUbicacion(ubicacion ubicacion) {Ubicacion = ubicacion;}

    public tipos getCategoria() {return categoria;}

    public void setCategoria(tipos categoria) {this.categoria = categoria;}

    public citas getCita_ID() {
        return cita_ID;
    }

    public void setCita_ID(citas cita_ID) {
        this.cita_ID = cita_ID;
    }

    //String
    @Override
    public String toString() {
        return "Registro_Colegios{" +
                "colegios_ID=" + colegios_ID +
                ", nombreCole='" + nombreCole + '\'' +
                ", director='" + director + '\'' +
                ", Ubicacion=" + Ubicacion +
                ", categoria=" + categoria +
                ", cita_ID=" + cita_ID +
                '}';
    }
}
