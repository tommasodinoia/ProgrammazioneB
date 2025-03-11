package it.poliba.sisinflab.programmazioneB.adt;


import it.poliba.sisinflab.programmazioneB.liste.SimplyLinkedList;

public class LinkedQueue<E> implements Queue<E> {

    private SimplyLinkedList<E> list;

    public LinkedQueue(){
        list = new SimplyLinkedList<E>();
    }

    public int size() {
        return list.getSize();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E first() {
        return list.getFirst();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
