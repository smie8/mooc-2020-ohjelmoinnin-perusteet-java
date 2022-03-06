/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Kuutio {
        
    private int sarmanPituus;
    
    public Kuutio(int sarmanPituus) {
        this.sarmanPituus = sarmanPituus;
    }
    
    public int tilavuus() {
        return sarmanPituus*sarmanPituus*sarmanPituus;
    }
    
    public String toString() {
        return "Kuution särmän pituus on " + this.sarmanPituus + ", tilavuus on " + this.tilavuus();
    }

    
}
