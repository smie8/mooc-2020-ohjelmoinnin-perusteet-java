/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Tavara {
    
    private String nimi;
    private int paino;
    
    public Tavara(String n, int p) {
        this.nimi = n;
        this.paino = p;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getPaino() {
        return this.paino;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.paino + " kg)";
    }
    
    
    
}
