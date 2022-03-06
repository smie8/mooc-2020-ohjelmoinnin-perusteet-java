
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        ArrayList<Joukkue> joukkueet = new ArrayList<>();
        
        try (Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                String osat[] = rivi.split(",");
                String nimi_koti = osat[0];
                int tulos_koti = Integer.valueOf(osat[2]);
                String nimi_vieras = osat[1];
                int tulos_vieras = Integer.valueOf(osat[3]);
                boolean koti_voitti;
                boolean vieras_voitti;
                if (tulos_koti > tulos_vieras) {
                    koti_voitti = true;
                    vieras_voitti = false;
                } else {
                    koti_voitti = false;
                    vieras_voitti = true;
                }
                
                boolean koti_loytyy = false;
                boolean vieras_loytyy = false;
                
                for (Joukkue j: joukkueet) {
                    if (j.getNimi().equals(nimi_koti)) {
                        koti_loytyy = true;
                        j.ottelu();
                        if (koti_voitti) {
                            j.voitto();
                        } else {
                            j.tappio();
                        }
                    } else if (j.getNimi().equals(nimi_vieras)) {
                        vieras_loytyy = true;
                        j.ottelu();
                        if (vieras_voitti) {
                            j.voitto();
                        } else {
                            j.tappio();
                        }
                    }
                    
                }
                
                if (!koti_loytyy) {
                    Joukkue uusi = new Joukkue(nimi_koti);
                    uusi.ottelu();
                    if (koti_voitti) {
                        uusi.voitto();
                    } else {
                        uusi.tappio();
                    }
                    joukkueet.add(uusi);
                } else if (!vieras_loytyy) {
                    Joukkue uusi2 = new Joukkue(nimi_vieras);
                    uusi2.ottelu();
                    if (vieras_voitti) {
                        uusi2.voitto();
                    } else {
                        uusi2.tappio();
                    }
                    joukkueet.add(uusi2);
                }
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkueNimi = lukija.nextLine();
        boolean loytyiko = false;
        
        for (Joukkue j: joukkueet) {
            if (j.getNimi().equals(joukkueNimi)) {
                System.out.println("Otteluita: " + j.getOtteluita());
                System.out.println("Voittoja: " + j.getVoitot());
                System.out.println("Tappioita: " + j.getTappiot());
                loytyiko = true;
            }
        }
        
        if (!loytyiko) {
            System.out.println("Otteluita: 0");
            System.out.println("Voittoja: 0");
            System.out.println("Tappioita: 0");
        }

    }

}
