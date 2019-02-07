package com.tactfactory.itstart;

public class Voiture {
    static final int NCH = 4;

    static int compteur = 0;

    String couleur;

    /** Nombre de cheveaux (3, 4, 5, 6). */
    int ch = Voiture.NCH;
    // OR.
//    int ch = NCH;

    /** Nombre de portes (potentiellement 3 ou 5). */
    int nbPortes;

    String fabriquant;

    /** Prix en euro (€). */
    float prix;

    private boolean neuve = true;

    Voiture() {
    }

    /**
     * 
     * @param nbPortes Le nombre de portes possedant la voiture (probablement 3 ou
     *                 5).
     */
    Voiture(int nbPortes) {
        this(nbPortes, Voiture.NCH);
    }

    Voiture(int nbPortes, int ch) {
        this.nbPortes = nbPortes;
        this.ch = ch;
    }

    Voiture(String couleur) {
        this.couleur = couleur;
    }

    void remiseOccasion() {
        this.remiseOccasion(prix / 2);
    }

    void remiseOccasion(float montantRemise) {
        if (neuve && prix - montantRemise > 0) {
            prix -= montantRemise;
            neuve = false;
        }
    }
}
