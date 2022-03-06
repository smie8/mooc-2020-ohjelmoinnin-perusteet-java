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

public class Tehtavalista {
    
    private ArrayList<String> lista;
    
    public Tehtavalista() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        this.lista.add(tehtava);
    }
    
    public void tulosta() {
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println(i+1 + ": " + this.lista.get(i));
        }
    }
    
    public void poista(int numero) {
        this.lista.remove(numero-1);
    }
    
}
