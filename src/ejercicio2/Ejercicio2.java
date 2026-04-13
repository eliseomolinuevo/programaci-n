
package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        int n1 = sc.nextInt();

        System.out.print("Nota 2: ");
        int n2 = sc.nextInt();

        System.out.print("Nota 3: ");
        int n3 = sc.nextInt();

        double promedio = (n1 + n2 + n3) / 3.0;

        if (promedio >= 8) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }
    }
}