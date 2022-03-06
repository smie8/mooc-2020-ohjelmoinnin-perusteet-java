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

public class Pakka {
    
    private ArrayList<String> lista;
    
    public Pakka() {
        this.lista = new ArrayList<>();
    }
    
    public boolean onTyhja() {
        return this.lista.isEmpty();
    }
   
    public void lisaa(String arvo) {
        this.lista.add(arvo);
    }
    
    public ArrayList<String> arvot() {
        return this.lista;
    }
    
    public String ota() {
        String palautus = this.lista.get(this.lista.size()-1);
        this.lista.remove(this.lista.size()-1);
        return palautus;

    }
    
    
}
