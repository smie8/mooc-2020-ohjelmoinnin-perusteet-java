
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
        ArrayList<Integer> lista = new ArrayList<>();
        int summa = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku != -1) {
                lista.add(luku);
                summa += luku;
            } else {
                break;
            }   
        }
        
        System.out.println("Keskiarvo; " + (summa * 1.0) / lista.size());
        
        
    }
}
