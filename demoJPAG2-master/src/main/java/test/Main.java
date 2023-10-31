package test;

import model.*;
import service.EntityManagerAdmin;
import service.IDAO;
import service.ImplDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void demoOneToMany(IDAO idao){
        List<Libro> lista = new ArrayList<>();
        Autor autor = new ArrayList<>();
        Autor
    }

    public static void demoHerencia(IDAO idao){
        Visita vistia = new EstudianteVisita(1, new Date(), "Brandon", "Castillo",
                1234567)    ;
        idao.create(Visita);
    }

    /*public static void main(String[] args) {
        IDAO idao = new ImplDAO();
        List<Libro> lista = new ArrayList<>();

        Autor autor = new Autor(1, "Rubén", "Darío");
        idao.create(autor);
        Libro libro = new Libro(3, "Profas profanas", "Buen libro", autor);
        List<Libro> libros = new ArrayList<>();
        libros.add(libro);
        autor.setLibros(libros);
        idao.create(libro);

    }*/

    public static void main(String[] args){
        
    }
}
