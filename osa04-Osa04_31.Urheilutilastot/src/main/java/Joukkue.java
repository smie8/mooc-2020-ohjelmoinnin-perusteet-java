/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Joukkue {
    
    private String nimi;
    private int voitot;
    private int tappiot;
    private int otteluita;
    
    public Joukkue(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getVoitot() {
        return this.voitot;
    }
    
    public int getTappiot() {
        return this.tappiot;
    }
    
    public int getOtteluita() {
        return this.otteluita;
    }
    
    public void voitto() {
        this.voitot++;
    }
    
    public void tappio() {
        this.tappiot++;
    }
    
    public void ottelu() {
        this.otteluita++;
    }
    
}
