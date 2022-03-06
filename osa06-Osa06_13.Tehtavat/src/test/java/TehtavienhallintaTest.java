
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TehtavienhallintaTest {
    
    private Tehtavienhallinta hallinta = new Tehtavienhallinta();
    
    @Test
    public void tehtavalistaAlussaTyhja() {
//        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        assertEquals(0, hallinta.tehtavalista().size());
    }
    
    @Test
    public void tehtavanLisaaminenKasvattaaListanKokoaYhdella() {
//        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertEquals(1, hallinta.tehtavalista().size());
    }
    
    @Test
    public void lisattyTehtavaLoytyyTehtavalistalta() {
//        Tehtavienhallinta hallinta = new Tehtavienhallinta();
        hallinta.lisaa("Kirjoita testi");
        assertTrue(hallinta.tehtavalista().contains("Kirjoita testi"));
    }
    
    @Test
    public void tehtavanVoiMerkataTehdyksi() {
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertTrue(hallinta.onTehty("Uusi tehtävä"));
    }
    
    @Test
    public void tehdyksiMerkkaamatonEiOleTehty() {
        hallinta.lisaa("Uusi tehtävä");
        hallinta.merkkaaTehdyksi("Uusi tehtävä");
        assertFalse(hallinta.onTehty("Joku tehtävä"));
    }
}
