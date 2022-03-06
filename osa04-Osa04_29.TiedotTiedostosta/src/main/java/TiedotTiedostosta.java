
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        try (Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                String palat[] = rivi.split(",");
                String nimi = palat[0];
                int ika = Integer.valueOf(palat[1]);
                String ika_s;
                if (ika != 1) {
                    ika_s = ika + " vuotta";
                } else {
                    ika_s = ika + " vuosi";
                }
                System.out.println(nimi + ", ikä: " + ika_s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
