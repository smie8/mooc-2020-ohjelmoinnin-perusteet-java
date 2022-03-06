
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Resepti {
    
    private String nimi;
    private int keittoaika;
    private ArrayList<String> raakaAineet;
    
    public Resepti(String nimi, int keittoaika, ArrayList<String> raakaAineet) {
        this.nimi = nimi;
        this.keittoaika = keittoaika;
        this.raakaAineet = raakaAineet;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKeittoaika() {
        return this.keittoaika;
    }
    
    public ArrayList<String> getRaakaAineet() {
        return this.raakaAineet;
    }
    
}
