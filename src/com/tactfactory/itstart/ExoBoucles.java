package com.tactfactory.itstart;

import java.util.Scanner;

/**
 * <h2>Exercice 1</h2>
 * 
 * Faire un programme qui (avec les trois types de boucles ennonces) :
 * <ul>
 * <li>génère un nombre aléatoire entre 0 et 10 000 (inclus).</li>
 * <li>le programme n'affichera pas le nombre choisi</li>
 * <li>demandera à l'utilisateur de trouver ce nombre</li>
 * <li>si l'utilisateur trouve le bon nombre, on lui annonce une victoire</li>
 * <li>si sa proposition est plus petite que le nombre à trouver, on lui dit
 * "plus petit"</li>
 * <li>si sa proposition est plus grande que le nombre à trouver, on lui dit
 * "plus grand"</li>
 * <li>l'utilisateur à 10 chances</li>
 * <li>pas de validation de saisie à prévoir</li>
 * </ul>
 * 
 * 
 * <h2>Excercice 2</h2>
 * 
 * En repartant du "meilleur code" (celui fait avec la boucle la plus logique).
 * Rajouter les fonctionnalites suivantes :
 * <ul>
 * <li>au démarage du jeu, on demandera a l'utilisateur s'il veut jouer ou
 * utiliser la resolution automatique</li>
 * <li>dans le cas ou il choisi de jouer, oon execute le code de l'exercice 1</li>
 * <li>dans le cas ou il choisi la resolution automatique, on executera un
 * nouvel algorithme qui
 *    <ul>
 *    <li>afficher chacune de ses tentative</li>
 *    <li>utilisera un algorithme (par exemple dichotomie) pour determiner ses valeurs</li>
 *    </ul>
 * </li>
 * </ul>
 */
public class ExoBoucles {
    /**
     * Solution avec le type de boucle le plus coherent.
     */
    public static void moreOrLess() {
        int min = 0;
        int max = 10_000;
        int inputValue = 0;
        boolean hasWon;
        byte tries = 0; // Le nombre d'essai realise par l'utilisateur.

        // Recuperation de la ressource externe ; les saisies consoles.
        Scanner scanner = new Scanner(System.in);

        // Generer le nombre aleatoire ; entre 0 et 10 000 (inclus).
        short nbToFound = (short) (Math.random() * (max + 1));

        System.out.println("Voulez-vous jouer (si non, résolution automatique) ?");
        String mode = scanner.nextLine();
        
        do {
//            if ("oui".equals(mode)) { // Si l'utilisateur veut jouer.
//                // Recuperer la saisie de l'utilisateur.
//                String line = scanner.nextLine().replaceAll(" ", "");
//                inputValue = Integer.parseInt(line);
//            } else { // Si l'utilisateur a choisi la resolution automatique.
//                
//            }
            switch (mode.toLowerCase()) {
                case "o":
                case "y":
                case "oui":
                case "yes":
                    // Demander a l'utilisateur de saisir un nombre.
                    System.out.println("Saisir un nombre : ");
                    
                    String line = scanner.nextLine().replaceAll(" ", "");
                    inputValue = Integer.parseInt(line);
                    break;
                case "n":
                case "no":
                case "non":
                    inputValue = (max + min) / 2;
                    System.out.println("Proposition de l'ordinateur => " + inputValue);
                    break;
                default:
                    System.out.println("Saisie invalide");
                    System.exit(-1);
            }

            // Traiter la saisie.
            hasWon = inputValue == nbToFound;
            if (hasWon) { // Si l'utilisateur a trouve.
                // Annoncer victoire si l'utilisateur a trouve.
                System.out.print("Bravo, il fallait bien trouver le nombre ");
                System.out.println(nbToFound);
            } else if (inputValue < nbToFound) { // Si trop petit.
                System.out.println("Le nombre à trouver est plus grand que " + inputValue);
                min = inputValue;
            } else { // Sinon (si c'est trop grand).
                System.out.println("Le nombre à trouver est plus petit que " + inputValue);
                max = inputValue;
            }

            tries++;
        } while (!hasWon && tries < 10);

        if (!hasWon) {
            System.out.println("Vous avez perdu, le nombre à trouver été : " + nbToFound);
        }

        // Liberation de la ressource externe.
        scanner.close();
    }

    /**
     * Solution avec un while ; un peu plus lourde.
     */
    public static void moreOrLessBadImplementationWithWhile() {
        int inputValue;
        boolean hasWon = false;
        byte tries = 1; // Le nombre d'essai realise par l'utilisateur.

        // Recuperation de la ressource externe ; les saisies consoles.
        Scanner scanner = new Scanner(System.in);

        // Generer le nombre aleatoire ; entre 0 et 10 000 (inclus).
        short nbToFound = (short) (Math.random() * 10001);

        while (!hasWon && tries < 10) {
            // Demander a l'utilisateur de saisir un nombre.
            System.out.println("Saisir un nombre : ");

            // Recuperer la saisie de l'utilisateur.
            String line = scanner.nextLine().replaceAll(" ", "");
            inputValue = Integer.parseInt(line);

            // Traiter la saisie.
            hasWon = inputValue == nbToFound;
            if (hasWon) { // Si l'utilisateur a trouve.
                // Annoncer victoire si l'utilisateur a trouve.
                System.out.print("Bravo, il fallait bien trouver le nombre ");
                System.out.println(nbToFound);
            } else if (inputValue < nbToFound) { // Si trop petit.
                System.out.println("Le nombre à trouver est plus grand que " + inputValue);
            } else { // Sinon (si c'est trop grand).
                System.out.println("Le nombre à trouver est plus petit que " + inputValue);
            }

            tries++;
        }

        if (!hasWon) {
            System.out.println("Vous avez perdu, le nombre à trouver été : " + nbToFound);
        }

        // Liberation de la ressource externe.
        scanner.close();
    }

    /**
     * Mauvais choix de boucles (convention "academique"). On ne devrait pas choisir
     * une boucle for car on ne connait pas d'avance le nombre exact d'iteration (du
     * au cas de victoire).
     */
    public static void moreOrLessBadImplementationWithFor() {
        int inputValue;
        boolean hasWon = false;

        // Recuperation de la ressource externe ; les saisies consoles.
        Scanner scanner = new Scanner(System.in);

        // Generer le nombre aleatoire ; entre 0 et 10 000 (inclus).
        short nbToFound = (short) (Math.random() * 10001);

        for (byte tries = 1; !hasWon && tries < 10; tries++, hasWon = inputValue == nbToFound) {
            // Demander a l'utilisateur de saisir un nombre.
            System.out.println("Saisir un nombre : ");

            // Recuperer la saisie de l'utilisateur.
            String line = scanner.nextLine().replaceAll(" ", "");
            inputValue = Integer.parseInt(line);

            if (hasWon) { // Si l'utilisateur a trouve.
                // Annoncer victoire si l'utilisateur a trouve.
                System.out.print("Bravo, il fallait bien trouver le nombre ");
                System.out.println(nbToFound);
            } else if (inputValue < nbToFound) { // Si trop petit.
                System.out.println("Le nombre à trouver est plus grand que " + inputValue);
            } else { // Sinon (si c'est trop grand).
                System.out.println("Le nombre à trouver est plus petit que " + inputValue);
            }

            tries++;
        }

        if (!hasWon) {
            System.out.println("Vous avez perdu, le nombre à trouver été : " + nbToFound);
        }

        // Liberation de la ressource externe.
        scanner.close();
    }
}
