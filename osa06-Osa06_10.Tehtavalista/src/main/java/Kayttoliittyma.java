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
    
    private Tehtavalista lista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista t, Scanner s) {
        this.lista = t;
        this.lukija = s;
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("Komento: ");
            String cmd = lukija.nextLine();
            
            if (cmd.equals("lopeta")) {
                break;
            } else if (cmd.equals("lisaa")) {
                System.out.print("Lisättävä: ");
                String lisattava = lukija.nextLine();
                this.lista.lisaa(lisattava);
            } else if (cmd.equals("poista")) {
                System.out.print("Mikä poistetaan? ");
                int poistettava = Integer.valueOf(lukija.nextLine());
                this.lista.poista(poistettava);
            } else if (cmd.equals("listaa")) {
                this.lista.tulosta();
            }
        }
    }
    
}
