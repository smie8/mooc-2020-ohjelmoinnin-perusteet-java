
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);


        while (true ) {
            String sana = lukija.nextLine();
            
            if (sana.isEmpty()) {
                break;
            } else {
                String[] tuloste = sana.split(" ");
                for (String merkkijono: tuloste) {
                    System.out.println(merkkijono);
                }
            }
        }
    }
}
