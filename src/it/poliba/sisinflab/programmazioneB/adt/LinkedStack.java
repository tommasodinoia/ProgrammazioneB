package it.poliba.sisinflab.programmazioneB.adt;


import it.poliba.sisinflab.programmazioneB.liste.SimplyLinkedList;

public class LinkedStack<E> implements Stack<E> {

    private SimplyLinkedList<E> list;

    public LinkedStack(){
        list  = new SimplyLinkedList<E>();
    }

    public int size() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E e) {
        list.addFirst(e);
    }

    public E top() {
        return list.getFirst();
    }

    public E pop() {
        return list.removeFirst();
    }
}

