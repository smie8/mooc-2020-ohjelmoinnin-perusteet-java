/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Sailio {
    
    private int sailio;
    
    public Sailio() {
        this.sailio = 0;
    }
    
    public int sisalto(){
        return this.sailio;
    }
    
    public void lisaa(int maara) {
        if (maara > 0) {
            if (this.sailio + maara >= 100) {
                this.sailio = 100;
            } else {
                this.sailio += maara;
            }
        }
    }
    
    public void poista(int maara) {
        if (maara > 0) {
            if (this.sailio - maara < 0) {
                this.sailio = 0;
            } else {
                this.sailio -= maara;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.sailio + "/100";
    }
    
}
