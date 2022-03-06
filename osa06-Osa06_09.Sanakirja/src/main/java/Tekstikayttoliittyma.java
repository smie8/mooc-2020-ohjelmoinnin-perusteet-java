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

public class Tekstikayttoliittyma {
    
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner s, Sanakirja sk) {
        this.lukija = s;
        this.sanakirja = sk;
    }
    
    public void kaynnista() {
        
        while (true) {  
            
            System.out.print("Komento: ");
            String syote = lukija.nextLine();
            if (syote.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            } else if (syote.equals("lisaa")) {
                System.out.print("Sana: ");    
                String sana = lukija.nextLine();
                System.out.print("Käännös: ");
                String kaannos = lukija.nextLine();
                this.sanakirja.lisaa(sana, kaannos);
            } else if (syote.equals("hae")) {
              
                System.out.print("Haettava: ");
                String haku = lukija.nextLine();
                
                if (this.sanakirja.kaanna(haku) != null) {
                    System.out.println(this.sanakirja.kaanna(haku));
                } else {
                    System.out.println("Sanaa " + haku + " ei löydy");
                }
                
                
            } else {
                System.out.println("Tuntematon komento");
            }
        
        }
        
    }
    
    
}
