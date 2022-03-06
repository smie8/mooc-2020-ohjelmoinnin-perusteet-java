
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int vanhin = 0;
        String vanhin_nimi = "";

        while (true) {
            
            String hlo = lukija.nextLine();
                        
            if (hlo.isEmpty()) {
                break;
            } else {
                String[] palat = hlo.split(",");
                if (Integer.valueOf(palat[1]) > vanhin) {
                    vanhin = Integer.valueOf(palat[1]);
                   
                    vanhin_nimi = palat[0];
                }
            } 
            
        }
        System.out.println("Vanhimman nimi: " + vanhin_nimi);
    }
}
