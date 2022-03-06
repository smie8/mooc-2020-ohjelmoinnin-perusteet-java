
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> koepisteet;
    

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.koepisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        this.koepisteet.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double arvosanojenKeskiarvo() {
        if (this.arvosanat.isEmpty()) {
            return -1;
        }
        
        int summa = 0;
        for (Integer i: this.arvosanat) {
            summa += i;
        }
        return (1.0*summa)/this.arvosanat.size();
    }
    
    public double koepisteidenKeskiarvo() {
        if (this.koepisteet.isEmpty()) {
            return -1;
        }
        int summa = 0;
        for(Integer i: this.koepisteet) {
            summa += i;
        }
        
        return (1.0*summa)/this.koepisteet.size();
    }
    
//    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
//        this.arvosanat.add(this.pisteetArvosanaksi(pisteet));
//    }
}
