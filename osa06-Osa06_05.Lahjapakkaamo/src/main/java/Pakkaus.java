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
public class Pakkaus {
    
    private ArrayList<Lahja> lista;
   
    public Pakkaus() {
        this.lista = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        lista.add(lahja);
    }
    
    public int yhteispaino() {
        int paino = 0;
        for (Lahja lahja: lista) {
            paino += lahja.getPaino();
        }
        return paino;
    }
    
}
