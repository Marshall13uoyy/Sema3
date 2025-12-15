// ================================
// PROGRAMACIÓN TRADICIONAL
// ================================

import java.util.Scanner;

public class PromedioTemperaturasTradicional {

    // Método para ingresar las temperaturas diarias
    public static double[] ingresarTemperaturas() {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];

        System.out.println("Ingrese las temperaturas diarias de la semana:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        return temperaturas;
    }

    // Método para calcular el promedio semanal
    public static double calcularPromedio(double[] temperaturas) {
        double suma = 0;

        for (double temp : temperaturas) {
            suma += temp;
        }

        return suma / temperaturas.length;
    }

    // Método principal
    public static void main(String[] args) {
        double[] temps = ingresarTemperaturas();
        double promedio = calcularPromedio(temps);

        System.out.printf("\nEl promedio semanal de temperatura es: %.2f °C%n", promedio);
    }
}
