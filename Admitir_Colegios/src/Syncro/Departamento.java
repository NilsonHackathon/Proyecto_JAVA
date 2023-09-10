package Syncro;

public class Departamento {
    private Integer Departamento_ID;
    private departamentos departamento;
    private String municipio;
    private barrio barrio_ID;

    public Departamento() {}

    public Departamento(Integer departamento_ID,
                        departamentos departamento,
                        String municipio,
                        barrio barrio_ID) {
        Departamento_ID = departamento_ID;
        this.departamento = departamento;
        this.municipio = municipio;
        this.barrio_ID = barrio_ID;
    }

    public Integer getDepartamento_ID() {
        return Departamento_ID;
    }

    public void setDepartamento_ID(Integer departamento_ID) {
        Departamento_ID = departamento_ID;
    }

    public departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(departamentos departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public barrio getBarrio_ID() {
        return barrio_ID;
    }

    public void setBarrio_ID(barrio barrio_ID) {
        this.barrio_ID = barrio_ID;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "Departamento_ID=" + Departamento_ID +
                ", departamento=" + departamento +
                ", municipio='" + municipio + '\'' +
                ", barrio_ID=" + barrio_ID +
                '}';
    }
}
