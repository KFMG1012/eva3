/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.unidad.pkg4;
//public void leerNombres(){}
//String [][] ciudades={{"among"},

import java.util.Scanner;

public class ExamenUnidad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int numeroEstudiantes;
        do {
            System.out.print("Ingrese el número de estudiantes (debe ser mayor a 0): ");
            numeroEstudiantes = scanner.nextInt();
        } while (numeroEstudiantes <= 0);

        // Crear arreglo de calificaciones
        double[] calificaciones = new double[numeroEstudiantes];

        // Leer las calificaciones de los estudiantes
        for (int i = 0; i < numeroEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + " (entre 0 y 100): ");
                calificacion = scanner.nextDouble();
            } while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }

        // Calcular y mostrar resultados
        double promedio = calcularPromedio(calificaciones);
        int mayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);
        double calificacionAlta = obtenerCalificacionMasAlta(calificaciones);
        double calificacionBaja = obtenerCalificacionMasBaja(calificaciones);

        // Imprimir resultados
        System.out.printf("Promedio de calificaciones: %.2f%n", promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + mayoresOIguales);
        System.out.printf("Calificación más alta: %.2f%n", calificacionAlta);
        System.out.printf("Calificación más baja: %.2f%n", calificacionBaja);

        scanner.close();
    }

    // Método para calcular el promedio de los estudiantes
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        int i = 0;
        while (i < calificaciones.length) {
            suma += calificaciones[i];
            i++;
        }
        return suma / calificaciones.length;
    }

    // Método para contar calificaciones mayores o iguales al promedio de los estudiantes
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i] >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método para obtener la calificación más alta de esrudiantes
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        int i = 1;
        while (i < calificaciones.length) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
            i++;
        }
        return max;
    }

    // Método para obtener la calificación más baja de los estudiantes 
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double min = calificaciones[0];
        int i = 1;
        do {
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
            i++;
        } while (i < calificaciones.length);
        return min;
    }
}
