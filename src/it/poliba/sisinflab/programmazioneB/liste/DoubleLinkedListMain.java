package it.poliba.sisinflab.programmazioneB.liste;

import java.util.Random;
import it.poliba.sisinflab.programmazioneB.util.Rettangolo;


public class DoubleLinkedListMain {
    public static void main(String[] args){
        DoubleLinkedList<Rettangolo> rettangoloDoubleLinkedList = new DoubleLinkedList<Rettangolo>();

        Random random = new Random();
        int randomSize = random.nextInt(15);
        System.out.println("Il numero di elementi che caricherò inizialmente è " + randomSize);
        System.out.println();

        for(int i=0; i < randomSize; i++) {
            rettangoloDoubleLinkedList.addFirst(new Rettangolo(random.nextDouble(),random.nextDouble()));
        }
        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());

        /*
        * !!! OSSERVAZIONE !!! Nella classe Rettangolo è stato implementato il metodo toString()
         */

        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();

        rettangoloDoubleLinkedList.addFirst(new Rettangolo(0.001,0.001));
        rettangoloDoubleLinkedList.addLast(new Rettangolo(0.999,0.999));

        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();


        /*
        * Rimuovi prima
         */
        System.out.println("Il primo elemento è " + rettangoloDoubleLinkedList.removeFirst());
        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();
        /*
        * Rimuovi dopo
         */
        System.out.println("L'ultimo elemento è " + rettangoloDoubleLinkedList.removeLast());
        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();
    }

}
