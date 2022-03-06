
import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        System.out.println("Pienin: " + Paaohjelma.pienin(taulukko));
        System.out.println("Pienimmän indeksi: " + Paaohjelma.pienimmanIndeksi(taulukko));
        int[] luvut = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 1, 0);
        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 0, 3);
        System.out.println(Arrays.toString(luvut));
        Paaohjelma.jarjesta(luvut);
    }
    
    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i: taulukko) {
            if (i < pienin) {
                pienin = i;
            }
        }
        return pienin;
    }
    
    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int pieninIndeksi = 0;
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                pieninIndeksi = i;
            }
        }
        return pieninIndeksi;
    }
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int pienin = taulukko[aloitusIndeksi];
        int pieninIndeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length; i++) {
            if (taulukko[i] < pienin) {
                pienin = taulukko[i];
                pieninIndeksi = i;
            }
        }
        return pieninIndeksi;
    }
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int temp = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = temp;
    }
    
    public static void jarjesta(int[] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            System.out.println(Arrays.toString(taulukko));
            int indeksi = Paaohjelma.pienimmanIndeksiAlkaen(taulukko, i);
            Paaohjelma.vaihda(taulukko, i, indeksi);            
        }
    }

}
