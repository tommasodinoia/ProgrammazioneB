package it.poliba.sisinflab.programmazioneB.liste;

/**
 * File Main per giocare con i metodi delle liste
 *
 *
 */
public class Main {
    public static void main(String[] args){

        SimplyLinkedList<Integer> lista = new SimplyLinkedList<Integer>();
        lista.removeFirst();
        lista.removeLast();
        lista.addFirst(new Integer(5));
        lista.addFirst(new Integer(15));
        lista.addFirst(new Integer(8));
        lista.addFirst(new Integer(0));
        lista.addFirst(new Integer(22));
        lista.addFirst(new Integer(13));
        lista.addFirst(new Integer(7));
        lista.addFirst(new Integer(2));
        lista.addFirst(new Integer(91));

        Integer elemento = new Integer(4);
        SimpleNode<Integer> pointer = lista.getHead();
        while (pointer.getElement() <= elemento)
            pointer = pointer.getNext();

        lista.addBefore(elemento,pointer.getElement());
       // lista.addLast(elemento);

        lista.printList();

        System.out.println("POSIZIONE: " + lista.getPosition(new Integer(5)));

        lista.addAfter(new Integer(17), new Integer(4));
        lista.addAfter(new Integer(18), new Integer(5));
        lista.addAfter(new Integer(66), new Integer (100));
        lista.addBefore(new Integer(33), new Integer (4));
        lista.addBefore(new Integer(44), new Integer (22));
        lista.addBefore(new Integer(55), new Integer (100));
        lista.addBefore(new Integer(77), new Integer (5));

        lista.printList();
        System.out.println();

        System.out.println("FIRST: " + lista.removeFirst());
        System.out.println("LAST: " + lista.removeLast());
        System.out.println();

        lista.printList();
        System.out.println();

        DoubleLinkedList<Integer> dLista = new DoubleLinkedList<Integer>();
        dLista.removeFirst();
        dLista.removeLast();

        dLista.addFirst(new Integer(1));
        dLista.addLast(new Integer(4));

        dLista.printListFromTrailer();
        dLista.printListFromHeader();

        Integer elemento2 = new Integer(5);

        DoubleLinkedNode<Integer> pointer2 = dLista.getHeader();
        do{
            pointer2 = pointer2.getNext();
        } while (pointer2!=dLista.getTrailer() && pointer2.getElement() <= elemento2);
        //!!! OSSERVAZIONE !!! La condizione del while precedente può generare eccezione se si inverte l'ordine degli operatori del &&

        if(pointer2==dLista.getTrailer())
            dLista.addLast(elemento2);
        else
            dLista.addAfter(elemento2,pointer.getElement());

        dLista.printListFromTrailer();
        dLista.printListFromHeader();

    }
}
