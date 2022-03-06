
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto parillinen = new Lukutilasto();
        Lukutilasto pariton = new Lukutilasto();
        
        System.out.println("Anna lukuja:");
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                System.out.println("Summa: " + tilasto.summa());
                System.out.println("Parillisten summa: " + parillinen.summa());
                System.out.println("Parittomien summa: " + pariton.summa());
                break;
            } else {
                tilasto.lisaaLuku(luku);
                if (luku % 2 == 0) {
                    parillinen.lisaaLuku(luku);
                } else {
                    pariton.lisaaLuku(luku);
                }
            }
        }
    }
}
