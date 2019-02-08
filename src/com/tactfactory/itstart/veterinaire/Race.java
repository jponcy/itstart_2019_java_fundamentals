package com.tactfactory.itstart.veterinaire;

public class Race {
    public static final String TYPE_POILS_AUCUN = "aucun poils";
    
    private String nom;
    private String typePoils;

    public Race(String nom) {
        this(nom, null);
    }

    public Race(String nom, String typePoils) {
        this.nom = nom;
        this.typePoils = typePoils;
    }

    public String getNom() {
        return this.nom;
    }

    public String getTypePoils() {
        return typePoils;
    }

    public void setTypePoils(String typePoils) {
        this.typePoils = typePoils;
    }
    
    /**
     * Dit si cette race possede des poils.
     * @return VRAI si cette race possede des poils, FAUX dans le cas contraire.
     */
    public boolean hasPoils() {
        return !this.typePoils.equals(Race.TYPE_POILS_AUCUN);
    }
}
