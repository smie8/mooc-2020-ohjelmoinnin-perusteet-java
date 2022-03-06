
import java.util.ArrayList;
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
    private ArrayList<Lintu> linnut;
    
    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija;
        this.linnut = new ArrayList<>();
    }
    
    public void kaynnista() {
        while (true) {
            System.out.print("?");
            boolean lopeta = false;
            String komento = lukija.nextLine();
            switch(komento) {
                case "Lisaa":
                    Lintu uusi = new Lintu(lukija);
                    uusi.lisaa();
                    linnut.add(uusi);
                    break;
                case "Havainto":
                    System.out.print("Mikä havaittu? ");
                    String havainto = lukija.nextLine();
                    boolean loytyi = false;
                    for (Lintu l: linnut) {
                        if (l.getNimi().equals(havainto)) {
                            loytyi = true;
                            l.havainto();
                        }
                    }
                    
                    if (!loytyi) {
                        System.out.println("Ei ole lintu!");
                    }
                    break;
                case "Tilasto":
                    for (Lintu l: linnut) {
                        System.out.println(l);
                    }
                    break;
                case "Nayta":
                    System.out.print("Mikä? ");
                    String mika = lukija.nextLine();
                    for (Lintu l: linnut) {
                        if (l.getNimi().equals(mika)) {
                            System.out.println(l);
                        }
                    }
                    break;
                case "Lopeta":
                    lopeta = true;
                    break;
                
            }
            
            if (lopeta) {
                break;
            }
            
        }
    }
    
}
