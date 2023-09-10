import Syncro.*;

public class Main {

    public static void main(String[] args) {
    //Registro de Colegios
        Registro_Colegios Regi = new Registro_Colegios(1, "Santa Teresita", "Manolo",
                new ubicacion(1,
                        new Departamento(1, departamentos.MANAGUA, "Managua",
                                new barrio(1, "Bello Horizonte"))), tipos.PRIVADO,
                new citas(1, 2023,meses.SEPTIEMBRE, 10));

        System.out.println(Regi);
    }
}