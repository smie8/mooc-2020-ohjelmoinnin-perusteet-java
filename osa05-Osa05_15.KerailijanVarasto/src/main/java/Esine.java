/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Esine {
    
    private String tunnus;
    private String nimi;
    
    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    @Override
    public String toString() {
        return (this.tunnus + ": " + this.nimi);
    }
    
    @Override
    public boolean equals(Object vrt) {
        if (this == vrt) {
            return true;
        }
        
        if (!(vrt instanceof Esine)) {
            return false;
        }
        
        Esine e = (Esine) vrt;
        
        if (this.tunnus.equals(e.tunnus)) {
            return true;
        }
        
        return false;
    }
    
}
