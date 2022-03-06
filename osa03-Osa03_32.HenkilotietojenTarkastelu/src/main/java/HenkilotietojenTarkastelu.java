
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int pisin_pituus = 0;
        String pisin_nimi = "";
        int lkm = 0;
        int summa = 0;

        while (true) {
            
            String hlo = lukija.nextLine();
                        
            if (hlo.isEmpty()) {
                break;
            } else {
                String[] palat = hlo.split(",");
                if (palat[0].length() > pisin_pituus) {
                    pisin_pituus = palat[0].length();                  
                    pisin_nimi = palat[0];
                }
                summa += Integer.valueOf(palat[1]);
                lkm++;
            } 
            
        }
        System.out.println("Pisin nimi: " + pisin_nimi);
        System.out.println("Syntymävuosien keskiarvo: " + (summa * 1.0) / lkm);
    }
}
