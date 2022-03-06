
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String stringi = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double liukuluku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean totuusarvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + stringi);
        System.out.println("Syötit kokonaisluvun " + luku);
        System.out.println("Syötit liukuluvun " + liukuluku);
        System.out.println("Syötit totuusarvon " + totuusarvo);

    }
}
