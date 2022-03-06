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

public class Matkalaukku {
    
    private ArrayList<Tavara> tavarat;
    private int maksimipaino;
    private int paino;
    
    
    public Matkalaukku(int maxpaino) {
        this.maksimipaino = maxpaino;
        this.paino = 0;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara) {
        if ((this.paino + tavara.getPaino()) <= this.maksimipaino) {
            this.tavarat.add(tavara);
            this.paino += tavara.getPaino();
        }
    }
    
    public void tulostaTavarat() {
        String tavarat = "";
        for (Tavara t: this.tavarat) {
            tavarat += "\n" + t.getNimi() + "(" + t.getPaino() + " kg)";
        }
        System.out.println("Matkalaukussa on seuraavat tavarat:" + tavarat);
    }
    
    public int yhteispaino() {
        return paino;
    }
    
    public Tavara raskainTavara() {
        if (this.tavarat.isEmpty()) {
            return null;
        }
        Tavara raskain = this.tavarat.get(0);
        for (Tavara t: this.tavarat) {
            if (t.getPaino() > raskain.getPaino()) {
                raskain = t;
            }
        }
        
        return raskain;
    }
    
    @Override
    public String toString() {
        if (this.tavarat.isEmpty()) {
            return "ei tavaroita (0 kg)";
        } else {
            String tavara = "";
            if (this.tavarat.size() == 1) {
                tavara = " tavara";
            } else {
                tavara = " tavaraa";
            }
        
            return this.tavarat.size() + tavara + " (" + this.paino + " kg)";
        }
    }
    
}
