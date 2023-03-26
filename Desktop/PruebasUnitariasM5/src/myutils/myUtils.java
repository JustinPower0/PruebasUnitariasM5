/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */
public class myUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        //Como se invierte una cadena?
        String resultat = "";
        if (cadena == null) {
            return null;
        }
        for (int i = 0; i < cadena.length(); i++) {

            resultat += cadena.charAt(cadena.length() - i - 1);

        }

        return resultat;

    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;

        if (day > 31) {
            resultat = -2;
        } else if (month > 12) {
            resultat = -2;
        } else if (year > 2023) {
            resultat = -2;
        }

        if (resultat != -2) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String fechaActual = dtf.format(LocalDateTime.now());

            int anyoActual = Integer.parseInt(fechaActual.substring(0, 4));
            int mesActual = Integer.parseInt(fechaActual.substring(5, 7));
            int diaActual = Integer.parseInt(fechaActual.substring(8, 10));

            int edad = anyoActual - year;

            if (mesActual >= month) {
                if (diaActual > day) {
                } else {
                    edad--;
                }
            } else {
                edad--;
            }
            if (edad > 150) {
                resultat = -1;
            } else {
                resultat = edad;
            }
        }

        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            if (numero < 0) {
                return -1;
            } else {
                int factorial = 1;
                for (int i = 2; i <= numero; i++) {
                    factorial *= i;
                }
                double resultat = factorial;
                return resultat;
            }

        }
    }
}
