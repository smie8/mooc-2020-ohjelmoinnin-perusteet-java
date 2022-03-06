
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {

//        Scanner lukija = new Scanner(System.in);
//        ArrayList<String> vitsit = new ArrayList<>();
//        System.out.println("Voihan vitsi!");
//        while (true) {
//        System.out.println("Komennot:");
//        System.out.println(" 1 - lisää vitsi");
//        System.out.println(" 2 - arvo vitsi");
//        System.out.println(" 3 - listaa vitsit");
//        System.out.println(" X - lopeta");
//        String komento = lukija.nextLine();
//        if (komento.equals("X")) {
//        break;
//        }
//        if (komento.equals("1")) {
//        System.out.println("Kirjoita lisättävä vitsi:");
//        String vitsi = lukija.nextLine();
//        vitsit.add(vitsi);
//        } else if (komento.equals("2")) {
//        System.out.println("Arvotaan vitsi.");
//        if (vitsit.isEmpty()) {
//        System.out.println("Vitsit vähissä.");
//        } else {
//        Random arpa = new Random();
//        int indeksi = arpa.nextInt(vitsit.size());
//        System.out.println(vitsit.get(indeksi));
//        }
//        } else if (komento.equals("3")) {
//        System.out.println("Tulostetaan vitsit.");
//        for (String vitsi : vitsit) {
//        System.out.println(vitsi);
//        }
//        }
//        }
        Vitsipankki pankki = new Vitsipankki();
        pankki.lisaaVitsi("Mikä on punaista ja tuoksuu siniselle maalille? - Punainen maali.");
        pankki.lisaaVitsi("Mikä on sinistä ja tuoksuu punaiselle maalille? - Sininen maali.");

        System.out.println("Arvotaan vitsejä:");
        for (int i = 0; i < 5; i++) {
            System.out.println(pankki.arvoVitsi());
        }

        System.out.println("");
        System.out.println("Tulostetaan vitsit:");
        pankki.tulostaVitsit();
    }
}
