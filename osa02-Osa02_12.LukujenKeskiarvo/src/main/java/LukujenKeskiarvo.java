
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 0;
        int summa = 0;
        
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku != 0) {
                lkm++;
                summa += luku;
            } else {
                System.out.println("Lukujen keskiarvo " + (summa * 1.0)/lkm);
                break;
            }
        }
    }
}
