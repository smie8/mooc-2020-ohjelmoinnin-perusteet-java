
import java.util.Scanner;

public class KonekoeTehtava3 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

//        Koira rolle = new Koira("Rolle", "katupora", "Rolle täällä, vauhti päällä!");
//        Koira vainu = new Koira("Vainu", "tennispallotykki", "Vainu hoitaa homman!");
//
//        System.out.println(rolle);
//        System.out.println(vainu);
//
//        rolle.lausahda();
//
//        System.out.println(rolle);
//
//        rolle.syo();
//        System.out.println(rolle);
//
//        vainu.lausahda();
//        vainu.lausahda();
//        vainu.lausahda();
//
//        System.out.println(vainu);
//        vainu.syo();
//        System.out.println(vainu);
//
//        System.out.println(rolle);
//        rolle.lausahda();
//        rolle.lausahda();
//        rolle.lausahda();
//        rolle.lausahda();
//        rolle.lausahda();
//        rolle.lausahda();
//        System.out.println(rolle);
//        rolle.syo();
//        System.out.println(rolle);

        Koira rolle = new Koira("Rolle", "katupora", "Rolle täällä, vauhti päällä!");
        Koira vainu = new Koira("Vainu", "tennispallotykki", "Vainu hoitaa homman!");
        Koira kaja = new Koira("Kaja", "siivet", "Ilmojen teille!");
        Koira halti = new Koira("Halti", "lumilauta", "Lunta tai jäätä, ei kylmää päätä!");

        Lauma hau = new Lauma("Ryhmä Hau");
        hau.lisaaKoira(rolle);
        hau.lisaaKoira(vainu);
        System.out.println(hau);
        System.out.println(hau.kyllaisyys());
        System.out.println("--");
        hau.tulostaErikoisvarusteet();
        hau.lausahdaYhdessa();
        System.out.println(hau);
        System.out.println("--");
        hau.lisaaKoira(kaja);
        hau.lisaaKoira(halti);
        System.out.println(hau);
        System.out.println("--");
        System.out.println(rolle);
        rolle.lausahda();
        System.out.println(hau);
        System.out.println(hau.kyllaisyys());
        rolle.syo();
        System.out.println(hau);
        System.out.println("--");
        hau.syo();
        System.out.println(hau);

    }

}
