package com.tactfactory.itstart.zoo;

import java.util.ArrayList;
import java.util.List;

interface Animal {
}

interface Terrestre extends Animal {
}

interface Marin extends Animal {
}

class Lion implements Terrestre {
}

class Dauphin implements Marin {
}

class Crocodile implements Terrestre, Marin {
}

class Enclo {
    static final String TYPE_EAU = "eau";
    static final String TYPE_TERRE = "terre";
    static final String TYPE_MIXTE = "eau/terre";

    Animal animal;
    String type;

    public Enclo(String type) {
        this.type = type;
    }
}

public class Zoo {

    List<Enclo> enclos = new ArrayList<>();

    public Zoo() {
        enclos.add(new Enclo(Enclo.TYPE_MIXTE));
        enclos.add(new Enclo(Enclo.TYPE_TERRE));
        enclos.add(new Enclo(Enclo.TYPE_TERRE));
        enclos.add(new Enclo(Enclo.TYPE_EAU));
        enclos.add(new Enclo(Enclo.TYPE_EAU));
        enclos.add(new Enclo(Enclo.TYPE_EAU));
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.place(new Lion());
        zoo.place(new Dauphin());
        zoo.place(new Crocodile());
    }

    private boolean place(Animal animal) {
        String type = this.determineTypeEnclo(animal);

        Enclo enclo = this.trouveEncloCompatible(animal, type);
        
        if (enclo != null) {
            enclo.animal = animal;
        }

        return enclo != null;
    }

    private Enclo trouveEncloCompatible(Animal animal, String type) {
        for (Enclo enclo : this.enclos) {
            if (enclo.animal == null) { // Si l'enclo est libre.
//                if (animal.getClass().getName().equals("Lion")) {
//                }
                if (enclo.type.equals(type)) { // Si l'enclo est compatible.
                    return enclo;
                }
            }
        }
        
        return null;
    }

    private String determineTypeEnclo(Animal animal) {
        String type;

        if (animal instanceof Terrestre && animal instanceof Marin) {
            type = Enclo.TYPE_MIXTE;
        } else if (animal instanceof Terrestre) {
            type = Enclo.TYPE_TERRE;
        } else {
            type = Enclo.TYPE_EAU;
        }
        return type;
    }
}
