
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    @Override 
    public String toString() {
        String alkiot = "";
        if (this.alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        } else {
            for (String alkio: this.alkiot) {
                alkiot += "\n" + alkio;
            }
        }
        
        if (this.alkiot.size() == 1) {
            return "Joukossa " + this.nimi + " on 1 alkio:" + alkiot;
        } else {
            return "Joukossa " + this.nimi + " on " + this.alkiot.size() + " alkiota:" + alkiot;
        }
    }
    
}
