package com.tactfactory.itstart.veterinaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CliniqueVeterinaire {

    public static void main(String[] args) {
        System.out.println("Clinique");

        Race races[] = { 
            new Race("Boxer", "court"), 
            new Race("Berger Allemand", "long"),
            new Race("Européen", "mi-long"),
            new Race("Sphinx", Race.TYPE_POILS_AUCUN)
        };
//        Chien chiens[] = new Chien[100];
//        Chat chats[] = new Chat[100];
        List<Animal> animals = new ArrayList<>();
        
        Chien belle = new Chien();
        belle.setRace(races[1]);
        belle.setDateDeNaissance(LocalDate.now());
        belle.setName("Belle");
        animals.add(belle);

        Chat mickey = new Chat();
        mickey.setRace(races[2]);
        mickey.setName("Mickey");
        mickey.setDateDeNaissance(LocalDate.now());
        animals.add(mickey);

        Chat sourissette = new Chat();
        sourissette.setRace(races[2]);
        sourissette.setName("Sourissette");
        sourissette.setDateDeNaissance(LocalDate.now());
        animals.add(sourissette);

        Chat ewaz = new Chat();
        ewaz.setRace(races[3]);
        ewaz.setName("Ewaz");
        ewaz.setDateDeNaissance(LocalDate.now());
        animals.add(ewaz);

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " dit :");
            animal.parler();
            animal.dormir();
            System.out.println("");
        }

//        for (int i = 0; i < 4; ++ i) {
//            Animal animal = animals.get(i);
//            
//            System.out.println(animal.getName() + " dit :");
//            animal.parler();
//            animal.dormir();
//            System.out.println("");
//        }
        
//        for (int i = 0; i < 3; ++ i) {
//            System.out.println(chats[i].getName() + " dit :");
//            chats[i].parler();
//            System.out.println("");
//        }
//
//        for (int i = 0; i < 1; ++ i) {
//            System.out.println(chiens[i].getName() + " dit :");
//            chiens[i].parler();
//            System.out.println("");
//        }
        
        
        bonjour(animals.get(1));
        bonjour(new Camion());
    }
    
    public static void bonjour(Dialogeur dialogeur) {
        System.out.println("Je dit bonjour.");
        System.out.println("On me répond");
        dialogeur.parler();
    }
}
