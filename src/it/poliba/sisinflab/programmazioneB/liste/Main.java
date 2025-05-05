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

        Integer elemento = new Integer(4);
        SimpleNode<Integer> pointer = lista.getHead();
        while (pointer.getElement() <= elemento)
            pointer = pointer.getNext();

        lista.addBefore(elemento,pointer.getElement());
        lista.addLast(elemento);

        lista.removeFirst();
        lista.removeLast();


        lista.printList();



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
