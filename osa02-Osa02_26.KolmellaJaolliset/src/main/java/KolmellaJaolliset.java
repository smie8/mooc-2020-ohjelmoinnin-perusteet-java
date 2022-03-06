
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kolmellaJaollisetValilta(3, 6);
    }
    
    public static void kolmellaJaollisetValilta(int eka, int toka) {
        for (int i = eka; i <= toka; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
