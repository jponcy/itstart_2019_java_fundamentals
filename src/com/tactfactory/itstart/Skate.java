package com.tactfactory.itstart;

public class Skate {
    private float largeur;
    private float prix;
    private String marque;
    private byte nbRoues;

    public Skate() {
    }

    public Skate(float largeur, float prix, String marque, byte nbRoues) {
        this.largeur = largeur;
        this.prix = prix;
        this.marque = marque;
        this.nbRoues = nbRoues;
    }

    void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public byte getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(byte nbRoues) {
        this.nbRoues = nbRoues;
    }

    public float getLargeur() {
        return largeur;
    }
}
