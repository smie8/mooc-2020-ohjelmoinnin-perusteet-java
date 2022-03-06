import java.util.ArrayList;

public class Tehtavienhallinta {
    
    private ArrayList<Tehtava> tehtavat;
    
    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista() {
        ArrayList<String> palautettavat = new ArrayList<>();
        for (Tehtava tehtava: tehtavat) {
            palautettavat.add(tehtava.getNimi());
        }
        
        return palautettavat;
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }
    
    public void merkkaaTehdyksi(String tehdyksiMerkattavaTehtava) {
        for (Tehtava tehtava: tehtavat) {
            if (tehtava.getNimi().equals(tehdyksiMerkattavaTehtava)) {
                tehtava.setTehty(true);
            }
        }
    }
    
    public boolean onTehty(String tarkistettavaTehtava) {
        for (Tehtava t: tehtavat) {
            if (t.getNimi().equals(tarkistettavaTehtava)) {
                return t.onTehty();
            }
        }
        return false;
    }
    

}
