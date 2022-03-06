
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lukuja = 0;

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        
        try (Scanner tlukija = new Scanner(Paths.get(tiedosto))) {
            while (tlukija.hasNextLine()) {
                int luku = Integer.valueOf(tlukija.nextLine());
                if (luku >= alaraja && luku <= ylaraja) {
                    lukuja++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Lukuja: " + lukuja);

    }

}
