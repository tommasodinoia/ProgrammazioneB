package it.poliba.sisinflab.programmazioneB.liste;

import java.util.Random;

public class SimplyLinkedListMain {
    public static void main(String[] args){
        SimplyLinkedList<Double> doubleSimplyLinkedList = new SimplyLinkedList<Double>();

        Random random = new Random();
        int randomSize = random.nextInt(15);
        //int randomSize = 0;
        System.out.println("Il numero di elementi che caricherò inizialmente è " + randomSize);
        System.out.println();

        for(int i=0; i < randomSize; i++) {
            doubleSimplyLinkedList.addFirst(new Double(random.nextDouble()));
        }
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        doubleSimplyLinkedList.printList();
        System.out.println();

        doubleSimplyLinkedList.addFirst(new Double(0.001));
        doubleSimplyLinkedList.addLast(new Double(0.999));

        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        doubleSimplyLinkedList.printList();
        System.out.println();

        /*
        * Trova il primo elemento della lista maggiore di 0.5
         */
        Double elemento = new Double(0.5);
        SimpleNode<Double> pointer = doubleSimplyLinkedList.getHead();
        while (pointer.getElement().compareTo(elemento) != 1 )
            pointer = pointer.getNext();

        /*
        * Inserisci dopo
         */
        System.out.println("Inserisci dopo");
        doubleSimplyLinkedList.addAfter(elemento,pointer.getElement());
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        doubleSimplyLinkedList.printList();
        System.out.println();

        /*
        * Inserisci prima
         */
        System.out.println("Inserisci prima");
        doubleSimplyLinkedList.addBefore(elemento,pointer.getElement());
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        doubleSimplyLinkedList.printList();
        System.out.println();

        /*
        * Rimuovi primo
         */
        System.out.println("Rimuovi primo");
        System.out.println("Il primo elemento è " + doubleSimplyLinkedList.removeFirst());
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        doubleSimplyLinkedList.printList();
        System.out.println();

        /*
        * Rimuovi ultimo
         */
        System.out.println("Rimuovi ultimo");
        System.out.println("L'ultimo elemento è " + doubleSimplyLinkedList.removeLast());
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        doubleSimplyLinkedList.printList();
        System.out.println();

    }

}
