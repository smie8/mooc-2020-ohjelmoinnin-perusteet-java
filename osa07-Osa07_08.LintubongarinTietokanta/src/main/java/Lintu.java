
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
public class Lintu {
    
    private String nimi;
    private String latinaNimi;
    private int havaintoja;
    private Scanner lukija;
    
    public Lintu(Scanner s) {
        this.nimi = "";
        this.latinaNimi = "";
        this.havaintoja = 0;
        this.lukija = s;
    }
    
    public void lisaa() {
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();
        this.nimi = nimi;
        System.out.print("Latinankielinen nimi: ");
        String latNimi = lukija.nextLine();
        this.latinaNimi = latNimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void havainto() {
        this.havaintoja++;
    }
    
    @Override
    public String toString() {
        String havaintoja = "";
        if (this.havaintoja == 1) {
            havaintoja = "havainto";
        } else {
            havaintoja = "havaintoa";
        }
        return this.nimi + " (" + this.latinaNimi + "): " + this.havaintoja + " " + havaintoja;
    }
    
}
