package it.poliba.sisinflab.programmazioneB.liste;

import java.util.NoSuchElementException;


public class DoubleLinkedList<E> {
    private DoubleLinkedNode<E> header;
    private DoubleLinkedNode<E> trailer;
    private int size;

    public DoubleLinkedList(){
        header = new DoubleLinkedNode<E>();
        trailer = new DoubleLinkedNode<E>();
        header.setNext(trailer);
        header.setPrevious(null);
        trailer.setPrevious(header);
        trailer.setNext(null);
        size = 0;
    }

    public DoubleLinkedNode getHeader(){
        return header;
    }

    public DoubleLinkedNode<E> getTrailer() {
        return trailer;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }

    public E getFirst(){
        if(this.isEmpty())
            return null;
        return header.getNext().getElement();
    }

    public E getLast(){
        if(this.isEmpty())
            return null;
        return trailer.getPrevious().getElement();
    }

    public void addBetween(E newElement, DoubleLinkedNode<E> predecessor, DoubleLinkedNode<E> successor){
        DoubleLinkedNode<E> newNode = new DoubleLinkedNode<E>(newElement,successor,predecessor);
        predecessor.setNext(newNode);
        successor.setPrevious(newNode);
        size++;
    }

    public void addFirst(E e){
        this.addBetween(e,header,header.getNext());
    }

    public void addLast(E e){
        this.addBetween(e,trailer.getPrevious(),trailer);
    }


    public void addBefore(E newElement, E e){
        if(this.isEmpty()) {
            this.addFirst(newElement);
            return;
        }

        DoubleLinkedNode<E> cursore = header.getNext();

        while (cursore != trailer && !cursore.getElement().equals(e)) {
            cursore = cursore.getNext();
        }

        if (cursore == trailer) return; // e non trovato

        this.addBetween(newElement, cursore.getPrevious(), cursore);
    }

    public void addAfter(E newElement, E e){
        if(this.isEmpty()) {
            this.addFirst(newElement);
            return;
        }

        DoubleLinkedNode<E> cursore = header.getNext();

        while (cursore != trailer && !cursore.getElement().equals(e)) {
            cursore = cursore.getNext();
        }

        if (cursore == trailer) return; // e non trovato

        this.addBetween(newElement, cursore, cursore.getNext());
    }


    public E remove(E element){
        DoubleLinkedNode<E> cursore = header.getNext();

        while (cursore != trailer && !cursore.getElement().equals(element)) {
            cursore = cursore.getNext();
        }

        if (cursore == trailer) {
            throw new NoSuchElementException("Elemento non trovato nella lista.");
        }

        cursore.getPrevious().setNext(cursore.getNext());
        cursore.getNext().setPrevious(cursore.getPrevious());
        size--;
        return cursore.getElement();
    }

    public E removeFirst(){
        if(this.isEmpty())
            throw new NoSuchElementException("La lista è vuota. Nessun elemento da rimuovere.");
        return this.remove(header.getNext().getElement());
    }

    public E removeLast(){
        if(this.isEmpty())
            throw new NoSuchElementException("La lista è vuota. Nessun elemento da rimuovere.");
        return this.remove(trailer.getPrevious().getElement());
    }

    public int getPosition(E e){
        if(this.isEmpty()) return 0;

        DoubleLinkedNode<E> cursore = header.getNext();
        int index = 1;

        while (cursore != trailer && !cursore.getElement().equals(e)) {
            cursore = cursore.getNext();
            index++;
        }

        if (cursore == trailer) return 0;

        return index;
    }

    public void printListFromHeader(){
        DoubleLinkedNode<E> cursore = header.getNext();
        while (cursore != trailer) {
            System.out.println(cursore.getElement());
            cursore = cursore.getNext();
        }
    }

    public void printListFromTrailer(){
        DoubleLinkedNode<E> cursore = trailer.getPrevious();
        while (cursore != header) {
            System.out.println(cursore.getElement());
            cursore = cursore.getPrevious();
        }
    }

}