import data.DataBase;
import model.Alumno;
import model.Carrera;
import servicio.IDaoAlumnos;
import servicio.ImplDAOAlumnos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(1, "Ingniero en Sistema", "FIA", "");
        Alumno a = new Alumno("001230874", "Carlos", "",
                "Lopez", "", carrera);

        IDaoAlumnos dao = new ImplDAOAlumnos();
        dao.crearAlumno(a);
        a.setSegundoNombre("José");
        a.setPrimerApellido("Marin");
        dao.actualizarAlumnos(a);
        imprimirAlumnos(dao);

        //System.out.println("Cantidad: " + DataBase.listado.size());
    }
    private static void imprimirAlumnos(IDaoAlumnos d){
        for (Alumno a : d.consultarTodos()){
            System.out.println(a);
        }
    }
}