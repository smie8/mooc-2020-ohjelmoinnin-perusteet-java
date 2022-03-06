
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KonekoeTehtava2 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
    ArrayList<String> mjonot = new ArrayList<>();
    mjonot.add("hei");
    mjonot.add("hei");
    mjonot.add("taas");
    mjonot.add("maailma");
    mjonot.add("maailma");
    toistuvatMerkkijonot(mjonot, 2);
    System.out.println();

    ArrayList<Integer> luvut = new ArrayList<>();
    luvut.add(0);
    luvut.add(1);
    luvut.add(2);
    luvut.add(3);
    luvut.add(4);
    luvut.add(5);
    luvut.add(6);
    luvut.add(7);

    System.out.println();
    System.out.println(luvut);
    System.out.println();
    poistaOsa(luvut);
    System.out.println();
    System.out.println(luvut);
    System.out.println();
    HashMap<String, String> parit = new HashMap<>();
    parit.put("eka", "1");
    parit.put("toka", "2");

    HashMap<String, String> uudet = kaanna(parit);

    for(String avain: uudet.keySet()) {
        System.out.println(avain + " " + uudet.get(avain));
    }

    }
    
    public static void toistuvatMerkkijonot(ArrayList<String> merkkijonot, int kertaa) {
        // Luodaan hajautustaulu merkkijonojen ja niiden lukumäärän säilöntää varten
        HashMap<String, Integer> toistuvat = new HashMap<>();
        
        // Pusketaan merkkijonot hajautustauluun
        for(String merkkijono: merkkijonot) {
            toistuvat.put(merkkijono, 0);
        }
        
        // Käydään läpi lista, ja lasketaan esiintymiskerrat hajautustauluun
        for (String merkkijono: merkkijonot) {
            for (String avain: toistuvat.keySet()) {
                if (merkkijono.equals(avain)) {
                    toistuvat.put(avain, toistuvat.get(avain)+1);
                }
            }
        }
        
        // Lopuksi tulostetaan avaimet, jotka esiintyvät enemmän kuin x kertaa
        for (String avain: toistuvat.keySet()) {
            if (toistuvat.get(avain) == kertaa) {
                System.out.println(avain);
            }
        }
        
    }
    
    public static void poistaOsa(ArrayList<Integer> luvut) {
        
        for(int i = luvut.size()-1; i >= 0; i--) {
            int luku = luvut.get(i);
            if ((luku % 3 == 0 || luku % 7 == 0) && luku != 0) {
                luvut.remove(luku);
            }
        }
        
    }
    
    public static HashMap<String, String> kaanna(HashMap<String, String> parit) {
        
        HashMap<String, String> palautettava = new HashMap<>();
        
        for (String avain: parit.keySet()) {
            palautettava.put(parit.get(avain), avain);
        }
        
        return palautettava;
        
    }

}
