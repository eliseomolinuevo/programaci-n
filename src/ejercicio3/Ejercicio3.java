
package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero (1-99): ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 9) {
            System.out.println("Tiene 1 digito");
        } else if (num >= 10 && num <= 99) {
            System.out.println("Tiene 2 digitos");
        } else {
            System.out.println("Número fuera de rango");
        }
    }
}