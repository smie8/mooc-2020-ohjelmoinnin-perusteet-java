
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Lahjan suuruus?");
        int raha = Integer.valueOf(lukija.nextLine());
        if (raha >= 5000 && raha < 25000) {
            System.out.println("Vero: " + (100 + ((raha - 5000) * 0.08)));
        } else if (raha >= 25000 && raha < 55000) {
            System.out.println("Vero: " + (1700 + ((raha - 25000) * 0.1)));
        } else if (raha >= 55000 && raha < 200000) {
            System.out.println("Vero: " + (4700 + ((raha - 55000) * 0.12)));
        } else if (raha >= 200000 && raha < 1000000) { 
            System.out.println("Vero: " + (22100 + ((raha - 200000) * 0.15)));
        } else if (raha >= 100000) {
            System.out.println("Vero: " + (142100 + ((raha - 1000000) * 0.17)));
        } else {
            System.out.println("Ei veroa!");
        }    
    }
    
}
