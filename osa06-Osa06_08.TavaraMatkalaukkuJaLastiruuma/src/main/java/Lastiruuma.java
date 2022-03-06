/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
import java.util.ArrayList;

public class Lastiruuma {
    
    private int paino;
    private int maksimipaino;
    private ArrayList<Matkalaukku> lista;
    
    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.paino = 0;
        this.lista = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if ((this.paino + laukku.yhteispaino()) <= this.maksimipaino) {
            this.lista.add(laukku);
            this.paino += laukku.yhteispaino();
        }
        
    }
    
    @Override
    public String toString() {
        return this.lista.size() + " matkalaukkua (" + this.paino + " kg)";
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku m: this.lista) {
            m.tulostaTavarat();
        }
    }
    
    
    
}
