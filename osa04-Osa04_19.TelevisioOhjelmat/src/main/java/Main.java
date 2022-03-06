
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true)  {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            } else {
                System.out.print("Pituus : ");
                int pituus = Integer.valueOf(lukija.nextLine());
                TelevisioOhjelma to = new TelevisioOhjelma(nimi, pituus);
                ohjelmat.add(to);
            }
        }
        
        System.out.print("Ohjelman maksimipituus? ");
        int maxPituus = Integer.valueOf(lukija.nextLine());
        for (TelevisioOhjelma to: ohjelmat) {
            if (to.getPituus() <= maxPituus) {
                System.out.println(to);
            }
        }

    }
}
