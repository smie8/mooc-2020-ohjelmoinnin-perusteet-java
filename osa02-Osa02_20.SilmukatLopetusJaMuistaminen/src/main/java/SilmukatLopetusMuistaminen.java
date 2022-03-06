
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä luvut:");
        int summa = 0;
        int lkm = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku != -1) {
                summa += luku;
                lkm++;
                if (luku % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                break;
            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lkm);
        System.out.println("Keskiarvo: " + (summa * 1.0)/lkm);
        System.out.println("Parillisia: " + even);
        System.out.println("Parittomia: " + odd);
    }
}
