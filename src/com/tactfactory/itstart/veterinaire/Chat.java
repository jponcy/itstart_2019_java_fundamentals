package com.tactfactory.itstart.veterinaire;

public class Chat extends Animal {

    @Override
    public void parler() {
        System.out.println("Puis fait miaou");

        super.parler();
    }

    @Override
    void dormir() {
        System.out.println("Je dors à moitier, mais 20h par jour.");
    }
}
