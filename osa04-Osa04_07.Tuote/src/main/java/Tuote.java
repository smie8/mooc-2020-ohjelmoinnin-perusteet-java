/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Tuote {
    
    private double hinta;
    private int lkm;
    private String nimi;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.hinta = hintaAlussa;
        this.lkm = maaraAlussa;
        this.nimi = nimiAlussa;
    }
    
    public void tulostaTuote() {
        System.out.println(this.nimi + ", hinta " + this.hinta + ", " + this.lkm + "kpl");
    }
    
}
