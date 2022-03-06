/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Lahja {
    
    private String nimi;
    private int paino;
    
    public Lahja(String n, int p) {
        this.nimi = n;
        this.paino = p;
    }
    
    public int getPaino() {
        return this.paino;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.paino + " kg)";
    }
    
}
