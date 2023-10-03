import java.sql.SQLOutput;
import java.util.Scanner;

public class Ampliacion12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el ancho del local: ");
        int ancho = sc.nextInt();
        System.out.println("Cual es el largo del local: ");
        int largo = sc.nextInt();
        System.out.println("Cual es la dimension de la baldosa: ");
        int baldosa = sc.nextInt();
        System.out.println("Cual es el numero de baldosas: ");
        int n_baldosas = sc.nextInt();

        int area = ancho * largo;
        int area_baldosas = baldosa * n_baldosas;

        System.out.print((area_baldosas >= area) ? "Tiene suficientes baldosas" : "No tiene suficientes");

    }
}
