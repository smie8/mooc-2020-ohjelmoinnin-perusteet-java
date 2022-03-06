
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samie
 */
public class Pisteet {
    
    private ArrayList<Integer> pisteet;
    private ArrayList<Integer> hyvaksytytPisteet;
    private int pisteetYhteensa;
    private int pisteetYhteensaHyvaksytyt;
    
    private int[] arvosanajakauma;
    
    public Pisteet() {
        this.pisteet = new ArrayList<>();
        this.pisteetYhteensa = 0;
        this.hyvaksytytPisteet = new ArrayList<>();
        this.arvosanajakauma = new int[]{0, 0, 0, 0, 0, 0};
    }
    
    public void lisaa(int piste) {
        if (piste >= 0 && piste <= 100) {
            this.pisteet.add(piste);
            this.pisteetYhteensa += piste;
            if (piste >= 50) {
                this.hyvaksytytPisteet.add(piste);
                this.pisteetYhteensaHyvaksytyt += piste;
            }

            if (piste < 50) {
                arvosanajakauma[0] += 1;
            } else if (piste < 60) {
                arvosanajakauma[1] += 1;
            } else if (piste < 70) {
                arvosanajakauma[2] += 1;
            } else if (piste < 80) {
                arvosanajakauma[3] += 1;
            } else if (piste < 90) {
                arvosanajakauma[4] += 1;
            } else if (piste >= 90) {
                arvosanajakauma [5] += 1;
            }         
        }

    }
    
    
    public double keskiarvo() {
        return (1.0 * this.pisteetYhteensa) / this.pisteet.size();
    }
     
    public double keskiarvoHyvaksytyt() {
        return (1.0 * this.pisteetYhteensaHyvaksytyt) / this.hyvaksytytPisteet.size();
    } 
   
    public double hyvaksymisprosentti() {
        return (1.0* this.hyvaksytytPisteet.size()) / this.pisteet.size()  * 100.0;
    }
    
    public void tulostaArvosanajakauma() {
        System.out.println("Arvosanajakauma:");
        System.out.print("5:");
        for (int i = 0; i < arvosanajakauma[5]; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("4:");
        for (int i = 0; i < arvosanajakauma[4]; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("3:");
        for (int i = 0; i < arvosanajakauma[3]; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("2:");
        for (int i = 0; i < arvosanajakauma[2]; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("1:");
        for (int i = 0; i < arvosanajakauma[1]; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("0:");
        for (int i = 0; i < arvosanajakauma[0]; i++) {
            System.out.print("*");
        }
//        System.out.println("");
    }
    
}
