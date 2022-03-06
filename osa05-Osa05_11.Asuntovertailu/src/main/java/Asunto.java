
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public int getHuoneita() {
        return huoneita;
    }
    
    public int getNelioita() {
        return nelioita;
    }
    
    public int getNeliohinta() {
        return neliohinta;
    }
    
    public int getHinta() {
        return neliohinta*nelioita;
    }
    
     
    public boolean suurempi(Asunto verrattava) {
        if (verrattava.getNelioita() > this.getNelioita()) {
            return false;
        } else {
            return true;
        }
    }
    
    public int hintaero(Asunto verrattava) {
        return Math.abs(verrattava.getHinta() - this.getHinta());
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        if (verrattava.getHinta() > this.getHinta()) {
            return false;
        } else {
            return true;
        }
    }
    
    

}
