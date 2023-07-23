package Animale;

import Animale.Mamifere.Caine;

import static Animale.Mamifere.Caine.latra;

public class MainCaine {

    public static void main(String[] args) {
        Caine doberman = new Caine("Doberman",4,"Negru");
        doberman.setRasa("Doberman");
        doberman.setVarsta(4);
        doberman.setCuloare("Negru");

doberman.musca(true);
latra(true);
latra(false);
        System.out.println("Rasa cainelui este: " + doberman.getRasa());
        System.out.println("Varsta cainelui este: " + doberman.getVarsta());
        System.out.println("Culoarea cainelui este: " + doberman.getCuloare());
    }
}

