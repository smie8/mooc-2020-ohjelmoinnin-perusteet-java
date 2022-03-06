
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet [0-100]:");
        int pisteet = Integer.valueOf(lukija.nextLine());
        String arvosana;
        if (pisteet < 0){
            arvosana = "mahdotonta";
        } else if (pisteet < 50) {
            arvosana = "hylätty";
        } else if (pisteet < 60) {
            arvosana = "1";
        } else if (pisteet < 70) {
            arvosana = "2";
        } else if (pisteet < 80) {
            arvosana = "3";
        } else if (pisteet < 90) {
            arvosana = "4";
        } else if (pisteet < 101) {
            arvosana = "5";
        } else {
            arvosana = "uskomatonta!";
        }
        
        System.out.println("Arvosana: " + arvosana);
    }
}
