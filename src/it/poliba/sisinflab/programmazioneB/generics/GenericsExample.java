package it.poliba.sisinflab.programmazioneB.generics;


import it.poliba.sisinflab.programmazioneB.ereditarieta.Progression;
import it.poliba.sisinflab.programmazioneB.util.*;

public class GenericsExample {
    public static void main(String[] args){
        Coppia<String,Progression> doppia;
        Coppia<Rettangolo,Rettangolo> coppia;

        doppia = new Coppia<>("Progressione",new Progression());
        coppia = new Coppia<>(new Rettangolo(3.2,4.5), new Rettangolo(5.5,7.8));

        System.out.print(doppia.getPrimo() + ": ");
        doppia.getSecondo().printProgression(3);

        System.out.println("La base del primo rettangolo per l'altezza del secondo rettangolo è uguale a " + coppia.getPrimo().getBase() * coppia.getSecondo().getAltezza());

    }
}
