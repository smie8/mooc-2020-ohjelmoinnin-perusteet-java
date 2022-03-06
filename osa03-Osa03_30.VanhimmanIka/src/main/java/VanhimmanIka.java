
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int vanhin = 0;

        while (true) {
            
            String hlo = lukija.nextLine();
                        
            if (hlo.isEmpty()) {
                break;
            } else {
                String[] palat = hlo.split(",");
                if (Integer.valueOf(palat[1]) > vanhin) {
                    vanhin = Integer.valueOf(palat[1]);
                }
            } 
            
        }
        System.out.println("Vanhimman ikä: " + vanhin);
    }
}
