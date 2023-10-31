package org.example;

import org.Model.Encuesta;
import org.example.Service.BaseDeDatos;

import java.sql.Connection;

public class Main {

   // static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        BaseDeDatos bd = new BaseDeDatos();
        Connection conn = bd.conn("EncuestaRegistro", "postgres", "24112002.");

            Encuesta encuesta = new Encuesta(23, "Paco", "Steel",
                    "NilesSteel24@gmail.com", 41);

            bd.guardarEncuesta(encuesta, conn);

    }
}