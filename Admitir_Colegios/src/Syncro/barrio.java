package Syncro;

public class barrio {
    private Integer barrio_ID;
    private String zona;

    public barrio() {}

    public barrio(Integer barrio_ID, String zona) {
        this.barrio_ID = barrio_ID;
        this.zona = zona;
    }

    public Integer getBarrio_ID() {
        return barrio_ID;
    }

    public void setBarrio_ID(Integer barrio_ID) {
        this.barrio_ID = barrio_ID;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "barrio{" +
                "barrio_ID=" + barrio_ID +
                ", zona='" + zona + '\'' +
                '}';
    }
}
