package org.example.Service;

import org.Model.Encuesta;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BaseDeDatos {

    private static final String URL = "jdbc:postgresql://localhost:5432/";

    public Connection conn(String bdName, String user, String contra) {

        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection( URL + bdName , user , contra);
            if(conn != null){
                System.out.println("Conección Establecida");
            }
            else {
                System.out.println("Conección Fallada");
            }

        }catch (Exception e){
            System.out.println("Error! " + e);
        }
        return conn;


    }

    public void guardarEncuesta(Encuesta encuesta, Connection conn){

        try {
            String sql = "INSERT INTO registroencuesta.encuestados (id, primernombre, primerApellido, correoElectronico, edad)  VALUES (?, ?, ? ,?, ?) ";
            PreparedStatement sentencia = conn.prepareStatement(sql);
            sentencia.setInt(1, encuesta.getId());
            sentencia.setString(2, encuesta.getPrimerNombre());
            sentencia.setString(3, encuesta.getPrimerApellido());
            sentencia.setString(4, encuesta.getCorreoElectronico());
            sentencia.setInt(5, encuesta.getEdad());
            sentencia.executeUpdate();
            System.out.println("\n¡Listo!\n");
        }catch (Exception e){
            System.out.println("\n¡ERROR!");
            e.printStackTrace();
        }

        //System.out.println("\n¡Listo!\n");

    }

}
