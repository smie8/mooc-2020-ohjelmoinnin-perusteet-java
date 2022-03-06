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

public class Huone {
    
    private ArrayList<Henkilo> lista;
    
    public Huone(){
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
        this.lista.add(henkilo);
    }
    
    public boolean onTyhja() {
        return this.lista.isEmpty();
    }
    
    public ArrayList<Henkilo> getHenkilot() {
        return lista;
    }
    
    public Henkilo lyhin() {
        if (this.lista.isEmpty()) {
            return null;
        }
        
        Henkilo lyhin = this.lista.get(0);
        for (Henkilo h: this.lista) {
            if (h.getPituus() < lyhin.getPituus()) {
                lyhin = h;
            }
        }
        return lyhin;
    }
    
    public Henkilo ota() {
        Henkilo lyhin = this.lyhin();
        this.lista.remove(lyhin);
        return lyhin;
    }
    
}
