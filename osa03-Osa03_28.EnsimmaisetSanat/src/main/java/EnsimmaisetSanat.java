
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String merkkijono = lukija.nextLine();
            
            if (merkkijono.isEmpty()) {
                break;
            } else {
                String tuloste[] = merkkijono.split(" ");
                System.out.println(tuloste[0]);
            }
        }

    }
}
