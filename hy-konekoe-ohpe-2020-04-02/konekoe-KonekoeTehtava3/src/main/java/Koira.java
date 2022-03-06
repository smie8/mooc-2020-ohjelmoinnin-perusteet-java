/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Koira {
    
    private String nimi;
    private String erityisvaruste;
    private String lausahdus;
    private int kyllaisyys;
    
    public Koira(String nimi, String erityisvaruste, String lausahdus) {
        this.nimi = nimi;
        this.erityisvaruste = erityisvaruste;
        this.lausahdus = lausahdus;
        this.kyllaisyys = 5;
    }
    
    public int getKyllaisyys() {
        return this.kyllaisyys;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    
    public void lausahda() {
        if (kyllaisyys > 0) {
            System.out.println(this.lausahdus);
            kyllaisyys--;
        }
    }
    
    public void syo() {
        this.kyllaisyys = 5;
    }
    
    public void tulostaErikoisvaruste() {
        System.out.println(this.erityisvaruste);
    }
    
    @Override
    public String toString() {
        return this.nimi + ", erityisvaruste: " + this.erityisvaruste + ", lausahdus: " + this.lausahdus + ", kylläisyys: " + this.kyllaisyys + "/5";
    }
    
}
