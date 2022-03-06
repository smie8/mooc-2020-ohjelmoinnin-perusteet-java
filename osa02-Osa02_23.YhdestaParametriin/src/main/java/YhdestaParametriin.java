
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(5);
    }
    
    public static void tulostaLukuunAsti(int asti) {
        for (int i = 1; i <= asti; i++) {
            System.out.println(i);
        }
    }

}
