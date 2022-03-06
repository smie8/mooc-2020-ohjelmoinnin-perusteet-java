
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String merkkijono = lukija.nextLine();
            
            if (merkkijono.isEmpty()) {
                break;
            } else {
                String tuloste[] = merkkijono.split(" ");
                for (String s: tuloste) {
                    if (s.contains("av")){
                        System.out.println(s);
                    }
                }
            }
        }
    }
}
