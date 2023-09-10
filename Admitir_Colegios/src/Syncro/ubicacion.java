package Syncro;

public class ubicacion {
    private Integer ubicacion_ID;
    private Departamento departamentos_ID;

    public ubicacion() {}

    public ubicacion(Integer ubicacion_ID, Departamento departamentos_ID) {
        this.ubicacion_ID = ubicacion_ID;
        this.departamentos_ID = departamentos_ID;
    }

    public Integer getUbicacion_ID() {
        return ubicacion_ID;
    }

    public void setUbicacion_ID(Integer ubicacion_ID) {
        this.ubicacion_ID = ubicacion_ID;
    }

    public Departamento getDepartamentos_ID() {
        return departamentos_ID;
    }

    public void setDepartamentos_ID(Departamento departamentos_ID) {
        this.departamentos_ID = departamentos_ID;
    }

    @Override
    public String toString() {
        return "ubicacion{" +
                "ubicacion_ID=" + ubicacion_ID +
                ", departamentos_ID=" + departamentos_ID +
                '}';
    }
}
