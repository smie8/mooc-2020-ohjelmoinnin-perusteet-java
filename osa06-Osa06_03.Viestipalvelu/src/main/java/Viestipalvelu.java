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
public class Viestipalvelu {
    
    private ArrayList<Viesti> lista;
    
    public Viestipalvelu() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Viesti viesti) {
        if (viesti.getSisalto().length() <= 280) {
            this.lista.add(viesti);
        }
    }
    
    public ArrayList<Viesti> getViestit() {
        return this.lista;
    }
    
}
