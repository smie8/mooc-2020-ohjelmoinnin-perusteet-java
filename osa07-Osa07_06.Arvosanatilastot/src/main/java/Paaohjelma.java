
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pisteet pisteet = new Pisteet();

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        
        Kayttoliittyma kayttis = new Kayttoliittyma(lukija, pisteet);
        kayttis.kaynnista();
        
    }
}
