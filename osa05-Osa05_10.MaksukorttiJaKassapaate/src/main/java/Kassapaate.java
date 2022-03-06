
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if (maksu < 2.5) {
            return maksu;
        } else {
            double vaihtorahat = maksu - 2.5;
            this.rahaa += 2.5;
            edulliset++;
            return vaihtorahat;     
        }
    }

    public double syoMaukkaasti(double maksu) {
        // maukas lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if (maksu < 4.3) {
            return maksu;
        } else {
            double vaihtorahat = maksu - 4.3;
            this.rahaa += 4.3;
            maukkaat++;
            return vaihtorahat;     
        }
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.saldo() >= 2.5) {
            kortti.otaRahaa(2.5);
            //this.rahaa += 2.5;
            edulliset++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.saldo() >= 4.3) {
            kortti.otaRahaa(4.3);
            //this.rahaa += 4.3;
            maukkaat++;
            return true;
        } else {
            return false;
        }
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            this.rahaa += summa;
        kortti.lataaRahaa(summa);        
        }

    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
