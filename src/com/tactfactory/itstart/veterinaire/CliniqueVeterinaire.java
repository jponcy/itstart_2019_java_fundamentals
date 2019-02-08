package com.tactfactory.itstart.veterinaire;

import java.time.LocalDate;

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
        Animal animals[] = new Animal[100];
        
        Chien belle = new Chien();
        belle.setRace(races[1]);
        belle.setDateDeNaissance(LocalDate.now());
        belle.setName("Belle");
        animals[0] = belle;

        Chat mickey = new Chat();
        mickey.setRace(races[2]);
        mickey.setName("Mickey");
        mickey.setDateDeNaissance(LocalDate.now());
        animals[1] = mickey;

        Chat sourissette = new Chat();
        sourissette.setRace(races[2]);
        sourissette.setName("Sourissette");
        sourissette.setDateDeNaissance(LocalDate.now());
        animals[2] = sourissette;

        Chat ewaz = new Chat();
        ewaz.setRace(races[3]);
        ewaz.setName("Ewaz");
        ewaz.setDateDeNaissance(LocalDate.now());
        animals[3] = ewaz;

        for (int i = 0; i < 4; ++ i) {
            System.out.println(animals[i].getName() + " dit :");
            animals[i].parler();
            animals[i].dormir();
            System.out.println("");
        }
        
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
    }
}
