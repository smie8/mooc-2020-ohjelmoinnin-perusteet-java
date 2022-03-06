
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Sailio sailio1 = new Sailio();
        Sailio sailio2 = new Sailio();
        
        while (true) {
            System.out.println("Ensimmäinen: " + sailio1);
            System.out.println("Toinen: " + sailio2);
            
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

                sailio1.lisaa(maara);
                
            }
            
            if (osat[0].equals("siirra")) {
                int maara = Integer.valueOf(osat[1]);
                
                if (maara < 0) {
                     break;
                 }

                if (maara >= sailio1.sisalto()) {
                    int osa = sailio1.sisalto();
                    sailio2.lisaa(osa);

                } else {
                     sailio2.lisaa(maara); 
                }
               
                sailio1.poista(maara);

               
            }

            if (osat[0].equals("poista")) {
                int maara = Integer.valueOf(osat[1]);

                sailio2.poista(maara);
                
            }

        }
    }

}
