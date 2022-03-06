
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String syote = lukija.nextLine();
            if (!syote.equals("loppu")) {
                int syoteInt = Integer.valueOf(syote);
                System.out.println(syoteInt*syoteInt*syoteInt);
            } else {
                break;
            }
            
        }
    }
}
