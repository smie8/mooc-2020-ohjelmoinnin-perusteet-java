
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int kertoma = 1;
        System.out.print("Anna luku:");
        int luku = Integer.valueOf(lukija.nextLine());
        for (int i = 1; i <= luku; i++) {
            kertoma *= i;
        }
        System.out.println("Kertoma on " + kertoma);
    }
}
