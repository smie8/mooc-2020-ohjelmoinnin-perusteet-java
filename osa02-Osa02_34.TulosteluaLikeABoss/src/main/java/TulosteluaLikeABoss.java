
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        while (maara > 0) {
            System.out.print(" ");
            maara--;
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        for (int i = 1; i <= koko; i++) {
            tulostaTyhjaa(koko-i);
            tulostaTahtia(koko-(koko-i));
        }
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        for (int i = 0; i < korkeus; i++) {
            tulostaTyhjaa(korkeus-(i+1));
            tulostaTahtia(1 + (i*2));
        }
        
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus-2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
