/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class practica3_4_ej_3 {

    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, sol1 = 0, sol2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el coeficiente de x²"); //a=0 error
        a = scan.nextDouble();
        System.out.println("Introduce el coeficiente de x");
        b = scan.nextDouble();
        System.out.println("Introduce el termino independiente");
        c = scan.nextDouble();
        sol1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        sol2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("Las soluciones son: " + sol1 + "y" + sol2);
    }
}
