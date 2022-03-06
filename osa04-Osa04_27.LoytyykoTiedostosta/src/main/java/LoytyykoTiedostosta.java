
import java.nio.file.Paths;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        boolean loytyiko = false;
        
        try (Scanner fileReader = new Scanner(Paths.get(tiedosto))) {
            while (fileReader.hasNextLine()) {
                String rivi = fileReader.nextLine();
                if (rivi.equals(etsittava)) {
                    loytyiko = true;
                }
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }
        
        if (loytyiko) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt.");
        }
    }
}
