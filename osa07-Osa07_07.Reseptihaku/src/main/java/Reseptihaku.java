
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mistä luetaan?");
        String tiedosto = lukija.nextLine();
//        ArrayList<Resepti> reseptit = new ArrayList<>();
        Reseptit reseptilista = new Reseptit();
        
        try {
            Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto));

            while (tiedostonlukija.hasNextLine()) {
                int rivi = 1;
                String nimi = "";
                int keittoaika = 0;
                ArrayList<String> raakaAineet = new ArrayList<>();
                
                while (true) {
                    String luettuRivi = tiedostonlukija.nextLine();
                    if (rivi == 1) {
                        nimi = luettuRivi;
                    } else if (rivi == 2) {
                        keittoaika = Integer.valueOf(luettuRivi);
                    } else {
                        raakaAineet.add(luettuRivi);
                    } 

                    if (luettuRivi.equals("") || !tiedostonlukija.hasNextLine()) {
                        Resepti uusi = new Resepti(nimi, keittoaika, raakaAineet);
                        reseptilista.lisaa(uusi);
                        break;
                    }
                    rivi ++; 
                }
                
            }
            
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nKomennot:\nlistaa - listaa reseptit\nlopeta - lopettaa ohjelman\nhae nimi - hakee reseptiä nimen perusteella\nhae aine - hakee reseptiä raaka-aineen perusteella");
        
        while (true) {
            System.out.print("Syötä komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("listaa")) {
                for (Resepti res: reseptilista.getReseptit()) {
                    System.out.print(res.getNimi() + ", keittoaika: " + res.getKeittoaika() + "\n");
                }
            } else if (komento.equals("hae nimi")) {
                System.out.print("Mitä haetaan: ");
                String hakusana = lukija.nextLine();
                reseptilista.hae(hakusana);
            } else if (komento.equals("hae keittoaika")) {
                System.out.print("Keittoaika korkeintaan: ");
                int aika = Integer.valueOf(lukija.nextLine());
                reseptilista.hae(aika);
            } else if (komento.equals("hae aine")) {
                System.out.print("Mitä raaka-ainetta haetaan: ");
                String sana = lukija.nextLine();
                reseptilista.haeAine(sana);
            }
        }
        
        
    }

}
