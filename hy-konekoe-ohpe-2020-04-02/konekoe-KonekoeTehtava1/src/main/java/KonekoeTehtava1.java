
import java.util.Scanner;

public class KonekoeTehtava1 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String lyhin = "";
        String pisin = "";
        int lkm = 0;
        int summa = 0;
        
        while (true) {
            String syote = lukija.nextLine();
            
            if (syote.equals("loppu")) {
                break;
            }
            
            if (lkm == 0) {
                lyhin = syote;
                pisin = syote;
            } else {
                if (syote.length() < lyhin.length()) {
                    lyhin = syote;
                }
                
                if (syote.length() > pisin.length()) {
                    pisin = syote;
                }
            }
            
            summa += syote.length();
            lkm++;
            
        }
        
        if (lkm == 0) {
            System.out.println("");
            System.out.println("Ei merkkijonoja.");
        } else {
            System.out.println("lyhin: " + lyhin);
            System.out.println("pisin: " + pisin);
            System.out.println("keskipituus: " + 1.0*summa/lkm);
        }

    }

}
