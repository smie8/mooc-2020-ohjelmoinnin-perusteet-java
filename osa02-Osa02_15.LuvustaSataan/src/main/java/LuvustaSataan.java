
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        for (int luku = Integer.valueOf(lukija.nextLine()); luku <= 100; luku++) {
            System.out.println(luku);
        }
    }
}
