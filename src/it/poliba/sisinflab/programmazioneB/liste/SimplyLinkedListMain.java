package it.poliba.sisinflab.programmazioneB.liste;

import java.util.Random;

public class SimplyLinkedListMain {
    public static void main(String[] args){
        SimplyLinkedList<Double> doubleSimplyLinkedList = new SimplyLinkedList<Double>();

        Random random = new Random();
        System.out.println("Genero un numero casuale tra 0 e 15.");
        int randomSize = random.nextInt(15);
        //int randomSize = 0;
        System.out.println("Il numero di elementi casuali che caricherò inizialmente è " + randomSize);
        System.out.println();

        for(int i=0; i < randomSize; i++) {
            doubleSimplyLinkedList.addFirst(new Double(random.nextDouble()));
        }
        doubleSimplyLinkedList.printList();
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        System.out.println();

        System.out.println("Aggiungo in testa i valori 0.001 e 0.999");
        doubleSimplyLinkedList.addFirst(new Double(0.001));
        doubleSimplyLinkedList.addLast(new Double(0.999));

        doubleSimplyLinkedList.printList();
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        System.out.println();

        /*
        * Trova il primo elemento della lista maggiore di 0.5
         */
        System.out.println("Cerco il primo elemento della lista maggiore di 0.5");
        Double elemento = new Double(0.5);
        SimpleNode<Double> pointer = doubleSimplyLinkedList.getHead();
        while (pointer.getElement() <= elemento)
            pointer = pointer.getNext();
        System.out.println("Il primo valore della lista maggiore di 0.5 è "+ pointer.getElement());
        System.out.println();
        /*
        * Inserisci dopo
         */
        System.out.println("Inserisco 0.5 dopo " + pointer.getElement());
        doubleSimplyLinkedList.addAfter(elemento,pointer.getElement());
        doubleSimplyLinkedList.printList();
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        System.out.println();

        /*
        * Inserisci prima
         */
        System.out.println("Inserisco 0.5 prima " + pointer.getElement());
        doubleSimplyLinkedList.addBefore(elemento,pointer.getElement());
        doubleSimplyLinkedList.printList();
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        System.out.println();

        /*
        * Rimuovi primo
         */
        System.out.println("Rimuovi primo elemento");
        System.out.println("Il primo elemento è " + doubleSimplyLinkedList.removeFirst());
        doubleSimplyLinkedList.printList();
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        System.out.println();

        /*
        * Rimuovi ultimo
         */
        System.out.println("Rimuovi ultimo elemento");
        System.out.println("L'ultimo elemento è " + doubleSimplyLinkedList.removeLast());
        doubleSimplyLinkedList.printList();
        System.out.println("La dimensione attuale della lista è " + doubleSimplyLinkedList.getSize());
        System.out.println();

    }

}
