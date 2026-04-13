
package com.mycompany.ejercicion5;
import java.util.Scanner;
public class Ejercicion5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese X: ");
        int x = sc.nextInt();

        System.out.print("Ingrese Y: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1er cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2do cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3er cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("4to cuadrante");
        } else {
            System.out.println("Está sobre un eje");
        }
    }
}