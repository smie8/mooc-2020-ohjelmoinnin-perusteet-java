
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        
        try (Scanner tiedostonlukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonlukija.hasNextLine()) {
                String rivi = tiedostonlukija.nextLine();
                String osat[] = rivi.split(",");
                String nimi = osat[0];
                int ika = Integer.valueOf(osat[1]);
                henkilot.add(new Henkilo(nimi, ika));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // toteuta henkilöiden lukeminen ja luominen tänne
        return henkilot;

    }
}
