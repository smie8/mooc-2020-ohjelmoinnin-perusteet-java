
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
public class Lauma {
    
    private ArrayList<Koira> lista;
    private String nimi;
    
    public Lauma(String nimi) {
        this.nimi = nimi;
        this.lista = new ArrayList<>();
    }
    
    public void lisaaKoira(Koira dogi) {
        this.lista.add(dogi);
    }
    
    public void tulostaErikoisvarusteet() {
        for (Koira dogi: this.lista) {
            dogi.tulostaErikoisvaruste();
        }
    }
    
    public double kyllaisyys() {
        int lkm = this.lista.size();
        int summa = 0;
        
        for (Koira dogi: this.lista) {
            summa += dogi.getKyllaisyys();
        }
        
        double ka = 1.0*summa/lkm;       
        return ka;
    }
    
    public void syo() {
        for (Koira dogi: this.lista) {
            dogi.syo();
        }
    }
    
    public void lausahdaYhdessa() {
        for (Koira dogi: this.lista) {
            dogi.lausahda();
        }
    }
    
    @Override
    public String toString() {
        
        // Nimet pilkkuerotelluksi merkkijonoksi
        ArrayList<String> nimet = new ArrayList<>();
        String nimetString = "";
        
        for (Koira dogi: this.lista) {
            nimet.add(dogi.getNimi());
        }
        
        for (int i = 0; i < nimet.size(); i++) {
            nimetString += nimet.get(i);
            if (i < nimet.size() - 1) {
                nimetString += ", ";
            }
        }
        
        // Lopuksi palautus
        return this.nimi + ": " + nimetString + " (yht " + this.lista.size() + "), kylläisyys: " + this.kyllaisyys() + "/5.0";
    }
    
}
