package com.tactfactory.itstart.vehicule;

/**
 * My first class.
 */
public class FirstClass {

    /**
     * The entry point of my useless program.
     * <ul>
     * <li>point 1</li>
     * </ul>
     * 
     * @param args The CLI parameters.
     */
    /*
     * Commentaire qui ne deviendra pas de la documentation (generation
     * documentation HTML).
     */
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Skate skate1 = new Skate(42f, 210f, "Santa cruz", (byte) 4);
        Skate skate2 = new Skate();

        skate2.setLargeur(50f);
        skate2.setMarque("Oxelo");
        skate2.setNbRoues((byte) 4);
        skate2.setPrix(61.52f);

        String marques[] = { "Santa cruz", "Oxelo", "Lidle", "Bic", "Volvo", "Mont blanc" };

        System.out.print("Les marques disponibles sont : ");

        for (byte i = 0; i < marques.length; ++i) {
            if (i != 0) {
                System.out.print(", ");
            }

            System.out.print(marques[i]);
        }

        System.out.println(".");

        Skate skates[] = new Skate[200];

        for (short i = 0; i < 200; ++i) {
            float largeur = (float) (Math.random() * 40 + 20);
            float prix = ((int) ((Math.random() * 1_000 + 200) * 100)) / 100.0f;
            String marque = marques[(int) (Math.random() * marques.length)];
            byte nbRoues = (byte) (Math.random() * 3 + 3);

            skates[i] = new Skate(largeur, prix, marque, nbRoues);
        }

        for (short i = 0; i < skates.length; ++i) {
            System.out
                .println(skates[i].getMarque() + " à " + skates[i].getPrix() + " € (avec " + skates[i].getNbRoues()
                        + " roues)");
        }
    }

    @SuppressWarnings("all")
    private static void exempleFinal() {
        int i = 3;

        i = 4;

        System.out.println(i);

        final int j = 2;

//        j = 4; // Ne fonctionne pas.

        Voiture tuture = new Voiture();

        tuture.fabriquant = "volvo";

        Voiture old = tuture;
        old = tuture;

        tuture = new Voiture(); // possible car non final.

        System.out.println(tuture.fabriquant);
        System.out.println(old.fabriquant);

        final Voiture titi = new Voiture();

        titi.fabriquant = "volvo";
        titi.fabriquant = "BM";

//        titi = new Voiture(); // Impossible car final (seul la reference ne peut pas etre change).
//        titi = tuture;

        final Voiture tuture2 = tuture;

        MyMath.somme(3, 5);

        MyMath math = new MyMath();
        math.mult(3, 5);
    }

    @SuppressWarnings("all")
    private static void baseVoiture() {
        Voiture tuture = new Voiture();

        tuture.ch = 3;
        tuture.nbPortes = 5;
        tuture.fabriquant = "Super voiture maker";
        tuture.prix = 321_432.21f;
        tuture.couleur = "Rouge metalisé avec rayure jaune bleuté spéciale coupe du monde";

        Voiture twingo2 = new Voiture();

        twingo2.couleur = "Noir électrique";
        twingo2.fabriquant = "tesla";
        twingo2.prix = 12_843f;

        Voiture voitures[] = { twingo2, tuture };

        for (int i = 0; i < voitures.length; ++i) {
            Voiture current = voitures[i];

            System.out.println("");
            System.out.println("Voiture " + current.couleur + " fabriqué par " + current.fabriquant);
            System.out.println("Prix avant remise " + current.prix + " €");
            current.remiseOccasion(543112);
            System.out.println("Prix après remise " + current.prix + " €");
        }

        tuture.fabriquant = "Peux-jo?";

        System.out.println(tuture.fabriquant);
        System.out.println(twingo2.fabriquant);

//        // Pas bien.
//        tuture.compteur ++;
//        
//        System.out.println(tuture.compteur);
//        System.out.println(twingo2.compteur);

        // Bien.
        Voiture.compteur++;

        System.out.println(Voiture.compteur);
//        System.out.println(tuture.compteur);
//        System.out.println(twingo2.compteur);
    }

    @SuppressWarnings("all")
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
