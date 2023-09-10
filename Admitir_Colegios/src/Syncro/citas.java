package Syncro;

public class citas {
    private Integer cita_ID;
    private int anou;//Primero en string luego usar la clase "DATE"
    private meses mes;
    private int dia;

    public citas() {}

    public citas(Integer cita_ID,
                 int anou,
                 meses mes,
                 int dia) {
        this.cita_ID = cita_ID;
        this.anou = anou;
        this.mes = mes;
        this.dia = dia;
    }

    public Integer getCita_ID() {
        return cita_ID;
    }

    public void setCita_ID(Integer cita_ID) {
        this.cita_ID = cita_ID;
    }

    public int getAnou() {
        return anou;
    }

    public void setAnou(int anou) {
        this.anou = anou;
    }

    public meses getMes() {
        return mes;
    }

    public void setMes(meses mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "citas{" +
                "cita_ID=" + cita_ID +
                ", anou=" + anou +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }
}
