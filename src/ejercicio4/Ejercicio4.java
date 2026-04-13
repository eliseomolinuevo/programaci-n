
package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("Primer trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Segundo trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Tercer trimestre");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Cuarto trimestre");
        } else {
            System.out.println("Mes invalido");
        }
    }
}