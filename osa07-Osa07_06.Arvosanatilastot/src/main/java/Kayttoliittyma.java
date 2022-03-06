
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kayttoliittyma {
    
    private Scanner lukija;
    private Pisteet pisteet;
    
    public Kayttoliittyma(Scanner lukija, Pisteet pisteet) {
        this.lukija = lukija;
        this.pisteet = new Pisteet();
    }
    
    public void kaynnista() {
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        String syote = "";
        while (!syote.equals("-1")) {
            syote = lukija.nextLine();
            pisteet.lisaa(Integer.valueOf(syote));
        }
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Pisteiden keskiarvo (kaikki): " + (this.pisteet.keskiarvo()));
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + (this.pisteet.keskiarvoHyvaksytyt()));
        System.out.println("Hyväksymisprosentti: " + (this.pisteet.hyvaksymisprosentti()));
        this.pisteet.tulostaArvosanajakauma();
    }
    
}
