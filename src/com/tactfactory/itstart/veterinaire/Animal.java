package com.tactfactory.itstart.veterinaire;

import java.time.LocalDate;

public abstract class Animal {
    private String name;
    private LocalDate dateDeNaissance;
    private Race race;
    
    abstract void dormir();
    
    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Animal) {
            Animal other = (Animal) obj;

            result = other.getName() != null 
                    && other.getName().equals(this.getName());
        }

        return result;
    }

    public void parler() {
        System.out.println("* gratte *");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
