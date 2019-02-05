package first;

import java.util.Scanner;

/**
 * Faire un programme qui :
 * <ul>
 * <li>génère un nombre aléatoire entre 0 et 10 000 (inclus).</li>
 * <li>le programme n'affichera pas le nombre choisi</li>
 * <li>demandera à l'utilisateur de trouver ce nombre</li>
 * <li>si l'utilisateur trouve le bon nombre, on lui annonce une victoire</li>
 * <li>si sa proposition est plus petite que le nombre à trouver, on lui dit "plus petit"</li>
 * <li>si sa proposition est plus grande que le nombre à trouver, on lui dit "plus grand"</li>
 * <li>l'utilisateur à 10 chances</li>
 * <li>pas de validation d saisie à prévoir</li>
 * </ul>
 */
public class ExoBoucles {
    public static void moreOrLess() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saisir un nombre ?");
//        String input = scanner.nextLine();
//        int value = Integer.parseInt(input);
        int value = scanner.nextInt();
        
//        byte val = (byte) (Math.random() * 42);
        
        scanner.close();
    }
}
