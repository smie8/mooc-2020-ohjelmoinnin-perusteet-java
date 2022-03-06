/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Laskuri {
    
    private int alkuarvo;
    
    public Laskuri(int alkuarvo) {
        this.alkuarvo = alkuarvo;
    }
    
    public Laskuri() {
        this.alkuarvo = 0;
    }
    
    public int arvo() {
        return this.alkuarvo;
    }
    
    public void lisaa() {
        this.alkuarvo++;
    }
    
    public void vahenna() {
        this.alkuarvo--;
    }
    
    public void lisaa(int lisays) {
        if (lisays >= 0) {
            this.alkuarvo += lisays;
        }
    }
    
    public void vahenna(int vahennys) {
        if (vahennys >= 0) {
            this.alkuarvo -= vahennys;
        }
    }
    
}
