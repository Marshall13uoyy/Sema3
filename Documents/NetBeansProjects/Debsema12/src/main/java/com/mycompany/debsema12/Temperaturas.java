/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.debsema12;

/**
 *
 * @author andre
 */
import java.util.Random;

public class Temperaturas {
    public static void main(String[] args) {
        String[] ciudades = {"Quito", "Guayaquil"};
        String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        int semanas = 2;

        // Matriz 3D: [ciudad][día][semana]
        int[][][] temperaturas = new int[ciudades.length][dias.length][semanas];

        Random rand = new Random();

        // Llenar con valores aleatorios entre 15 y 30
        for (int c = 0; c < ciudades.length; c++) {
            for (int s = 0; s < semanas; s++) {
                for (int d = 0; d < dias.length; d++) {
                    temperaturas[c][d][s] = 15 + rand.nextInt(16);
                }
            }
        }

        // Calcular y mostrar promedios
        for (int c = 0; c < ciudades.length; c++) {
            System.out.println("Ciudad: " + ciudades[c]);
            for (int s = 0; s < semanas; s++) {
                int suma = 0;
                for (int d = 0; d < dias.length; d++) {
                    suma += temperaturas[c][d][s];
                }
                double promedio = (double) suma / dias.length;
                System.out.println("  Semana " + (s+1) + ": " + promedio);
            }
        }
    }
}
