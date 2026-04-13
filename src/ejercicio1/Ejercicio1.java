
package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota: ");
        int nota = sc.nextInt();

        if (nota < 4) {
            System.out.println("Desaprobo");
        } else {
            if (nota == 10) {
                System.out.println("Aprobo - Sobresaliente");
            } else {
                System.out.println("Aprobo");
            }
        }
    }
}