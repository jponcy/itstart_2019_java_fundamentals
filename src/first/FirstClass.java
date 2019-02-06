package first;

import java.util.Random;
import java.util.Scanner;

/**
 * My first class.
 */
public class FirstClass {

    /**
     * The entry point of my useless program.
     * <ul><li>point 1</li></ul>
     * @param args The CLI parameters.
     */
    /*
     * Commentaire qui ne deviendra pas de la documentation (generation documentation HTML).
     */
    public static void main(String[] args) {
        ExoBoucles.moreOrLess();
    }

    private static void examples() {
        Integer i = 3;
        int j = 2;
        
        if (true) {
            System.out.println("Vrai");            
        } else {
            System.out.println("Faux");
        }
        

        int res = i + j;
    }
}
