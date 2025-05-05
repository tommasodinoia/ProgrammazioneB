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

        System.out.println();
        System.out.println("Stampo la lista partendo dal primo elemento.");
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        System.out.println("Stampo la lista partendo dall'ultimo elemento.");
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();

        System.out.println("Aggiungo un rettangolo in testa con base = 0.001 e altezza = 0.001");
        rettangoloDoubleLinkedList.addFirst(new Rettangolo(0.001,0.001));
        System.out.println("Aggiungo un rettangolo in coda con base = 0.001 e altezza = 0.001");
        rettangoloDoubleLinkedList.addLast(new Rettangolo(0.999,0.999));
        System.out.println();
        System.out.println("Stampo la lista partendo dal primo elemento.");
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        System.out.println("Stampo la lista partendo dall'ultimo elemento.");
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();
        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());


        /*
        * Rimuovi prima
         */
        System.out.println();
        System.out.println("Rimuovo il primo elemento dalla lista.");
        System.out.println("Il primo elemento da rimuovere è " + rettangoloDoubleLinkedList.removeFirst());
        System.out.println();
        System.out.println("Stampo la lista partendo dal primo elemento.");
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        System.out.println("Stampo la lista partendo dall'ultimo elemento.");
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();
        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());
        /*
        * Rimuovi dopo
         */
        System.out.println();
        System.out.println("Rimuovo l'ultimo dalla lista.");
        System.out.println("L'ultimo elemento da rimuovere è " + rettangoloDoubleLinkedList.removeLast());
        System.out.println();
        System.out.println("Stampo la lista partendo dal primo elemento.");
        rettangoloDoubleLinkedList.printListFromHeader();
        System.out.println();
        System.out.println("Stampo la lista partendo dall'ultimo elemento.");
        rettangoloDoubleLinkedList.printListFromTrailer();
        System.out.println();
        System.out.println("La dimensione attuale della lista è " + rettangoloDoubleLinkedList.getSize());
    }

}
