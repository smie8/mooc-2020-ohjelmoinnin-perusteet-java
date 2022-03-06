
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);
        return uusi;
    }
    
    public boolean vahemman(Raha verrattava) {
        if (this.euroa < verrattava.euroa || (this.euroa == verrattava.euroa && this.senttia < verrattava.senttia)) {
            return true;
        } else {
            return false;
        }
    }
    
    public Raha miinus(Raha vahentaja){
        
        if (this.euroa < vahentaja.eurot() || (this.euroa == vahentaja.eurot() && this.senttia < vahentaja.sentit())) {
            return new Raha(0, 0);
        } else {
           int sentit;
           int eurot = this.euroa;
           if (this.senttia < vahentaja.sentit()) {
               eurot--;
               sentit = 100 - (Math.abs(this.senttia - vahentaja.sentit()));
           } else {
               sentit = this.senttia - vahentaja.sentit();
           }
           
           return new Raha(eurot - vahentaja.eurot(), sentit);
        }
        
    }

}
