/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kirja {
    
    private String nimi;
    private int sivut;
    private int vuosi;
    
    public Kirja(String nimi, int sivut, int vuosi) {
        this.nimi = nimi;
        this.sivut = sivut;
        this.vuosi = vuosi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getSivut() {
        return this.sivut;
    }
    
    public int getVuosi() {
        return this.vuosi;
    }
    
}
