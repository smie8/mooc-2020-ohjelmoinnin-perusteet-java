
import java.util.Scanner;

public class Nestesailiot {
    


    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sailio1 = 0;
        int sailio2 = 0;
        while (true) {
            
            System.out.println("Ensimmäinen: " + sailio1 + "/100");
            System.out.println("Toinen: " + sailio2 + "/100");


            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] osat = luettu.split(" ");
            
            if (osat[0].equals("lisaa")) {
                int maara = Integer.valueOf(osat[1]);
                if (maara < 0) {
                    break;
                }
                if (sailio1 + maara <= 100) {
                    sailio1 += maara;
                } else {
                    sailio1 = 100;
                }
            }
            
            if (osat[0].equals("siirra")) {
                int maara = Integer.valueOf(osat[1]);
                
               if (maara < 0) {
                    break;
                }

               if (maara >= sailio1) {
                   int ylijaama = sailio1;
                   sailio1 = 0;
                    if (maara + sailio2 >= 100) {
                        sailio2 = 100;
                    } else {
                        sailio2 += ylijaama;
                    }
               } else {
                   sailio1 -= maara;
                    if (maara + sailio2 >= 100) {
                        sailio2 = 100;
                    } else {
                        sailio2 += maara;
                    }
               }
               


            }
            
            if (osat[0].equals("poista")) {
                int maara = Integer.valueOf(osat[1]);
                if (sailio2 - maara <= 0) {
                    sailio2 = 0;
                } else {
                    sailio2 -= maara;
                }
            }

        }
        
        
    }
    
}
