
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        
        try (Scanner lukija = new Scanner(Paths.get("data.txt"))) {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                System.out.println(rivi);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }
}
