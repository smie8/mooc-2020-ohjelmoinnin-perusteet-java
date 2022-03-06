
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
public class Reseptit {
    
    private ArrayList<Resepti> reseptit;
    
    public Reseptit() {
        this.reseptit = new ArrayList<>();
    }
    
    public void lisaa(Resepti r) {
        this.reseptit.add(r);
    }
    
    public ArrayList<Resepti> getReseptit() {
        return this.reseptit;
    }
    
    public void hae(String nimi) {
        System.out.println("\nReseptit:");
        for (Resepti r: reseptit) {
            if (r.getNimi().toLowerCase().contains(nimi)) {
                System.out.println(r.getNimi() + ", keittoaika: " + r.getKeittoaika());
            }
        }
    }
    
    public void hae(int keittoaika) {
        System.out.println("\nReseptit:");
        for (Resepti r: reseptit) {
            if (r.getKeittoaika() <= keittoaika) {
                System.out.println(r.getNimi() + ", keittoaika: " + r.getKeittoaika());
            }
        }
    }
    
    public void haeAine(String aine) {
        System.out.println("\nReseptit:");
        for (Resepti r: reseptit) {
            for (String a: r.getRaakaAineet()) {
                if (aine.equals(a)) {
                    System.out.println(r.getNimi() + ", keittoaika: " + r.getKeittoaika());         
                }
            }
        }
    }
    
    
    
}
