
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            } else {
                System.out.print("Sivuja: ");
                int sivut = Integer.valueOf(lukija.nextLine());
                System.out.print("Julkaisuvuosi: ");
                int vuosi = Integer.valueOf(lukija.nextLine());
                Kirja k = new Kirja(nimi, sivut, vuosi);
                kirjat.add(k);
            }
        }
        
        System.out.println("");
        System.out.print("Mitä tulostetaan?");
        String vastaus = lukija.nextLine();
        
        if (vastaus.equals("kaikki")) {
            for (Kirja k: kirjat) {
                System.out.println(k.getNimi() + ", " + k.getSivut() + " sivua, " + k.getVuosi());
            }
        } else if (vastaus.equals("nimi")) {
            for (Kirja k: kirjat) {
                System.out.println(k.getNimi());
            }
        }

    }
}
