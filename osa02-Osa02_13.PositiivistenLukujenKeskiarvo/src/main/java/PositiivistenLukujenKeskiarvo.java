
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int lkm = 0;
        int summa = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku > 0) {
                lkm++;
                summa += luku;
            } else if (luku == 0) {
                if (lkm == 0) {
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                } else {
                    System.out.println((summa * 1.0)/lkm);
                }
                break;
            }
        }
    }
}
