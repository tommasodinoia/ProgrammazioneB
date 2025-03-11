package it.poliba.sisinflab.programmazioneB.iteratoriemappe;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class IteratoreMain {
    public static void main(String[] args){
        Random random = new Random();
        LinkedList<Double> lista = new LinkedList<Double>();

        for(int i = 0; i<random.nextInt(100); i++)
            lista.add(new Double(random.nextDouble()));

        System.out.println("La dimensione della lista è " + lista.size());



        ListIterator<Double> iteratore = lista.listIterator();

        while (iteratore.hasNext())
            System.out.println(iteratore.next());
    }

}
