/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
import java.util.Scanner;

public class Kayttoliittyma {
    
    private Scanner lukija;
    private Vitsipankki pankki;
    
    public Kayttoliittyma(Vitsipankki pankki, Scanner lukija) {
        this.pankki = pankki;
        this.lukija = lukija;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:\n1 - lisää vitsi \n 2 - arvo vitsi \n 3 - listaa vitsit \n X -lopeta");
            String s = lukija.nextLine();
            if (s.equals("X")) {
                break;
            } else if (s.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                this.pankki.lisaaVitsi(vitsi);
            } else if (s.equals("2")) {
                System.out.println(this.pankki.arvoVitsi());
            } else if (s.equals("3")) {
                this.pankki.tulostaVitsit();
            } else {
                System.out.println("Tuntematon komento.");
            }
        }
    }
    
}
