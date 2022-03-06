/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Maksukortti {
    
    private double saldo;
    
    public Maksukortti(double saldoAlussa) {
        this.saldo = saldoAlussa;
    }
    
    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
    public void syoEdullisesti() {
        if (this.saldo >= 2.6) {
            this.saldo -= 2.6;
        }
    }
    
    public void syoMaukkaasti() {
        if (this.saldo >= 4.6) {
            this.saldo -= 4.6;
        }
    }
    
    public void lataaRahaa(double rahamaara) {
        if (this.saldo + rahamaara >= 150) {
            this.saldo = 150;
        } else if (rahamaara >= 0) {
            this.saldo += rahamaara;
        }
    }
    
}
