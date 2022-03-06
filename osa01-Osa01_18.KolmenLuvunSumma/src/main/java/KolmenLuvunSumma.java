
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int luku_1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int luku_2 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int luku_3 = Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on " + (luku_1 + luku_2 + luku_3));

    }
}
