
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Etunimi: ");
            String etunimi = lukija.nextLine();
            
            if (etunimi.length() < 1) {
                System.out.println("");
                break;   
            } else {
                System.out.print("Sukunimi: ");
                String sukunimi = lukija.nextLine();
                System.out.print("Henkilötunnus: ");
                String hetu = lukija.nextLine();
                Henkilotieto hlo = new Henkilotieto(etunimi, sukunimi, hetu);
                henkilotiedot.add(hlo);
            }
        }
        
        for (Henkilotieto hlo: henkilotiedot) {
            System.out.println(hlo.getEtunimi() + " " + hlo.getSukunimi());
        }

    }
}
